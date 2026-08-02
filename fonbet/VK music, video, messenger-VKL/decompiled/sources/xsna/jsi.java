package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jsi implements wb0 {
    public final /* synthetic */ wzs b;

    @Override // xsna.izs
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final qj50 invoke(sj50 sj50Var) {
        isi isiVar = new isi(sj50Var);
        this.b.invoke(isiVar, sj50Var);
        wzs<? super rj50, ? super Action, Object> wzsVar = isiVar.c;
        if (wzsVar != 0) {
            return new wti(isiVar.b, wzsVar, sj50Var);
        }
        throw new IllegalArgumentException("You have forgotten to configure [accept] block in executor DSL");
    }
}
