package xsna;

import xsna.oug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class czz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ czz(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((j67) this.c).invoke(obj);
                break;
            case 1:
                ((j67) this.c).invoke(obj);
                break;
            case 2:
                ((v2b0) this.c).invoke(obj);
                break;
            default:
                ((oug0.a) this.c).invoke(obj);
                break;
        }
    }
}
