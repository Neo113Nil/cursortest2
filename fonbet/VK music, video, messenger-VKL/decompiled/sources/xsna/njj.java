package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class njj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ rg50 c;

    public /* synthetic */ njj(int i, rg50 rg50Var) {
        this.b = i;
        this.c = rg50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        rg50 rg50Var = this.c;
        tny tnyVar = (tny) obj;
        switch (i) {
            case 0:
                rg50Var.C((int) (tnyVar.a() & 4294967295L));
                break;
            case 1:
                int i2 = ify.a;
                if (!ify.e(ify.c)) {
                    rg50Var.C((int) (tnyVar.a() & 4294967295L));
                }
                break;
            default:
                rg50Var.C((int) (tnyVar.a() & 4294967295L));
                break;
        }
        return s3q0.a;
    }
}
