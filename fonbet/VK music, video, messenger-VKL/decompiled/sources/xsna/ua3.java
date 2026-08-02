package xsna;

import xsna.nb3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ua3 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ua3(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((nb3.a) this.c).invoke(obj);
                break;
            case 1:
                ((ta3) this.c).invoke(obj);
                break;
            case 2:
                ((zww) this.c).invoke(obj);
                break;
            default:
                ((ob60) this.c).invoke(obj);
                break;
        }
    }
}
