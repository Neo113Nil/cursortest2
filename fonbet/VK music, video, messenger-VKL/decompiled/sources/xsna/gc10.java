package xsna;

import android.content.Context;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.good.ui.c;
import xsna.kjf0;

/* compiled from: MarketProductMarketBusInteractor.kt */
/* loaded from: classes18.dex */
public final class gc10 {
    public final bpn0 a = new bpn0(new f4(23));

    public static void a(cxo cxoVar, Context context) {
        Good good = cxoVar.r;
        com.vk.ecomm.market.good.ui.c a = good == null ? null : c.a.a(context, new com.vk.ecomm.market.good.ui.b(good, cxoVar.v, cxoVar.u, cxoVar.O, cxoVar.y, cxoVar.W, cxoVar.d0));
        if (a == null) {
            return;
        }
        cxoVar.c.a(cxoVar, kjf0.a.a(5, a));
    }

    public static void b(cxo cxoVar, Context context) {
        com.vk.ecomm.market.good.ui.d dVar;
        Good good = cxoVar.r;
        com.vk.ecomm.market.good.ui.c a = good == null ? null : c.a.a(context, new com.vk.ecomm.market.good.ui.b(good, cxoVar.v, cxoVar.u, cxoVar.O, cxoVar.y, cxoVar.W, cxoVar.d0));
        if (a == null || (dVar = cxoVar.D) == null) {
            return;
        }
        dVar.a(a);
    }
}
