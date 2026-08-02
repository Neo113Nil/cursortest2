package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class udl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ udl(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke();
                return s3q0.a;
            default:
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    return (s3q0) gzsVar.invoke();
                }
                return null;
        }
    }
}
