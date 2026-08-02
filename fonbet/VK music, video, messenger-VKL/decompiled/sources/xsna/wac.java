package xsna;

import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wac implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wac(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = z;
        this.d = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                fbc.a((dz40.d) this.e, (izs) this.f, this.c, (q630) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(3073);
                zzj.a(this.c, (gzs) this.e, (gzs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(1);
                ulu.a((String) this.e, (String) this.f, this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(1);
                or70.a(this.c, (String) this.e, (izs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wac(int i, int i2, Object obj, xzs xzsVar, q630 q630Var, boolean z) {
        this.b = i2;
        this.c = z;
        this.e = obj;
        this.f = xzsVar;
        this.d = q630Var;
    }
}
