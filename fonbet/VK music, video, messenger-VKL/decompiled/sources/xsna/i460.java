package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i460 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ i460(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((h460) this.c).invoke(obj);
                break;
            case 1:
                ((y240) this.c).invoke(obj);
                break;
            case 2:
                ((ps3) this.c).invoke(obj);
                break;
            default:
                ((d0t0) this.c).invoke(obj);
                break;
        }
    }
}
