package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class yd0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yd0(int i, int i2, Object obj, Object obj2, boolean z) {
        this.b = i2;
        this.e = obj;
        this.c = z;
        this.f = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ((ae0) this.e).b(this.c, (jai) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                x8u0.p((b78) this.e, this.c, (q630) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                String str = (String) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                int I3 = ne7.I(1);
                uox0.e(this.d, I3, (androidx.compose.runtime.a) obj, str, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yd0(int i, int i2, String str, q630 q630Var, boolean z) {
        this.b = 2;
        this.e = str;
        this.d = i;
        this.c = z;
        this.f = q630Var;
    }
}
