package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ cf4(int i, gzs gzsVar) {
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
            case 1:
                gzs gzsVar2 = this.c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                break;
            default:
                this.c.invoke();
                break;
        }
        return s3q0.a;
    }
}
