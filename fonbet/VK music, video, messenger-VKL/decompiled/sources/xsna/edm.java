package xsna;

/* compiled from: DialogDraftUpdater.kt */
/* loaded from: classes2.dex */
public final class edm implements cdm {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();

    @Override // xsna.cdm
    public final void a(long j) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        io.reactivex.rxjava3.internal.operators.single.c C = a1wVar.C(this, new vqm(j));
        asu0 asu0Var = asu0.a;
        this.a.b(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new k5(new ddm(this, j, 0), 17)));
    }

    @Override // xsna.cdm
    public final void dispose() {
        this.a.e();
    }
}
