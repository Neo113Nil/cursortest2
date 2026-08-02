package xsna;

import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: GetUnbanRecommendationsTask.kt */
/* loaded from: classes11.dex */
public final class gwt implements gzs<s3q0> {
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public io.reactivex.rxjava3.disposables.c f;

    public gwt(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4) {
        this.b = bpn0Var2;
        this.c = bpn0Var3;
        this.d = bpn0Var4;
        this.e = new bpn0(new dwt(bpn0Var, 0));
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.l2 m = ((b25) this.b.getValue()).m(true);
        bwt bwtVar = new bwt(new zvt(this, 0), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.core.q<R> s0 = m.E(bwtVar, lVar, kVar, kVar).s0(new ma4(new la4(this, 1), 1));
        ka4 ka4Var = new ka4(new ta3(this), 2);
        s0.getClass();
        io.reactivex.rxjava3.internal.operators.mixed.o oVar = new io.reactivex.rxjava3.internal.operators.mixed.o(s0, ka4Var);
        asu0 asu0Var = asu0.a;
        this.f = hg1.h(oVar.r0(asu0Var.c()).a0(asu0Var.d()).G(new io.reactivex.rxjava3.functions.a() { // from class: xsna.cwt
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                gwt gwtVar = gwt.this;
                io.reactivex.rxjava3.disposables.c cVar2 = gwtVar.f;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                ((a8e0) gwtVar.e.getValue()).dismiss();
            }
        }), new xys(this, 1));
        return s3q0.a;
    }
}
