package xsna;

import xsna.c9p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1b0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g1b0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((i1b0) this.d).m(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((sjg0) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((xfl0) this.d).q6(this.c, I, (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((c9p0.c) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ g1b0(xfl0 xfl0Var, int i, int i2) {
        this.b = 2;
        this.d = xfl0Var;
        this.c = i;
    }

    public /* synthetic */ g1b0(c9p0.c cVar, int i) {
        this.b = 3;
        this.d = cVar;
        this.c = i;
    }
}
