package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn8 implements j18 {
    public final /* synthetic */ izs b;

    public /* synthetic */ qn8(izs izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        i18 i18Var = new i18();
        this.b.invoke(i18Var);
        izs<? super Bootstrapper, ? extends State> izsVar = i18Var.c;
        if (izsVar != 0) {
            return new bjl(izsVar, i18Var.b, i18Var.a);
        }
        throw new IllegalArgumentException("You have forgotten to configure [prepareInstantState] block in bootstrapper DSL");
    }
}
