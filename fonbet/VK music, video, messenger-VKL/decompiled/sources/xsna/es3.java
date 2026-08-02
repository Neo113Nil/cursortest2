package xsna;

import xsna.loh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class es3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ es3(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, izs izsVar) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((fs3) this.e).d((a8a) this.f, (ds3) this.g, (izs) this.c, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                aft.a((String) this.e, (String) this.f, (String) this.g, (gzs) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.market.good.ui.j) this.e).c((zv9) this.f, (gzs) this.g, (gzs) this.c, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((koh0) this.e).j((loh0.e.a) this.f, (c1h) this.g, (lop0) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ es3(Object obj, Object obj2, Object obj3, xzs xzsVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = xzsVar;
        this.h = q630Var;
        this.d = i;
    }
}
