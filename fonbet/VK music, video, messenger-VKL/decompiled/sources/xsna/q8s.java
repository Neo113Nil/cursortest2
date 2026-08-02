package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q8s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ q8s(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            default:
                this.c.setValue(new q9x(((q9x) obj).a));
                break;
        }
        return s3q0.a;
    }
}
