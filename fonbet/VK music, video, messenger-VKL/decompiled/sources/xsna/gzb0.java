package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gzb0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ gzb0(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                this.c.invoke();
                break;
        }
        return s3q0.a;
    }
}
