package xsna;

import xsna.jto0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z9k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ z9k(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = xzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(3457);
                bak.a((String) this.d, this.c, (q630) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((l2o) this.d).b((gzs) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jto0) this.d).b((jto0.b) this.e, (i0b0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z9k(String str, int i, q630 q630Var, izs izsVar, int i2) {
        this.b = 0;
        this.d = str;
        this.c = i;
        this.e = q630Var;
        this.f = izsVar;
    }
}
