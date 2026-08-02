package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m21 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m21(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                l0y l0yVar = (l0y) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(l0yVar.a));
                    break;
                }
                break;
            default:
                this.c.invoke(obj);
                break;
        }
    }
}
