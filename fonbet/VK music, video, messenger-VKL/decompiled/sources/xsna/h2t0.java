package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2t0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ h2t0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((vyq0) this.c).invoke(obj);
                break;
            case 1:
                ((ie8) this.c).invoke(obj);
                break;
            case 2:
                ((svk0) this.c).invoke(obj);
                break;
            default:
                ((iqw0) this.c).invoke(obj);
                break;
        }
    }
}
