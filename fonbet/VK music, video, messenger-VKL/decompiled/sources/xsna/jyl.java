package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.xxl;

/* compiled from: DeliveryPointsMapToolbar.kt */
/* loaded from: classes18.dex */
public final class jyl {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(xxl.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2067042656);
        int i2 = i | (M.J(dVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2067042656, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapToolbar (DeliveryPointsMapToolbar.kt:22)");
            }
            wh50 d = jk50.d(dVar.a, Boolean.FALSE, M, 48);
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.ecomm_delivery_points_toolbar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            lg90 m = m200.m(M);
            String N = d370.N(R.string.accessibility_back, 0, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new c97(izsVar, 1);
                M.R(x);
            }
            boolean z2 = false;
            TopBar$Before.e a2 = TopBar$Before.e.a.a(m, N, (gzs) x, null, null, null, M, 1572872, 56);
            androidx.compose.runtime.a aVar3 = M;
            com.vk.core.compose.component.topbar.a aVar4 = null;
            if (((Boolean) d.getValue()).booleanValue()) {
                aVar3.K(-1972526342);
                lg90 p = m200.p(aVar3);
                String N2 = d370.N(R.string.ecomm_courier_map_toolbar_search, 0, aVar3);
                if (i3 == 32) {
                    z2 = true;
                }
                Object x2 = aVar3.x();
                if (z2 || x2 == c0012a) {
                    x2 = new iyl(izsVar, 0);
                    aVar3.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                Object x3 = aVar3.x();
                if (x3 == c0012a) {
                    x3 = new com.vk.movika.sdk.base.observable.i(23);
                    aVar3.R(x3);
                }
                d.c.C0760d a3 = d.c.C0760d.a.a(p, N2, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar3, 1572872, 24);
                aVar3 = aVar3;
                aVar4 = d.a.a(a3, null, null, null, aVar3, 24576, 14);
                aVar3.j();
            } else {
                aVar3.K(-1972020547);
                aVar3.j();
            }
            androidx.compose.runtime.a aVar5 = aVar3;
            muv0.h(a, q630Var, null, null, null, a2, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 48, 0, 8092);
            aVar2 = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new br0(i, 5, (Object) dVar, izsVar, q630Var);
        }
    }
}
