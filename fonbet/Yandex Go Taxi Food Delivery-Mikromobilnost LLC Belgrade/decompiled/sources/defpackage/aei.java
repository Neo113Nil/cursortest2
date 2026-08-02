package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class aei implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m640 b;

    public /* synthetic */ aei(m640 m640Var, int i) {
        this.a = i;
        this.b = m640Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        m640 m640Var = this.b;
        switch (i) {
            case 0:
                return (zzh) ((yvf0) m640Var.E).get();
            case 1:
                return new tu8(m640Var, 1);
            default:
                m640Var.i();
                return zy11.a;
        }
    }
}
