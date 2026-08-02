package xsna;

import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e4c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e4c(int i, int i2, Object obj, Object obj2, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.e = xzsVar;
        this.f = obj2;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                i4c.e((v8s) this.d, (izs) this.e, (xvy) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(3073);
                phz.b((pos0) this.d, (gzs) this.e, (gzs) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(1);
                nd10.a((String) this.d, (xvy) this.f, this.c, (izs) this.e, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(1);
                com.vk.ecomm.market.good.ui.restriction.d.a((ProductCardRestrictionViewState) this.d, (izs) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e4c(String str, xvy xvyVar, q630 q630Var, izs izsVar, int i) {
        this.b = 2;
        this.d = str;
        this.f = xvyVar;
        this.c = q630Var;
        this.e = izsVar;
    }
}
