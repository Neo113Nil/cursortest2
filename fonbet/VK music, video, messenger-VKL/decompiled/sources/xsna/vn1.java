package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vn1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;

    public /* synthetic */ vn1(int i, q630 q630Var, int i2) {
        this.b = 0;
        this.d = i;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                do1.e(this.d, ne7.I(1), aVar, this.c);
                break;
            case 1:
                s4c.a(this.c, aVar, ne7.I(this.d | 1));
                break;
            default:
                ybo.h(this.c, aVar, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vn1(q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = q630Var;
        this.d = i;
    }
}
