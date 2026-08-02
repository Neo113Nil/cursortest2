package defpackage;

/* loaded from: classes9.dex */
public final class q1 extends w3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(int i, Class cls) {
        super(0, cls);
        this.c = i;
    }

    @Override // defpackage.w3
    public a3 d(h3 h3Var) {
        switch (this.c) {
            case 0:
                return h3Var.u();
            case 5:
                return h3Var.x();
            case 6:
                return h3Var;
            case 7:
                return h3Var.y();
            default:
                return super.d(h3Var);
        }
    }

    @Override // defpackage.w3
    public a3 e(cqf cqfVar) {
        switch (this.c) {
            case 0:
                return r1.p(cqfVar.a);
            case 1:
                return v1.p(cqfVar.a);
            case 2:
                return new upf(cqfVar.a);
            case 3:
                return new k2(cqfVar.a);
            case 4:
                return t2.p(cqfVar.a, false);
            case 5:
                return cqfVar;
            default:
                return super.e(cqfVar);
        }
    }
}
