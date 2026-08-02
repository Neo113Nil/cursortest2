package xsna;

import android.view.View;
import xsna.szb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lty implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lty(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                cuy cuyVar = (cuy) this.c;
                cuyVar.d = new vzc0((hty) this.d, (ytm0) this.e, (g0d0) this.f);
                return new mty(cuyVar, 0);
            default:
                szb0 szb0Var = (szb0) this.c;
                View view = (View) this.d;
                szb0Var.e(view, (szb0.a) this.e, true, (gzs) this.f);
                szb0Var.b.remove(view);
                return s3q0.a;
        }
    }
}
