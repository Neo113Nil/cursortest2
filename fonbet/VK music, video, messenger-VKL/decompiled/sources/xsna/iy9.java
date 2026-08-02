package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class iy9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iy9(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                ny9.d(ne7.I(1), this.c, (androidx.compose.runtime.a) obj, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                lt40.h((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((fsv0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ iy9(q630 q630Var, int i, int i2) {
        this.b = 0;
        this.d = q630Var;
        this.c = i2;
    }
}
