package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xwn implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ xwn(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                return s3q0.a;
            case 1:
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            case 2:
                wh50Var.setValue(Boolean.TRUE);
                return s3q0.a;
            default:
                int i2 = lv90.v1;
                return (bwf) wh50Var.getValue();
        }
    }
}
