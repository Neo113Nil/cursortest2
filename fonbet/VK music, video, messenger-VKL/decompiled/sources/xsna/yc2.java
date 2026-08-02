package xsna;

import xsna.xzj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class yc2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yc2(Object obj, q630 q630Var, int i, int i2) {
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
                dd2.a(this.c, (jai) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                ((gwo) this.e).a(this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                nz40.d((xzj.b) this.e, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                sbq0.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yc2(q630 q630Var, jai jaiVar, int i) {
        this.b = 0;
        this.c = q630Var;
        this.e = jaiVar;
        this.d = i;
    }
}
