package xsna;

import xsna.kyl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class owl implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ owl(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                pwl.a((izs) this.d, (kyl.e) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((cxn) this.d).c((gzs) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((tzn) this.d).b((gzs) this.e, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                s050.h((l050) this.d, (q630) this.f, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((yqs0) this.e).a((ksr) this.f, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ owl(l050 l050Var, q630 q630Var, gzs gzsVar, int i) {
        this.b = 3;
        this.d = l050Var;
        this.f = q630Var;
        this.e = gzsVar;
        this.c = i;
    }

    public /* synthetic */ owl(yqs0 yqs0Var, ksr ksrVar, izs izsVar, int i) {
        this.b = 4;
        this.e = yqs0Var;
        this.f = ksrVar;
        this.d = izsVar;
        this.c = i;
    }
}
