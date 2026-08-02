package xsna;

import com.vk.media.pipeline.model.timeline.Timeline;

/* compiled from: DefaultTaskFactory.kt */
/* loaded from: classes3.dex */
public final class jol {
    public final csp a;
    public final Timeline b;
    public final nfq c;
    public final ju4 d;
    public final boolean e;

    public jol(csp cspVar, Timeline timeline, nfq nfqVar, ju4 ju4Var, boolean z) {
        this.a = cspVar;
        this.b = timeline;
        this.c = nfqVar;
        this.d = ju4Var;
        this.e = z;
    }

    public final a5o0 a(ykm0 ykm0Var) {
        nfq nfqVar = this.c;
        jkp0 jkp0Var = (jkp0) ykm0Var.c;
        ju4 ju4Var = this.d;
        csp cspVar = this.a;
        s98 d = new t98(cspVar).d(this.b, new l0h0(cspVar, ju4Var, true));
        try {
            nkp0 nkp0Var = new nkp0(cspVar, d, ykm0Var, nfqVar, new fq10(cspVar.d, this.e));
            gtj gtjVar = nkp0Var.d;
            if (gtjVar != null) {
                d.b();
                return new atj(cspVar, gtjVar, jkp0Var);
            }
            djp0 djp0Var = nkp0Var.e;
            if (djp0Var == null) {
                throw new IllegalStateException("Unsupported transform request");
            }
            try {
                return new cjp0(this.a, djp0Var, d, nfqVar, this.d, jkp0Var, this.e);
            } catch (Throwable th) {
                th = th;
                d = d;
                Throwable th2 = th;
                d.b();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
