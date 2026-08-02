package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import internal.org.jni_zero.CalledByNative;
import org.chromium.base.CommandLine;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.RegistrationPolicyAlwaysRegister;
import org.chromium.net.httpflags.BaseFeature;
import xsna.fo8;
import xsna.go9;
import xsna.lhg;
import xsna.tek;

/* loaded from: classes11.dex */
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LIBRARY_NAME;
    public static final String TAG;
    private static final String TESTING_LIBRARY_NAME;
    public static final String TRACE_NET_LOG_SYSTEM_PROPERTY_KEY = "debug.cronet.trace_netlog";
    private static final ConditionVariable sHttpFlagsLoaded;
    private static final HandlerThread sInitThread;
    private static boolean sInitialized;
    private static final Object sLoadLock = new Object();
    private static boolean sSwitchToTestLibrary;
    private static final ConditionVariable sWaitForLibLoad;

    public interface Natives {
        void cronetInitOnInitThread(int i);

        String getCronetVersion();

        int getTraceNetLogCaptureModeForTesting();

        void nativeInit(boolean z);

        void setMinLogLevel(int i);
    }

    static {
        String b = go9.b("cronet.", ImplVersion.getCronetVersion());
        LIBRARY_NAME = b;
        TESTING_LIBRARY_NAME = fo8.a(b, "_for_testing");
        TAG = "CronetLibraryLoader";
        sInitThread = new HandlerThread("CronetInit");
        sWaitForLibLoad = new ConditionVariable();
        sHttpFlagsLoaded = new ConditionVariable();
    }

    public static boolean ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        return ensureInitialized(context, cronetEngineBuilderImpl, false);
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        ensureInitialized(ContextUtils.getApplicationContext(), null, true);
    }

    @CalledByNative
    private static byte[] getBaseFeatureOverrides() {
        return BaseFeature.getOverrides(HttpFlagsForImpl.getHttpFlags(ContextUtils.getApplicationContext(), NativeCronetEngineBuilderImpl.getCronetSource())).toByteArray();
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return UserAgent.from(ContextUtils.getApplicationContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getTraceNetLogCaptureMode() {
        int i;
        String str = AndroidOsSystemProperties.get(TRACE_NET_LOG_SYSTEM_PROPERTY_KEY, "heavily_redacted");
        if (!str.equals("heavily_redacted")) {
            if (str.equals("on")) {
                i = 1;
            } else if (str.equals("include_sensitive")) {
                i = 2;
            } else if (str.equals("everything")) {
                i = 3;
            } else {
                Log.w(TAG, "Unknown value for %s system property, ignoring: %s", TRACE_NET_LOG_SYSTEM_PROPERTY_KEY, str);
            }
            if (i > 0) {
                String type = AndroidOsBuild.get().getType();
                if (!type.equals("userdebug") && !type.equals("eng") && (2 & ContextUtils.getApplicationContext().getApplicationInfo().flags) == 0) {
                    Log.w(TAG, "Ignoring requested Cronet trace netlog capture mode (%s=%s) because neither the device nor app are debuggable", TRACE_NET_LOG_SYSTEM_PROPERTY_KEY, str);
                    return 0;
                }
            }
            return i;
        }
        i = 0;
        if (i > 0) {
        }
        return i;
    }

    public static int getTraceNetLogCaptureModeForTesting() {
        return CronetLibraryLoaderJni.get().getTraceNetLogCaptureModeForTesting();
    }

    public static void initializeOnInitThread() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetLibraryLoader#initializeOnInitThread");
        try {
            HttpFlagsForImpl.getHttpFlags(ContextUtils.getApplicationContext(), NativeCronetEngineBuilderImpl.getCronetSource());
            sHttpFlagsLoaded.open();
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.setAutoDetectConnectivityState(new RegistrationPolicyAlwaysRegister(), false);
            int traceNetLogCaptureMode = getTraceNetLogCaptureMode();
            ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetLibraryLoader#initializeOnInitThread waiting on library load");
            try {
                sWaitForLibLoad.block();
                if (scoped2 != null) {
                    scoped2.close();
                }
                scoped2 = ScopedSysTraceEvent.scoped("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
                try {
                    CronetLibraryLoaderJni.get().cronetInitOnInitThread(traceNetLogCaptureMode);
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void loadLibrary() {
        if (!sSwitchToTestLibrary) {
            System.loadLibrary(LIBRARY_NAME);
        } else {
            System.loadLibrary(TESTING_LIBRARY_NAME);
            CronetLibraryLoaderJni.get().setMinLogLevel(-2);
        }
    }

    private static boolean onInitThread() {
        return sInitThread.getLooper() == Looper.myLooper();
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    public static void preload() {
        loadLibrary();
    }

    private static void setNativeLoggingLevel() {
        int i;
        if (sSwitchToTestLibrary) {
            return;
        }
        if (Log.isLoggable("chromium", 2)) {
            i = -2;
        } else if (!Log.isLoggable("chromium", 3)) {
            return;
        } else {
            i = -1;
        }
        CronetLibraryLoaderJni.get().setMinLogLevel(i);
    }

    @CalledByNative
    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Log.d(TAG, lhg.a(i, "Setting network thread priority to "), new Object[0]);
        Process.setThreadPriority(i);
    }

    public static void switchToTestLibrary() {
        sSwitchToTestLibrary = true;
    }

    public static boolean ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl, boolean z) {
        ScopedSysTraceEvent scoped;
        ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetLibraryLoader#ensureInitialized");
        try {
            synchronized (sLoadLock) {
                if (sInitialized) {
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                    return false;
                }
                CommandLine.init(new String[]{"cronet"});
                ContextUtils.initApplicationContext(context);
                HandlerThread handlerThread = sInitThread;
                if (!handlerThread.isAlive()) {
                    scoped = ScopedSysTraceEvent.scoped("CronetLibraryLoader#ensureInitialized starting init thread");
                    try {
                        handlerThread.start();
                        postToInitThread(new tek());
                        if (scoped != null) {
                            scoped.close();
                        }
                    } finally {
                    }
                }
                if (!z) {
                    ScopedSysTraceEvent scoped3 = ScopedSysTraceEvent.scoped("CronetLibraryLoader#ensureInitialized loading native library");
                    try {
                        if (cronetEngineBuilderImpl.libraryLoader() != null) {
                            cronetEngineBuilderImpl.libraryLoader().loadLibrary(LIBRARY_NAME);
                        } else {
                            loadLibrary();
                        }
                        if (scoped3 != null) {
                            scoped3.close();
                        }
                    } finally {
                    }
                }
                scoped = ScopedSysTraceEvent.scoped("CronetLibraryLoader#ensureInitialized calling nativeInit");
                try {
                    CommandLine.getInstance().switchToNativeImpl();
                    CronetLibraryLoaderJni.get().nativeInit(CronetManifest.shouldUsePerfetto(context));
                    if (scoped != null) {
                        scoped.close();
                    }
                    String cronetVersion = ImplVersion.getCronetVersion();
                    if (!cronetVersion.equals(CronetLibraryLoaderJni.get().getCronetVersion())) {
                        throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + CronetLibraryLoaderJni.get().getCronetVersion() + ".");
                    }
                    Log.i(TAG, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch"));
                    setNativeLoggingLevel();
                    TraceEvent.onNativeTracingReady();
                    sWaitForLibLoad.open();
                    sInitialized = true;
                    if (scoped2 != null) {
                        scoped2.close();
                    }
                    return true;
                } finally {
                    if (scoped != null) {
                        try {
                            scoped.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            if (scoped2 != null) {
                try {
                    scoped2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
