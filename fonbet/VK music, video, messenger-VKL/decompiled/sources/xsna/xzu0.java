package xsna;

import xsna.nrw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xzu0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ xzu0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((cim0) this.c).invoke(obj);
                break;
            case 1:
                ((abv0) this.c).invoke(obj);
                break;
            case 2:
                ((cim0) this.c).invoke(obj);
                break;
            default:
                ((nrw0.c) this.c).invoke(obj);
                break;
        }
    }
}
