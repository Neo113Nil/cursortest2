package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oeg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ oeg0(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                seg0 seg0Var = new seg0();
                seg0Var.b = (String) this.c.getValue();
                return seg0Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                return s3q0.a;
        }
    }
}
