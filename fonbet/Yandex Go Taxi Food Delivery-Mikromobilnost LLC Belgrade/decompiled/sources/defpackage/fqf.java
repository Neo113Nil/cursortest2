package defpackage;

/* loaded from: classes4.dex */
public final class fqf extends vvf {
    @Override // defpackage.vvf, defpackage.ryh
    public final void H(a2[] a2VarArr) {
        for (a2 a2Var : a2VarArr) {
            a2Var.toASN1Primitive().s().n(this, true);
        }
    }

    @Override // defpackage.vvf, defpackage.ryh
    public final void N(b3 b3Var) {
        b3Var.s().n(this, true);
    }

    @Override // defpackage.vvf, defpackage.ryh
    public final void O(b3[] b3VarArr) {
        for (b3 b3Var : b3VarArr) {
            b3Var.s().n(this, true);
        }
    }

    @Override // defpackage.ryh
    public final fqf t() {
        return this;
    }
}
