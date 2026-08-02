package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import internal.org.jni_zero.CalledByNative;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ObserverList;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetEngineBuilderImpl;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.net.impl.proto.RequestContextConfigOptions;
import org.chromium.net.urlconnection.CronetHttpURLConnection;
import org.chromium.net.urlconnection.CronetURLStreamHandlerFactory;
import xsna.go9;
import xsna.lhg;
import xsna.vny0;

/* loaded from: classes11.dex */
public class CronetUrlRequestContext extends CronetEngineBase {
    public static final String ALWAYS_ENABLE_BROTLI_FLAG_NAME = "Cronet_always_enable_brotli";
    static final String LOG_TAG = "CronetUrlRequestContext";
    public static final String OVERRIDE_NETWORK_THREAD_PRIORITY_FLAG_NAME = "Cronet_override_network_thread_priority";
    private static final HashSet<String> sInUseStoragePaths = new HashSet<>();
    private final AtomicInteger mActiveRequestCount;
    private int mDownstreamThroughputKbps;
    private int mEffectiveConnectionType;
    private final Object mFinishedListenerLock;
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap;
    private int mHttpRttMs;
    private final String mInUseStoragePath;
    private final ConditionVariable mInitCompleted;
    private boolean mIsLogging;
    private boolean mIsStoppingNetLog;
    private final Object mLock;
    private final long mLogId;
    private final CronetLogger mLogger;
    private long mNetworkHandle;
    private final boolean mNetworkQualityEstimatorEnabled;
    private final Object mNetworkQualityLock;
    private Thread mNetworkThread;
    private List<VersionSafeProxyCallback> mProxyCallbacks;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> mRttListenerList;
    private final AtomicInteger mRunningRequestCount;
    private final ConditionVariable mStopNetLogCompleted;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> mThroughputListenerList;
    private int mTransportRttMs;
    private long mUrlRequestContextAdapter;

    public static final class CronetInitializedInfoLogger {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final CronetLogger.CronetInitializedInfo mCronetInitializedInfo;
        private final CronetLogger mCronetLogger;
        private final long mStartUptimeMillis;

        public CronetInitializedInfoLogger(CronetLogger cronetLogger, long j, long j2) {
            CronetLogger.CronetInitializedInfo cronetInitializedInfo = new CronetLogger.CronetInitializedInfo();
            this.mCronetInitializedInfo = cronetInitializedInfo;
            this.mCronetLogger = cronetLogger;
            cronetInitializedInfo.cronetInitializationRef = j;
            cronetInitializedInfo.source = NativeCronetEngineBuilderImpl.getCronetSource();
            cronetInitializedInfo.cronetImplVersion = ImplVersion.getCronetVersion();
            this.mStartUptimeMillis = j2;
        }

        private int getElapsedTime() {
            return (int) (SystemClock.uptimeMillis() - this.mStartUptimeMillis);
        }

        private void maybeLog() {
            CronetLogger.CronetInitializedInfo cronetInitializedInfo = this.mCronetInitializedInfo;
            if (cronetInitializedInfo.engineCreationLatencyMillis < 0 || cronetInitializedInfo.engineAsyncLatencyMillis < 0) {
                return;
            }
            this.mCronetLogger.logCronetInitializedInfo(cronetInitializedInfo);
        }

        public void onInitThreadDone() {
            int elapsedTime = getElapsedTime();
            synchronized (this.mCronetInitializedInfo) {
                this.mCronetInitializedInfo.engineAsyncLatencyMillis = elapsedTime;
                maybeLog();
            }
        }

        public void onUserThreadDone() {
            int elapsedTime = getElapsedTime();
            synchronized (this.mCronetInitializedInfo) {
                this.mCronetInitializedInfo.engineCreationLatencyMillis = elapsedTime;
                maybeLog();
            }
        }
    }

    public interface Natives {
        void addPkp(long j, String str, byte[][] bArr, boolean z, long j2);

        void addQuicHint(long j, String str, int i, int i2);

        void configureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

        long createRequestContextAdapter(long j);

        long createRequestContextConfig(byte[] bArr);

        void destroy(long j);

        void flushWritePropertiesForTesting(long j);

        void initRequestContextOnInitThread(long j, CronetUrlRequestContext cronetUrlRequestContext);

        boolean isValidHeaderName(String str);

        boolean isValidHeaderValue(String str);

        void provideRTTObservations(long j, boolean z);

        void provideThroughputObservations(long j, boolean z);

        void startNetLogToDisk(long j, String str, boolean z, int i);

        boolean startNetLogToFile(long j, String str, boolean z);

        void stopNetLog(long j);
    }

    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl, long j) {
        Object obj = new Object();
        this.mLock = obj;
        this.mInitCompleted = new ConditionVariable(false);
        this.mRunningRequestCount = new AtomicInteger(0);
        this.mActiveRequestCount = new AtomicInteger(0);
        this.mNetworkQualityLock = new Object();
        this.mFinishedListenerLock = new Object();
        this.mEffectiveConnectionType = 0;
        this.mHttpRttMs = -1;
        this.mTransportRttMs = -1;
        this.mDownstreamThroughputKbps = -1;
        ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> observerList = new ObserverList<>();
        this.mRttListenerList = observerList;
        ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> observerList2 = new ObserverList<>();
        this.mThroughputListenerList = observerList2;
        this.mFinishedListenerMap = new HashMap();
        this.mStopNetLogCompleted = new ConditionVariable();
        this.mNetworkHandle = -1L;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext");
        try {
            observerList.disableThreadAsserts();
            observerList2.disableThreadAsserts();
            this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
            boolean ensureInitialized = CronetLibraryLoader.ensureInitialized(cronetEngineBuilderImpl.getContext(), cronetEngineBuilderImpl);
            if (cronetEngineBuilderImpl.httpCacheMode() == 1) {
                String storagePath = cronetEngineBuilderImpl.storagePath();
                this.mInUseStoragePath = storagePath;
                HashSet<String> hashSet = sInUseStoragePaths;
                synchronized (hashSet) {
                    try {
                        if (!hashSet.add(storagePath)) {
                            throw new IllegalStateException("Disk cache storage path already in use");
                        }
                    } finally {
                    }
                }
            } else {
                this.mInUseStoragePath = null;
            }
            if (cronetEngineBuilderImpl.getProxyOptions() != null) {
                this.mProxyCallbacks = cronetEngineBuilderImpl.getProxyOptions().createProxyCallbackList();
            }
            synchronized (obj) {
                try {
                    ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
                    try {
                        this.mUrlRequestContextAdapter = CronetUrlRequestContextJni.get().createRequestContextAdapter(createNativeUrlRequestContextConfig(cronetEngineBuilderImpl));
                        if (scoped2 != null) {
                            scoped2.close();
                        }
                        if (this.mUrlRequestContextAdapter == 0) {
                            throw new NullPointerException("Context Adapter creation failed.");
                        }
                    } finally {
                    }
                } finally {
                }
            }
            CronetLogger.CronetSource cronetSource = NativeCronetEngineBuilderImpl.getCronetSource();
            CronetLogger createLogger = CronetLoggerFactory.createLogger(cronetEngineBuilderImpl.getContext(), cronetSource);
            this.mLogger = createLogger;
            this.mLogId = createLogger.generateId();
            CronetLogger.CronetEngineBuilderInfo loggerInfo = cronetEngineBuilderImpl.toLoggerInfo();
            try {
                createLogger.logCronetEngineCreation(getLogId(), loggerInfo, buildCronetVersion(), cronetSource);
            } catch (RuntimeException e) {
                Log.i(LOG_TAG, "Error while trying to log CronetEngine creation: ", (Throwable) e);
            }
            final CronetInitializedInfoLogger cronetInitializedInfoLogger = ensureInitialized ? new CronetInitializedInfoLogger(this.mLogger, loggerInfo.getCronetInitializationRef(), j) : null;
            CronetLibraryLoader.postToInitThread(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.1
                final /* synthetic */ CronetUrlRequestContext this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this.this$0.mLock) {
                        try {
                            ScopedSysTraceEvent scoped3 = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
                            try {
                                CronetUrlRequestContextJni.get().initRequestContextOnInitThread(this.this$0.mUrlRequestContextAdapter, this.this$0);
                                if (scoped3 != null) {
                                    scoped3.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    CronetInitializedInfoLogger cronetInitializedInfoLogger2 = cronetInitializedInfoLogger;
                    if (cronetInitializedInfoLogger2 != null) {
                        cronetInitializedInfoLogger2.onInitThreadDone();
                    }
                }
            });
            if (cronetInitializedInfoLogger != null) {
                cronetInitializedInfoLogger.onUserThreadDone();
            }
            if (scoped != null) {
                scoped.close();
            }
        } finally {
        }
    }

    private CronetLogger.CronetVersion buildCronetVersion() {
        return new CronetLogger.CronetVersion(getVersionString().split(DomExceptionUtils.SEPARATOR)[1].split("@")[0]);
    }

    private void checkHaveAdapter() throws IllegalStateException {
        if (!haveRequestContextAdapter()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private static int convertConnectionTypeToApiValue(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new RuntimeException(lhg.a(i, "Internal Error: Illegal EffectiveConnectionType value "));
                    }
                }
            }
        }
        return i2;
    }

    public static long createNativeUrlRequestContextConfig(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        long createRequestContextConfig = CronetUrlRequestContextJni.get().createRequestContextConfig(createRequestContextConfigOptions(cronetEngineBuilderImpl).toByteArray());
        if (createRequestContextConfig == 0) {
            throw new IllegalArgumentException("Experimental options parsing failed.");
        }
        for (CronetEngineBuilderImpl.QuicHint quicHint : cronetEngineBuilderImpl.quicHints()) {
            CronetUrlRequestContextJni.get().addQuicHint(createRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (CronetEngineBuilderImpl.Pkp pkp : cronetEngineBuilderImpl.publicKeyPins()) {
            CronetUrlRequestContextJni.get().addPkp(createRequestContextConfig, pkp.mHost, pkp.mHashes, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        return createRequestContextConfig;
    }

    private static RequestContextConfigOptions createRequestContextConfigOptions(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        Map<String, ResolvedFlags.Value> flags = HttpFlagsForImpl.getHttpFlags(ContextUtils.getApplicationContext(), NativeCronetEngineBuilderImpl.getCronetSource()).flags();
        ResolvedFlags.Value value = flags.get(OVERRIDE_NETWORK_THREAD_PRIORITY_FLAG_NAME);
        ResolvedFlags.Value value2 = flags.get(ALWAYS_ENABLE_BROTLI_FLAG_NAME);
        RequestContextConfigOptions.Builder networkThreadPriority = RequestContextConfigOptions.newBuilder().setQuicEnabled(cronetEngineBuilderImpl.quicEnabled()).setHttp2Enabled(cronetEngineBuilderImpl.http2Enabled()).setBrotliEnabled((value2 != null ? value2.getBoolValue() : false) || cronetEngineBuilderImpl.brotliEnabled()).setDisableCache(cronetEngineBuilderImpl.cacheDisabled()).setHttpCacheMode(cronetEngineBuilderImpl.httpCacheMode()).setHttpCacheMaxSize(cronetEngineBuilderImpl.httpCacheMaxSize()).setMockCertVerifier(cronetEngineBuilderImpl.mockCertVerifier()).setEnableNetworkQualityEstimator(cronetEngineBuilderImpl.networkQualityEstimatorEnabled()).setBypassPublicKeyPinningForLocalTrustAnchors(cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled()).setNetworkThreadPriority(value != null ? (int) value.getIntValue() : 0);
        if (cronetEngineBuilderImpl.getProxyOptions() != null) {
            networkThreadPriority.setProxyOptions(cronetEngineBuilderImpl.getProxyOptions().createProxyOptionsProto());
        }
        if (cronetEngineBuilderImpl.getUserAgent() != null) {
            networkThreadPriority.setUserAgent(cronetEngineBuilderImpl.getUserAgent());
        }
        if (cronetEngineBuilderImpl.storagePath() != null) {
            networkThreadPriority.setStoragePath(cronetEngineBuilderImpl.storagePath());
        }
        if (cronetEngineBuilderImpl.getDefaultQuicUserAgentId() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(cronetEngineBuilderImpl.getDefaultQuicUserAgentId());
        }
        if (cronetEngineBuilderImpl.experimentalOptions() != null) {
            networkThreadPriority.setExperimentalOptions(cronetEngineBuilderImpl.experimentalOptions());
        }
        return networkThreadPriority.build();
    }

    private boolean haveRequestContextAdapter() {
        return this.mUrlRequestContextAdapter != 0;
    }

    @CalledByNative
    private void initNetworkThread() {
        this.mNetworkThread = Thread.currentThread();
        this.mInitCompleted.open();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$postObservationTaskToExecutor$0(String str, Runnable runnable, RefCountDelegate refCountDelegate) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#postObservationTaskToExecutor " + str + " running callback");
        try {
            try {
                try {
                    runnable.run();
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
            } catch (Exception e) {
                Log.e(LOG_TAG, "Exception thrown from observation task", (Throwable) e);
            }
        } finally {
            if (refCountDelegate != null) {
                refCountDelegate.decrement();
            }
        }
    }

    @CalledByNative
    private String[] onBeforeTunnelRequest(int i) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onBeforeTunnelRequest");
        try {
            VersionSafeProxyCallback versionSafeProxyCallback = this.mProxyCallbacks.get(i);
            ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onBeforeTunnelRequest running callback");
            try {
                List<Map.Entry<String, String>> onBeforeTunnelRequest = versionSafeProxyCallback.onBeforeTunnelRequest();
                if (scoped2 != null) {
                    scoped2.close();
                }
                if (onBeforeTunnelRequest == null) {
                    if (scoped != null) {
                        scoped.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : onBeforeTunnelRequest) {
                    Natives natives = CronetUrlRequestContextJni.get();
                    String key = entry.getKey();
                    Objects.requireNonNull(key);
                    if (natives.isValidHeaderName(key)) {
                        Natives natives2 = CronetUrlRequestContextJni.get();
                        String value = entry.getValue();
                        Objects.requireNonNull(value);
                        if (natives2.isValidHeaderValue(value)) {
                            arrayList.add(entry.getKey());
                            arrayList.add(entry.getValue());
                        }
                    }
                    throw new IllegalArgumentException("Invalid header with headername: " + entry.getKey());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (scoped != null) {
                    scoped.close();
                }
                return strArr;
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

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = i;
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = i;
            this.mTransportRttMs = i2;
            this.mDownstreamThroughputKbps = i3;
        }
    }

    @CalledByNative
    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.mNetworkQualityLock) {
            try {
                Iterator<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> it = this.mRttListenerList.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.NetworkQualityRttListenerWrapper next = it.next();
                    final int i3 = i;
                    final long j2 = j;
                    final int i4 = i2;
                    postObservationTaskToExecutor(next.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.2
                        final /* synthetic */ CronetUrlRequestContext this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            next.onRttObservation(i3, j2, i4);
                        }
                    }, "onRttObservation");
                    i = i3;
                    j = j2;
                    i2 = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.mNetworkQualityLock) {
            try {
                Iterator<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> it = this.mThroughputListenerList.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper next = it.next();
                    final int i3 = i;
                    final long j2 = j;
                    final int i4 = i2;
                    postObservationTaskToExecutor(next.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.3
                        final /* synthetic */ CronetUrlRequestContext this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            next.onThroughputObservation(i3, j2, i4);
                        }
                    }, "onThroughputObservation");
                    i = i3;
                    j = j2;
                    i2 = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private boolean onTunnelHeadersReceived(int i, String[] strArr, int i2) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onTunnelHeadersReceived");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i3], strArr[i3 + 1]));
            }
            VersionSafeProxyCallback versionSafeProxyCallback = this.mProxyCallbacks.get(i);
            ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#onTunnelHeadersReceived running callback");
            try {
                boolean onTunnelHeadersReceived = versionSafeProxyCallback.onTunnelHeadersReceived(Collections.unmodifiableList(arrayList), i2);
                if (scoped2 != null) {
                    scoped2.close();
                }
                if (scoped != null) {
                    scoped.close();
                }
                return onTunnelHeadersReceived;
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

    private static void postObservationTaskToExecutor(Executor executor, Runnable runnable, RefCountDelegate refCountDelegate, String str) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#postObservationTaskToExecutor " + str);
        if (refCountDelegate != null) {
            try {
                refCountDelegate.increment();
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
        try {
            executor.execute(new vny0(str, runnable, refCountDelegate, 1));
        } catch (RejectedExecutionException e) {
            if (refCountDelegate != null) {
                refCountDelegate.decrement();
            }
            Log.e(LOG_TAG, "Exception posting task to executor", (Throwable) e);
        }
        if (scoped != null) {
            scoped.close();
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            try {
                if (this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mRttListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            try {
                if (this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mThroughputListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long j) {
        this.mNetworkHandle = j;
    }

    @Override // org.chromium.net.CronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            CronetUrlRequestContextJni.get().configureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, z, z2, z3);
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3, long j) {
        long j2 = j == -1 ? this.mNetworkHandle : j;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3, j2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalUrlRequest createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList<Map.Entry<String, String>> arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, @NonNull String str3) {
        long j2 = j == -1 ? this.mNetworkHandle : j;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j2, str2, arrayList, uploadDataProvider, executor2, bArr, byteBuffer, str3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new CronetURLStreamHandlerFactory(this);
    }

    public void flushWritePropertiesForTesting() {
        synchronized (this.mLock) {
            CronetUrlRequestContextJni.get().flushWritePropertiesForTesting(this.mUrlRequestContextAdapter);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public int getActiveRequestCount() {
        return this.mActiveRequestCount.get();
    }

    public CronetLogger getCronetLogger() {
        return this.mLogger;
    }

    @Override // org.chromium.net.CronetEngine
    public int getDownstreamThroughputKbps() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mDownstreamThroughputKbps;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public int getEffectiveConnectionType() {
        int convertConnectionTypeToApiValue;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            convertConnectionTypeToApiValue = convertConnectionTypeToApiValue(this.mEffectiveConnectionType);
        }
        return convertConnectionTypeToApiValue;
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public int getHttpRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mHttpRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    public long getLogId() {
        return this.mLogId;
    }

    @Override // org.chromium.net.CronetEngine
    public int getTransportRttMs() {
        int i;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i = this.mTransportRttMs;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    public long getUrlRequestContextAdapter() {
        long j;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j = this.mUrlRequestContextAdapter;
        }
        return j;
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        return go9.b("Cronet/", ImplVersion.getCronetVersionWithLastChange());
    }

    public boolean isNetworkThread(Thread thread) {
        return thread == this.mNetworkThread;
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    public void onRequestDestroyed() {
        this.mRunningRequestCount.decrementAndGet();
    }

    public void onRequestFinished() {
        this.mActiveRequestCount.decrementAndGet();
    }

    public void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
        this.mRunningRequestCount.incrementAndGet();
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            try {
                if (this.mRttListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener)) && this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            try {
                if (this.mThroughputListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener)) && this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            } finally {
            }
        }
    }

    public void reportRequestFinished(final RequestFinishedInfo requestFinishedInfo, RefCountDelegate refCountDelegate, VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mFinishedListenerLock) {
            arrayList.addAll(this.mFinishedListenerMap.values());
        }
        if (requestFinishedInfoListener != null) {
            arrayList.add(requestFinishedInfoListener);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener2 = (VersionSafeCallbacks.RequestFinishedInfoListener) it.next();
            postObservationTaskToExecutor(requestFinishedInfoListener2.getExecutor(), new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequestContext.4
                final /* synthetic */ CronetUrlRequestContext this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    requestFinishedInfoListener2.onRequestFinished(requestFinishedInfo);
                }
            }, refCountDelegate, "reportRequestFinished");
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequestContext#shutdown");
        try {
            if (this.mInUseStoragePath != null) {
                HashSet<String> hashSet = sInUseStoragePaths;
                synchronized (hashSet) {
                    hashSet.remove(this.mInUseStoragePath);
                }
            }
            synchronized (this.mLock) {
                checkHaveAdapter();
                if (this.mRunningRequestCount.get() != 0) {
                    throw new IllegalStateException("Cannot shutdown with running requests.");
                }
                if (Thread.currentThread() == this.mNetworkThread) {
                    throw new IllegalThreadStateException("Cannot shutdown from network thread.");
                }
            }
            this.mInitCompleted.block();
            stopNetLog();
            synchronized (this.mLock) {
                if (!haveRequestContextAdapter()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    CronetUrlRequestContextJni.get().destroy(this.mUrlRequestContextAdapter);
                    this.mUrlRequestContextAdapter = 0L;
                    if (scoped != null) {
                        scoped.close();
                    }
                }
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

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.mLock) {
            try {
                checkHaveAdapter();
                if (this.mIsLogging) {
                    return;
                }
                CronetUrlRequestContextJni.get().startNetLogToDisk(this.mUrlRequestContextAdapter, str, z, i);
                this.mIsLogging = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
        synchronized (this.mLock) {
            try {
                checkHaveAdapter();
                if (this.mIsLogging) {
                    return;
                }
                if (!CronetUrlRequestContextJni.get().startNetLogToFile(this.mUrlRequestContextAdapter, str, z)) {
                    throw new RuntimeException("Unable to start NetLog");
                }
                this.mIsLogging = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging && !this.mIsStoppingNetLog) {
                CronetUrlRequestContextJni.get().stopNetLog(this.mUrlRequestContextAdapter);
                this.mIsStoppingNetLog = true;
                this.mStopNetLogCompleted.block();
                this.mStopNetLogCompleted.close();
                synchronized (this.mLock) {
                    this.mIsStoppingNetLog = false;
                    this.mIsLogging = false;
                }
            }
        }
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.mStopNetLogCompleted.open();
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || HttpRequest.DEFAULT_SCHEME.equals(protocol)) {
            return new CronetHttpURLConnection(url, this);
        }
        throw new UnsupportedOperationException(go9.b("Unexpected protocol:", protocol));
    }

    private static void postObservationTaskToExecutor(Executor executor, Runnable runnable, String str) {
        postObservationTaskToExecutor(executor, runnable, null, str);
    }
}
