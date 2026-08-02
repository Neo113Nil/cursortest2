package xsna;

import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import xsna.nn20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xmd implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xmd(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((and) this.d).h((gnd) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.product_info.g.a((MarketProductCardMainInfo) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((nn20) this.d).c((nn20.a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            case 3:
                ((Integer) obj2).getClass();
                fob0.a((izs) this.c, (yrb0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                ((Integer) obj2).getClass();
                ((cic0) this.d).o((wpc0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xmd(MarketProductCardMainInfo marketProductCardMainInfo, izs izsVar, q630 q630Var, int i) {
        this.b = 1;
        this.d = marketProductCardMainInfo;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ xmd(izs izsVar, yrb0 yrb0Var, q630 q630Var, int i) {
        this.b = 3;
        this.c = izsVar;
        this.d = yrb0Var;
        this.e = q630Var;
    }
}
