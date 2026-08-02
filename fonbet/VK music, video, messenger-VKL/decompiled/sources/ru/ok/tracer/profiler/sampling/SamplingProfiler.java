package ru.ok.tracer.profiler.sampling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.IOException;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.profiler.sampling.SamplingProfiler;
import ru.ok.tracer.upload.SampleUploader;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.epx;
import xsna.i3l;
import xsna.mf3;
import xsna.ozl;
import xsna.pzl;
import xsna.vt70;
import xsna.xy6;

/* compiled from: SamplingProfiler.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes9.dex */
public final class SamplingProfiler {
    public static final SamplingProfiler INSTANCE = new SamplingProfiler();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static State state = None.INSTANCE;

    /* compiled from: SamplingProfiler.kt */
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

    /* compiled from: SamplingProfiler.kt */
    public static final class InProgress implements State {
        private final long requestedDuration;
        private final File sampleFile;
        private final long startRealtime;
        private final String tag;

        public InProgress(File file, String str, long j, long j2) {
            this.sampleFile = file;
            this.tag = str;
            this.requestedDuration = j;
            this.startRealtime = j2;
        }

        public final long getRequestedDuration() {
            return this.requestedDuration;
        }

        public final File getSampleFile() {
            return this.sampleFile;
        }

        public final long getStartRealtime() {
            return this.startRealtime;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* compiled from: SamplingProfiler.kt */
    public static final class None implements State {
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* compiled from: SamplingProfiler.kt */
    public interface State {
    }

    private SamplingProfiler() {
    }

    public static final void abort() {
        if (Tracer.isDisabled()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        vt70 vt70Var = new vt70(2);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            abort$lambda$2();
        } else {
            mainHandler.post(vt70Var);
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

    private final void onFinish() {
        State state2 = state;
        if (state2 instanceof None) {
            throw new IllegalStateException("Cannot finish");
        }
        if (state2 instanceof Finished) {
            return;
        }
        Debug.stopMethodTracing();
        InProgress inProgress = (InProgress) state;
        File sampleFile = inProgress.getSampleFile();
        String tag = inProgress.getTag();
        long requestedDuration = inProgress.getRequestedDuration();
        long elapsedRealtime = SystemClock.elapsedRealtime() - inProgress.getStartRealtime();
        if (requestedDuration > elapsedRealtime) {
            requestedDuration = elapsedRealtime;
        }
        state = new Finished(sampleFile, tag, requestedDuration);
    }

    private final void onStart(String str, long j) {
        try {
            Context context = Tracer.INSTANCE.getContext();
            SamplingProfilerConfiguration samplingProfilerConfiguration = SamplingProfilerConfiguration.Companion.get$tracer_profiler_sampling_release();
            if (!samplingProfilerConfiguration.getEnabled()) {
                Logger.d$default("SamplingProfiler: disabled", null, 2, null);
                return;
            }
            if (!epx.f(state, None.INSTANCE)) {
                Logger.d$default("SamplingProfiler: Is in progress", null, 2, null);
                return;
            }
            if (ConfigStorage.INSTANCE.isLimited(FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE(), str)) {
                Logger.d$default("SamplingProfiler: Limited", null, 2, null);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                File newSampleFile = TracerFiles.INSTANCE.getNewSampleFile(context, FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE(), ".trace");
                int bufferSizeMb = samplingProfilerConfiguration.getBufferSizeMb();
                int samplingIntervalUs = samplingProfilerConfiguration.getSamplingIntervalUs();
                StringBuilder b = xy6.b(bufferSizeMb, "Sampling run config: ", newSampleFile.getPath(), ", ", ", ");
                b.append(samplingIntervalUs);
                Logger.d$default(b.toString(), null, 2, null);
                Debug.startMethodTracingSampling(newSampleFile.getPath(), bufferSizeMb, samplingIntervalUs);
                state = new InProgress(newSampleFile, str, j, elapsedRealtime);
                mainHandler.postDelayed(new i3l(2), j);
            } catch (IOException unused) {
            }
        } catch (IllegalStateException unused2) {
            Logger.e$default("Tracer is not initialized", null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$3() {
        INSTANCE.onFinish();
    }

    private final void onStop(boolean z, final String str) {
        try {
            final Context context = Tracer.INSTANCE.getContext();
            mainHandler.removeCallbacksAndMessages(null);
            State state2 = state;
            if (state2 instanceof None) {
                Logger.w$default("SamplingProfiler: Profiling not started", null, 2, null);
                return;
            }
            if (state2 instanceof InProgress) {
                Logger.d$default("SamplingProfiler: Profiling in progress and will be stopped. Need commit result = " + z, null, 2, null);
                onFinish();
            } else if (state2 instanceof Finished) {
                Logger.d$default("SamplingProfiler: Profiling already ended and now computing result. Need send = " + z, null, 2, null);
            }
            final Finished finished = (Finished) state;
            if (Tracer.isDisabled()) {
                Logger.d$default("Tracer is disabled", null, 2, null);
            } else if (z) {
                TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: ru.ok.tracer.profiler.sampling.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        SamplingProfiler.onStop$lambda$4(SamplingProfiler.Finished.this, str, context);
                    }
                });
            }
            state = None.INSTANCE;
        } catch (IllegalStateException unused) {
            Logger.e$default("Tracer is not initialized", null, 2, null);
        }
    }

    public static /* synthetic */ void onStop$default(SamplingProfiler samplingProfiler, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        samplingProfiler.onStop(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStop$lambda$4(Finished finished, String str, Context context) {
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
        SampleUploader.upload$default(SampleUploader.INSTANCE, context, FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE(), file, false, str, Long.valueOf(j), null, null, 200, null);
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
        mf3 mf3Var = new mf3(str, 10);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            mf3Var.run();
        } else {
            mainHandler.post(mf3Var);
        }
    }

    public static final void start(final String str, final long j) {
        if (Tracer.isDisabled()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        Runnable runnable = new Runnable() { // from class: xsna.o0h0
            @Override // java.lang.Runnable
            public final void run() {
                SamplingProfiler.start$lambda$0(str, j);
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
