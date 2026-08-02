package xsna;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class hj01 extends oyz0 {
    public final /* synthetic */ ij01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj01(ij01 ij01Var, ed01 ed01Var) {
        super(ed01Var);
        this.e = ij01Var;
    }

    @Override // xsna.oyz0
    public final void b() {
        ij01 ij01Var = this.e;
        ij01Var.o();
        k901 k901Var = ((mb01) ij01Var.b).j;
        mb01.k(k901Var);
        k901Var.q.a("Starting upload from DelayedRunnable");
        ij01Var.e.u();
    }
}
