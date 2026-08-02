package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class meo implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ meo(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                weo.c(this.c, true);
                return s3q0.a;
            case 1:
                this.c.setValue(Boolean.TRUE);
                return s3q0.a;
            default:
                return (tny) this.c.getValue();
        }
    }
}
