package xsna;

import xsna.nx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class acj implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ acj(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((zbj) this.c).invoke(obj);
                break;
            case 1:
                ((nx50.g) this.c).invoke(obj);
                break;
            default:
                ((gq40) this.c).invoke(obj);
                break;
        }
    }
}
