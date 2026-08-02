package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ggk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ggk(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tny tnyVar = (tny) obj;
                this.c.invoke(p490.e(tnyVar.D(0L), pli.w(tnyVar.a())));
                break;
            default:
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(obj);
                }
                break;
        }
        return s3q0.a;
    }
}
