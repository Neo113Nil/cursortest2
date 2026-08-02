package ru.ok.tracer.profiler.systrace;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.tracer.utils.Logger;

/* compiled from: SystraceHook.kt */
/* loaded from: classes9.dex */
public final class SystraceHook {
    private static final int STATE_IDLE = 0;
    private static final int STATE_INSTALLED = 2;
    private static final int STATE_INSTALLING = 1;
    private static final int STATE_INSTALL_FAILED = 5;
    private static final int STATE_STARTED = 3;
    private static final int STATE_UNHOOKED = 4;
    public static final SystraceHook INSTANCE = new SystraceHook();
    private static final AtomicInteger state = new AtomicInteger(0);

    /* compiled from: SystraceHook.kt */
    public interface TraceListener {
        void onFinish(File file);

        void onStart(Thread thread, Runnable runnable);
    }

    private SystraceHook() {
    }

    private final native boolean hook(int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void process(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopProcess() {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = state;
            i = atomicInteger.get();
            if (i != 2 && i != 3) {
                Logger.d$default("Systrace: Wrong state: " + atomicInteger.get(), null, 2, null);
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 4));
        unhook();
        atomicInteger.compareAndSet(4, 0);
    }

    private final native void unhook();

    public final boolean install(boolean z) {
        Method method;
        Field field;
        if (!state.compareAndSet(0, 1)) {
            Logger.d$default("Skip install tracer. Not first attempt.", null, 2, null);
            return false;
        }
        try {
            System.loadLibrary("trhook2");
            try {
                method = Trace.class.getDeclaredMethod("nativeGetEnabledTags", null);
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            try {
                field = Trace.class.getDeclaredField("sEnabledTags");
                field.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                field = null;
            }
            if ((method == null || field == null) && Build.VERSION.SDK_INT < 35) {
                state.set(5);
                return false;
            }
            Logger.d$default("Hooking...", null, 2, null);
            if (!hook(Build.VERSION.SDK_INT, z)) {
                state.set(5);
                return false;
            }
            if (method != null && field != null) {
                try {
                    field.set(null, method.invoke(null, null));
                } catch (Exception unused3) {
                    state.set(5);
                    return false;
                }
            }
            Logger.d$default("Installed", null, 2, null);
            state.set(2);
            return true;
        } catch (UnsatisfiedLinkError unused4) {
            state.set(5);
            return false;
        }
    }

    public final boolean isInstalled() {
        return state.get() == 2;
    }

    public final void start(Context context, TraceListener traceListener) {
        AtomicInteger atomicInteger = state;
        if (atomicInteger.compareAndSet(2, 3)) {
            new SystraceHook$start$executingThread$1(context, traceListener).start();
            return;
        }
        Logger.d$default("Wrong state: " + atomicInteger.get(), null, 2, null);
    }
}
