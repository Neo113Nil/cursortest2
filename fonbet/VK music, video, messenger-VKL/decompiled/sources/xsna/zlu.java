package xsna;

import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zlu(fsk0 fsk0Var, boolean z) {
        this.b = 1;
        this.d = fsk0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((amu) this.d).k(this.c ? uxd0.q0.h.a : uxd0.q0.g.a);
                break;
            case 1:
                fsk0.k((fsk0) this.d, this.c, false, (gzs) obj, 2);
                break;
            default:
                dun0 dun0Var = (dun0) this.d;
                if (this.c) {
                    dun0Var.f.onNext(s3q0.a);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zlu(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
