package xsna;

import xsna.r27;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b43 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ b43(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((a43) this.c).invoke(obj);
                break;
            case 1:
                ((r27.a) this.c).invoke(obj);
                break;
            default:
                this.c.invoke(obj);
                break;
        }
    }
}
