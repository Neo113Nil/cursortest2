package xsna;

import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nx9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nx9(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                gzs gzsVar = (gzs) this.f;
                ((Integer) obj2).getClass();
                ox9.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, gzsVar, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                fbc.n((dz40.d.k) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((pkg0) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }
}
