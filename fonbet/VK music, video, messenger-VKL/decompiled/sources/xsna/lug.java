package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.components.channel.MediaType;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lug implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lug(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                mug.a((MediaType) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((toj) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                r6l.f((uu20) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                final qld0 qld0Var = (qld0) this.c;
                final old0 old0Var = (old0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1975628738, intValue, -1, "com.vk.ecomm.market.good.good2.presentation.maininfo.ProductCardMainInfoHolder.onBind.<anonymous> (ProductCardMainInfoHolder.kt:38)");
                    }
                    if (qld0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        final float f = qld0Var.a ? 0 : kqu0.v;
                        rrv0.d(null, null, null, null, kai.c(820613923, new wzs() { // from class: xsna.mld0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(820613923, intValue2, -1, "com.vk.ecomm.market.good.good2.presentation.maininfo.ProductCardMainInfoHolder.onBind.<anonymous>.<anonymous> (ProductCardMainInfoHolder.kt:48)");
                                    }
                                    MarketProductCardMainInfo marketProductCardMainInfo = qld0.this.b;
                                    old0 old0Var2 = old0Var;
                                    boolean y = aVar2.y(old0Var2);
                                    Object x = aVar2.x();
                                    if (y || x == a.C0011a.a) {
                                        x = new mgz(old0Var2, 25);
                                        aVar2.R(x);
                                    }
                                    com.vk.ecomm.design.compose.product_info.g.a(marketProductCardMainInfo, (izs) x, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar2, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar), aVar, 24576, 15);
                        s3q0 s3q0Var = s3q0.a;
                        boolean y = aVar.y(old0Var);
                        Object x = aVar.x();
                        if (y || x == a.C0011a.a) {
                            x = new nld0(old0Var, null);
                            aVar.R(x);
                        }
                        bap.g(s3q0Var, (wzs) x, aVar, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                inx0.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar, q630.a.a);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lug(qld0 qld0Var, old0 old0Var) {
        this.b = 3;
        this.c = qld0Var;
        this.d = old0Var;
    }
}
