package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vyv0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ vyv0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((wgm0) this.c).invoke(obj);
                break;
            case 1:
                ((hoh) this.c).invoke(obj);
                break;
            case 2:
                ((pst0) this.c).invoke(obj);
                break;
            default:
                ((pst0) this.c).invoke(obj);
                break;
        }
    }
}
