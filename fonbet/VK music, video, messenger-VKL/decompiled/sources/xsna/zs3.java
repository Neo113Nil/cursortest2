package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zs3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zs3(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                dt3.a((jt3) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((clm0) this.d).Z0(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                uuq0.a((us2) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zs3(us2 us2Var, int i) {
        this.b = 2;
        this.d = us2Var;
        this.c = i;
    }
}
