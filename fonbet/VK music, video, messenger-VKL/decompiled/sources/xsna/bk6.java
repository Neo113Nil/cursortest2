package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bk6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ bk6(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) this.c.getValue();
                bool.getClass();
                return bool;
            default:
                this.c.setValue(Boolean.FALSE);
                return s3q0.a;
        }
    }
}
