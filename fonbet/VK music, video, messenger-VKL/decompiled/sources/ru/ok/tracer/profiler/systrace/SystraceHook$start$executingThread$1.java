package ru.ok.tracer.profiler.systrace;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import ru.ok.tracer.profiler.systrace.SystraceHook;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import xsna.gap;

/* compiled from: SystraceHook.kt */
/* loaded from: classes9.dex */
public final class SystraceHook$start$executingThread$1 extends Thread {
    final /* synthetic */ Context $context;
    final /* synthetic */ SystraceHook.TraceListener $traceListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystraceHook$start$executingThread$1(Context context, SystraceHook.TraceListener traceListener) {
        super("Tracer-systrace");
        this.$context = context;
        this.$traceListener = traceListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0() {
        Logger.d$default("Systrace: Send stop.", null, 2, null);
        SystraceHook.INSTANCE.stopProcess();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            File newSampleFile$default = TracerFiles.getNewSampleFile$default(TracerFiles.INSTANCE, this.$context, FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), null, 4, null);
            Logger.d$default("Systrace: Processing...", null, 2, null);
            this.$traceListener.onStart(this, new gap(2));
            SystraceHook.INSTANCE.process(newSampleFile$default.toString());
            Logger.d$default("Systrace: Processing stopped. Execute consumer", null, 2, null);
            this.$traceListener.onFinish(newSampleFile$default);
            Logger.d$default("Systrace: Write finished.", null, 2, null);
        } catch (IOException unused) {
        }
    }
}
