package xsna;

import ru.ok.tracer.profiler.systrace.SystraceProfiler;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class jrn0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ jrn0(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                SystraceProfiler.commit$lambda$1(this.c);
                break;
            default:
                com.mbridge.msdk.config.component.common.file.a.h(this.c);
                break;
        }
    }
}
