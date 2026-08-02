package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gd9 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ gd9(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((fd9) this.c).invoke(obj);
                break;
            case 1:
                ((c67) this.c).invoke(obj);
                break;
            case 2:
                ((ux50) this.c).invoke(obj);
                break;
            default:
                this.c.invoke(obj);
                break;
        }
    }
}
