package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class c3x implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ c3x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.b) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                wh50 wh50Var = this.c;
                wh50Var.setValue(zbo0.a((zbo0) wh50Var.getValue(), null, null, false, false, booleanValue, 15));
                break;
            default:
                bool.booleanValue();
                this.c.setValue(bool);
                break;
        }
        return s3q0.a;
    }
}
