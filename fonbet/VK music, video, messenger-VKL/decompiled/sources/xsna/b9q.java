package xsna;

import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b9q implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b9q(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((c9q) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((iy20) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.c | 1);
                ((fi80) this.d).a(q630.a.a, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                ((m8d0) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ b9q(fi80 fi80Var, int i) {
        this.b = 2;
        this.d = fi80Var;
        this.c = i;
    }
}
