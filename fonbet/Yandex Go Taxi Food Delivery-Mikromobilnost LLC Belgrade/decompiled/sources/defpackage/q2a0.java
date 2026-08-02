package defpackage;

/* loaded from: classes12.dex */
public final class q2a0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2a0 b;

    public /* synthetic */ q2a0(m2a0 m2a0Var, int i) {
        this.a = i;
        this.b = m2a0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        m2a0 m2a0Var = this.b;
        switch (i) {
            case 0:
                return (yr31) m2a0Var.invoke();
            default:
                return new dnd0(1, new q2a0(m2a0Var, 0));
        }
    }
}
