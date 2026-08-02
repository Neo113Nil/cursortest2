package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cdw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ cdw(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ikv0 ikv0Var = (ikv0) obj;
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                ikv0Var.a();
                break;
            default:
                this.c.invoke();
                break;
        }
        return s3q0.a;
    }
}
