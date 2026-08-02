package xsna;

import xsna.amw0;
import xsna.edw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cpd implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cpd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((dpd) this.c).j = false;
                break;
            case 1:
                ((pzr) this.c).h.onDestroy();
                break;
            case 2:
                ((bdw0) this.c).T(new edw0.b.a(false));
                break;
            default:
                ((vlw0) this.c).T(new amw0.b.C2554b(false));
                break;
        }
    }
}
