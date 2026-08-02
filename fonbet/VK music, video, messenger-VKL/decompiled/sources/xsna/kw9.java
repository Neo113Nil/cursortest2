package xsna;

import com.vk.ecomm.cart.impl.cart.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kw9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kw9(k7r k7rVar, izs izsVar, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.f = k7rVar;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                lw9.a((izs) this.c, (a.c) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                v6c.a((r6c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                r8c.a((q8c) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                o4z.b((f5z) this.f, (n5z) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                d8d0 d8d0Var = (d8d0) this.c;
                ztm0 ztm0Var = (ztm0) this.f;
                xvy xvyVar = (xvy) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(336941189, intValue, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.Content.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsContentImpl.kt:96)");
                    }
                    d8d0Var.r(ztm0Var, this.e, xvyVar, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kw9(izs izsVar, a.c cVar, q630 q630Var, int i) {
        this.b = 0;
        this.c = izsVar;
        this.f = cVar;
        this.d = q630Var;
        this.e = i;
    }

    public /* synthetic */ kw9(f5z f5zVar, n5z n5zVar, izs izsVar, int i) {
        this.b = 3;
        this.f = f5zVar;
        this.d = n5zVar;
        this.c = izsVar;
        this.e = i;
    }

    public /* synthetic */ kw9(d8d0 d8d0Var, ztm0 ztm0Var, int i, xvy xvyVar) {
        this.b = 4;
        this.c = d8d0Var;
        this.f = ztm0Var;
        this.e = i;
        this.d = xvyVar;
    }
}
