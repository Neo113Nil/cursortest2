package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s8s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ s8s(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tho0 tho0Var = (tho0) obj;
                if (tho0Var.a.c.length() <= 15) {
                    this.c.setValue(tho0Var);
                }
                break;
            default:
                this.c.setValue(Integer.valueOf(((ljo0) obj).b.f));
                break;
        }
        return s3q0.a;
    }
}
