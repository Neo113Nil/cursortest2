package xsna;

import android.content.Context;
import xsna.kyl;
import xsna.q630;
import xsna.xxl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class byl implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ byl(Context context, xxl.c cVar, izs izsVar, wh50 wh50Var) {
        this.c = context;
        this.d = cVar;
        this.e = izsVar;
        this.f = wh50Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                xxl.c cVar = (xxl.c) this.d;
                izs izsVar = (izs) this.e;
                mtk0 mtk0Var = (mtk0) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1221335782, intValue, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapScreenContent.<anonymous>.<anonymous> (DeliveryPointsMapScreen.kt:83)");
                    }
                    kxl.a(context, (kyl.c) mtk0Var.getValue(), cVar, izsVar, ahn.E(txj0.d(q630.a.a, 1.0f), "delivery_points_map_view"), aVar, 24576);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                sc40.a((String) this.c, (String) this.d, (lg90) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(3585));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ byl(String str, String str2, lg90 lg90Var, q630 q630Var, int i) {
        this.c = str;
        this.d = str2;
        this.e = lg90Var;
        this.f = q630Var;
    }
}
