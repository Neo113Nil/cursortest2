package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class v8u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ rg50 c;

    public /* synthetic */ v8u(int i, rg50 rg50Var) {
        this.b = i;
        this.c = rg50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new h9x((0 << 32) | (this.c.getIntValue() & 4294967295L));
            default:
                this.c.C((int) (((tny) obj).a() & 4294967295L));
                return s3q0.a;
        }
    }
}
