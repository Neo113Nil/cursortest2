package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class eho implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ eho(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                ((izs) this.c.getValue()).invoke(f);
                break;
            default:
                this.c.setValue((tho0) obj);
                break;
        }
        return s3q0.a;
    }
}
