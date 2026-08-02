package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sui implements t5o0 {
    public final /* synthetic */ wzs b;

    @Override // xsna.izs
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final mn50 invoke(nn50 nn50Var) {
        rui ruiVar = new rui(nn50Var);
        this.b.invoke(ruiVar, nn50Var);
        wzs<? super qk50, ? super Task, Object> wzsVar = ruiVar.b;
        if (wzsVar != 0) {
            return new aui(ruiVar.c, wzsVar, nn50Var);
        }
        throw new IllegalArgumentException("You have forgotten to configure [execute] block in executor DSL");
    }
}
