package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jt7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jt7(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ((kt7) this.e).a(this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((u8i0) this.e).a(this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }
}
