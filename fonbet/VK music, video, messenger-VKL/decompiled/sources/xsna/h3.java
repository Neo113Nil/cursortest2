package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ h3(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 1:
                wh50 wh50Var = this.c;
                if (wh50Var != null) {
                    break;
                }
                break;
            case 2:
                this.c.setValue(2);
                break;
            case 3:
                this.c.setValue(Boolean.TRUE);
                break;
            default:
                this.c.setValue(Boolean.FALSE);
                break;
        }
        return s3q0.a;
    }
}
