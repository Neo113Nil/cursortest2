package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mni implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ mni(int i, wh50 wh50Var) {
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
                wh50Var.setValue(3);
                break;
            case 1:
                break;
            case 2:
                if (!jjc.d().a()) {
                    un20.f(wh50Var, true);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            default:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
