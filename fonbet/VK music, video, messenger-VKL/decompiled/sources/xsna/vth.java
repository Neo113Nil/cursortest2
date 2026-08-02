package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vth implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ vth(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((ikv0) obj).a();
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 1:
                this.c.invoke();
                break;
            case 2:
                this.c.invoke();
                break;
            case 3:
                ((ikv0) obj).a();
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
