package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jui implements omf0 {
    public final /* synthetic */ izs b;

    @Override // xsna.gzs
    public final Object invoke() {
        iui iuiVar = new iui();
        this.b.invoke(iuiVar);
        wzs<? super em50, ? super Patch, Object> wzsVar = iuiVar.a;
        if (wzsVar != 0) {
            return new yti(iuiVar.b, wzsVar);
        }
        throw new IllegalArgumentException("You have forgotten to configure [reduce] block in executor DSL");
    }
}
