package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kos implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ kos(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((jos) this.c).invoke(obj);
                break;
            case 1:
                ((g2w) this.c).invoke(obj);
                break;
            case 2:
                ((qej) this.c).invoke(obj);
                break;
            case 3:
                ((jos) this.c).invoke(obj);
                break;
            default:
                ((g2w) this.c).invoke(obj);
                break;
        }
    }
}
