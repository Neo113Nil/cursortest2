package org.chromium.base;

import android.app.Activity;
import android.os.Handler;
import internal.org.jni_zero.CalledByNative;
import java.util.Iterator;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.memory.MemoryPressureCallback;
import org.chromium.base.memory.SelfFreezeCallback;
import xsna.d320;
import xsna.gap;

/* loaded from: classes8.dex */
public class MemoryPressureListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_LOW_MEMORY = "org.chromium.base.ACTION_LOW_MEMORY";
    private static final String ACTION_TRIM_MEMORY = "org.chromium.base.ACTION_TRIM_MEMORY";
    private static final String ACTION_TRIM_MEMORY_MODERATE = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";
    private static final String ACTION_TRIM_MEMORY_RUNNING_CRITICAL = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";
    private static ObserverList<MemoryPressureCallback> sCallbacks;
    private static ObserverList<SelfFreezeCallback> sSelfFreezeCallbacks;
    private static volatile Handler sSelfFreezeHandler;

    public interface Natives {
        boolean isTrimMemoryBackgroundCritical();

        void onMemoryPressure(int i);

        void onPreFreeze();
    }

    public static void addCallback(MemoryPressureCallback memoryPressureCallback) {
        ThreadUtils.assertOnUiThread();
        if (sCallbacks == null) {
            sCallbacks = new ObserverList<>();
        }
        sCallbacks.addObserver(memoryPressureCallback);
    }

    @CalledByNative
    private static void addNativeCallback() {
        ThreadUtils.assertOnUiThread();
        addCallback(new d320());
    }

    public static void addSelfFreezeCallback(SelfFreezeCallback selfFreezeCallback) {
        if (sSelfFreezeCallbacks == null) {
            sSelfFreezeCallbacks = new ObserverList<>();
        }
        sSelfFreezeCallbacks.addObserver(selfFreezeCallback);
        if (sSelfFreezeHandler == null) {
            sSelfFreezeHandler = new Handler();
        }
    }

    public static boolean handleDebugIntent(Activity activity, String str) {
        ThreadUtils.assertOnUiThread();
        if (ACTION_LOW_MEMORY.equals(str)) {
            simulateLowMemoryPressureSignal(activity);
            return true;
        }
        if (ACTION_TRIM_MEMORY.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 80);
            return true;
        }
        if (ACTION_TRIM_MEMORY_RUNNING_CRITICAL.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 15);
            return true;
        }
        if (!ACTION_TRIM_MEMORY_MODERATE.equals(str)) {
            return false;
        }
        simulateTrimMemoryPressureSignal(activity, 60);
        return true;
    }

    public static boolean isTrimMemoryBackgroundCritical() {
        if (LibraryLoader.getInstance().isInitialized()) {
            return MemoryPressureListenerJni.get().isTrimMemoryBackgroundCritical();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addNativeCallback$0(int i) {
        MemoryPressureListenerJni.get().onMemoryPressure(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifySelfFreeze$1() {
        ObserverList<SelfFreezeCallback> observerList = sSelfFreezeCallbacks;
        if (observerList == null) {
            return;
        }
        Iterator<SelfFreezeCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onSelfFreeze();
        }
    }

    public static void notifyMemoryPressure(int i) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        Iterator<MemoryPressureCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onPressure(i);
        }
    }

    public static void notifySelfFreeze() {
        ThreadUtils.assertOnUiThread();
        if (sSelfFreezeHandler != null) {
            sSelfFreezeHandler.post(new gap(1));
        }
    }

    public static void onPreFreeze() {
        if (LibraryLoader.getInstance().isInitialized()) {
            MemoryPressureListenerJni.get().onPreFreeze();
        }
    }

    public static void removeCallback(MemoryPressureCallback memoryPressureCallback) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(memoryPressureCallback);
    }

    public static void removeSelfFreezeCallback(SelfFreezeCallback selfFreezeCallback) {
        sSelfFreezeCallbacks.removeObserver(selfFreezeCallback);
    }

    private static void simulateLowMemoryPressureSignal(Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    private static void simulateTrimMemoryPressureSignal(Activity activity, int i) {
        activity.getApplication().onTrimMemory(i);
        activity.onTrimMemory(i);
    }
}
