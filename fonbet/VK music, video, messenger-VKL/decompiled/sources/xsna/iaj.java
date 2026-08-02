package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iaj implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ iaj(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((haj) this.c).invoke(obj);
                break;
            case 1:
                ((i45) this.c).invoke(obj);
                break;
            case 2:
                ((i45) this.c).invoke(obj);
                break;
            default:
                ((haj) this.c).invoke(obj);
                break;
        }
    }
}
