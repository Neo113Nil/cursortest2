package ru.ok.tracer.profiler.systrace;

import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import ru.ok.tracer.profiler.systrace.SystraceHook;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;
import ru.ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;
import ru.ok.tracer.utils.Logger;
import xsna.epx;
import xsna.u69;

/* compiled from: SystraceProfiler.kt */
/* loaded from: classes9.dex */
public final class SystraceProfiler$onStart$traceListener$1 implements SystraceHook.TraceListener {
    final /* synthetic */ long $duration;
    final /* synthetic */ long $startRealtime;
    final /* synthetic */ String $tag;

    public SystraceProfiler$onStart$traceListener$1(long j, long j2, String str) {
        this.$duration = j;
        this.$startRealtime = j2;
        this.$tag = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFinish$lambda$1(File file, String str, long j) {
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        SystraceProfiler.state = new SystraceProfiler.Finished(file, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$0(Thread thread, Runnable runnable) {
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        SystraceProfiler.state = new SystraceProfiler.InProgress(thread, runnable);
    }

    @Override // ru.ok.tracer.profiler.systrace.SystraceHook.TraceListener
    public void onFinish(final File file) {
        final long j = this.$duration;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.$startRealtime;
        if (j > elapsedRealtime) {
            j = elapsedRealtime;
        }
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        final String str = this.$tag;
        Runnable runnable = new Runnable() { // from class: xsna.lrn0
            @Override // java.lang.Runnable
            public final void run() {
                SystraceProfiler$onStart$traceListener$1.onFinish$lambda$1(file, str, j);
            }
        };
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            SystraceProfiler.mainHandler.post(runnable);
        }
    }

    @Override // ru.ok.tracer.profiler.systrace.SystraceHook.TraceListener
    public void onStart(Thread thread, Runnable runnable) {
        Logger.d$default("SystraceProfiler: started", null, 2, null);
        SystraceProfiler systraceProfiler = SystraceProfiler.INSTANCE;
        u69 u69Var = new u69(7, thread, runnable);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            u69Var.run();
        } else {
            SystraceProfiler.mainHandler.post(u69Var);
        }
        SystraceProfiler.mainHandler.postDelayed(runnable, this.$duration);
    }
}
