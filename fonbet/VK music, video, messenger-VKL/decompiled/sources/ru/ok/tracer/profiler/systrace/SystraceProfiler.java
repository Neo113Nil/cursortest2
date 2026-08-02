package ru.ok.tracer.profiler.systrace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;
import ru.ok.tracer.upload.SampleUploader;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.epx;
import xsna.hrn0;
import xsna.jrn0;
import xsna.ozl;
import xsna.pzl;

/* compiled from: SystraceProfiler.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes9.dex */
public final class SystraceProfiler {
    public static final SystraceProfiler INSTANCE = new SystraceProfiler();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static State state = None.INSTANCE;

    /* compiled from: SystraceProfiler.kt */
    public static final class Finished implements State {
        private final long duration;
        private final File sampleFile;
        private final String tag;

        public Finished(File file, String str, long j) {
            this.sampleFile = file;
            this.tag = str;
            this.duration = j;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final File getSampleFile() {
            return this.sampleFile;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* compiled from: SystraceProfiler.kt */
    public static final class InProgress implements State {
        private final Thread execThread;
        private final Runnable stopRunnable;

        public InProgress(Thread thread, Runnable runnable) {
            this.execThread = thread;
            this.stopRunnable = runnable;
        }

        public final Thread getExecThread() {
            return this.execThread;
        }

        public final Runnable getStopRunnable() {
            return this.stopRunnable;
        }
    }

    /* compiled from: SystraceProfiler.kt */
    public static final class None implements State {
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* compiled from: SystraceProfiler.kt */
    public static final class Preparing implements State {
        public static final Preparing INSTANCE = new Preparing();

        private Preparing() {
        }
    }

    /* compiled from: SystraceProfiler.kt */
    public interface State {
    }

    private SystraceProfiler() {
    }

    public static final void abort() {
        if (Tracer.isDisabled()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        hrn0 hrn0Var = new hrn0();
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            abort$lambda$2();
        } else {
            mainHandler.post(hrn0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abort$lambda$2() {
        onStop$default(INSTANCE, false, null, 2, null);
    }

    public static final void commit() {
        commit$default(null, 1, null);
    }

    public static /* synthetic */ void commit$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        commit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commit$lambda$1(String str) {
        INSTANCE.onStop(true, str);
    }

    private final void onStart(String str, long j) {
        try {
            Context context = Tracer.INSTANCE.getContext();
            if (!SystraceProfilerConfiguration.Companion.get$tracer_profiler_systrace_release().getEnabled()) {
                Logger.d$default("SystraceProfiler: disabled", null, 2, null);
                return;
            }
            if (!epx.f(state, None.INSTANCE)) {
                Logger.d$default("SystraceProfiler: Is in progress", null, 2, null);
                return;
            }
            if (ConfigStorage.INSTANCE.isLimited(FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), str)) {
                Logger.d$default("SystraceProfiler: Limited", null, 2, null);
                return;
            }
            SystraceHook systraceHook = SystraceHook.INSTANCE;
            if (!systraceHook.install(true)) {
                Logger.d$default("SystraceProfiler: Can't install hook", null, 2, null);
            } else {
                systraceHook.start(context, new SystraceProfiler$onStart$traceListener$1(j, SystemClock.elapsedRealtime(), str));
                state = Preparing.INSTANCE;
            }
        } catch (IllegalStateException unused) {
            Logger.e$default("Tracer is not initialized", null, 2, null);
        }
    }

    private final void onStop(final boolean z, final String str) {
        try {
            final Context context = Tracer.INSTANCE.getContext();
            State state2 = state;
            None none = None.INSTANCE;
            if (epx.f(state2, none) || epx.f(state2, Preparing.INSTANCE)) {
                return;
            }
            if (state2 instanceof InProgress) {
                Logger.d$default("SystraceProfiler: Profiling in progress and will be stopped. Need commit result = " + z, null, 2, null);
                mainHandler.removeCallbacksAndMessages(null);
                ((InProgress) state2).getStopRunnable().run();
                final InProgress inProgress = (InProgress) state2;
                TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: ru.ok.tracer.profiler.systrace.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystraceProfiler.onStop$lambda$4(inProgress, z, str);
                    }
                });
                return;
            }
            if (state2 instanceof Finished) {
                Logger.d$default("SystraceProfiler: Profiling already ended and now computing result. Need send = " + z, null, 2, null);
                if (Tracer.isDisabled()) {
                    Logger.d$default("Tracer is disabled", null, 2, null);
                } else if (z) {
                    final Finished finished = (Finished) state2;
                    TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: ru.ok.tracer.profiler.systrace.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            SystraceProfiler.onStop$lambda$5(finished, str, context);
                        }
                    });
                }
                state = none;
            }
        } catch (IllegalStateException unused) {
            Logger.e$default("Tracer is not initialized", null, 2, null);
        }
    }

    public static /* synthetic */ void onStop$default(SystraceProfiler systraceProfiler, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        systraceProfiler.onStop(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$4(State state2, final boolean z, final String str) {
        ((InProgress) state2).getExecThread().join();
        Runnable runnable = new Runnable() { // from class: xsna.irn0
            @Override // java.lang.Runnable
            public final void run() {
                SystraceProfiler.onStop$lambda$4$lambda$3(z, str);
            }
        };
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$4$lambda$3(boolean z, String str) {
        INSTANCE.onStop(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$5(State state2, String str, Context context) {
        Finished finished = (Finished) state2;
        File sampleFile = finished.getSampleFile();
        long duration = finished.getDuration();
        int length = str.length();
        String tag = finished.getTag();
        if (length != 0) {
            tag = pzl.b(tag, BundleUtil.UNDERLINE_TAG, str);
        }
        INSTANCE.onUpload(context, sampleFile, tag, duration);
    }

    private final void onUpload(Context context, File file, String str, long j) {
        SampleUploader.upload$default(SampleUploader.INSTANCE, context, FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), file, false, str, Long.valueOf(j), null, null, 200, null);
    }

    private final void runOnMain(Runnable runnable) {
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    @ozl
    public static final void start(Context context, String str, long j) {
        start(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(String str, long j) {
        INSTANCE.onStart(str, j);
    }

    public static final void commit(String str) {
        if (Tracer.isDisabled()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        jrn0 jrn0Var = new jrn0(str, 0);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            jrn0Var.run();
        } else {
            mainHandler.post(jrn0Var);
        }
    }

    public static final void start(final String str, final long j) {
        if (Tracer.isDisabled()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        Runnable runnable = new Runnable() { // from class: xsna.krn0
            @Override // java.lang.Runnable
            public final void run() {
                SystraceProfiler.start$lambda$0(str, j);
            }
        };
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    private static /* synthetic */ void getState$annotations() {
    }
}
