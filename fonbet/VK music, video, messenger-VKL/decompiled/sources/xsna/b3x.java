package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b3x implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ b3x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wh50 wh50Var = this.c;
                wh50Var.setValue(zbo0.a((zbo0) wh50Var.getValue(), null, null, false, booleanValue, false, 23));
                break;
            default:
                this.c.setValue((String) obj);
                break;
        }
        return s3q0.a;
    }
}
