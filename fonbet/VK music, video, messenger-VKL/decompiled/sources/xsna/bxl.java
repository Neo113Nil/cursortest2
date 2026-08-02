package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointDistance;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;

/* compiled from: DeliveryPointsList.kt */
/* loaded from: classes18.dex */
public final class bxl {

    /* compiled from: DeliveryPointsList.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryPointDistance.Unit.values().length];
            try {
                iArr[DeliveryPointDistance.Unit.METERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryPointDistance.Unit.KILOMETERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1637104865);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1637104865, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.Address (DeliveryPointsList.kt:180)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
            yqv0.c(str, q630Var2, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.m0, M, (i2 & 14) | 100663344, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s70(str, q630Var2, i, 3);
        }
    }

    public static final void b(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(269063790);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(269063790, i3, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryIcon (DeliveryPointsList.kt:154)");
            }
            q630 q = txj0.q(q630Var, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            squ0 squ0Var = (squ0) M.r(rrv0.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var.getClass();
            float f = tqu0.c;
            long j = udu.a;
            long c = l5g.c(14, j, 0.4f);
            long c2 = l5g.c(14, j, 0.4f);
            uog0 uog0Var = vog0.a;
            q630 m = hr80.m(a5j0.b(q, f, uog0Var, false, c, c2, 4), f870.c(i), uog0Var);
            float f2 = (float) 1.2d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(r18.a(f2, ylu0Var.m().c, m, uog0Var), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wwl(i, q630Var, i2);
        }
    }

    public static final void c(izs izsVar, i5u0 i5u0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String O;
        androidx.compose.runtime.a M = aVar.M(-1826093270);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(i5u0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1826093270, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointPreview (DeliveryPointsList.kt:76)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.presenter.c(9, izsVar, i5u0Var);
                M.R(x);
            }
            q630 H = s200.H(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(f, false, null, null, (gzs) x, 15)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7);
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 1, new xpy(1.0f, true));
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(3), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Object obj = i5u0Var.a;
            DeliveryPointDistance deliveryPointDistance = i5u0Var.b;
            DeliveryPoint deliveryPoint = (DeliveryPoint) obj;
            f(deliveryPoint.f, deliveryPoint.e, deliveryPoint.i, null, M, 0);
            a(((DeliveryPoint) i5u0Var.a).g.b, null, M, 0);
            M.G();
            if (deliveryPointDistance.d) {
                M.K(-759992796);
                M.K(-1409987662);
                DeliveryPointDistance.Unit unit = deliveryPointDistance.c;
                float f2 = deliveryPointDistance.b;
                int i3 = a.$EnumSwitchMapping$0[unit.ordinal()];
                if (i3 == 1) {
                    M.K(277838150);
                    O = d370.O(R.string.ecomm_delivery_points_distance_in_meters, new Object[]{Integer.valueOf((int) f2)}, M);
                    M.j();
                } else {
                    if (i3 != 2) {
                        throw alb0.c(-960870931, M);
                    }
                    M.K(278047338);
                    O = d370.O(R.string.ecomm_delivery_points_distance_in_kilometers, new Object[]{Float.valueOf(f2)}, M);
                    M.j();
                }
                M.j();
                e(O, null, M, 0);
            } else {
                M.K(-763918636);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ri1(i, 3, izsVar, i5u0Var, q630Var);
        }
    }

    public static final void d(izs izsVar, kyl.e.C3216e c3216e, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(8132162);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(c3216e) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(8132162, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsList (DeliveryPointsList.kt:45)");
            }
            q630 j = txj0.j(190, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, j);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            uyl.a(null, M, 0);
            q630 E = ahn.E(q630.a.a, "delivery_points_map_sheet_points_list");
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nk0(11, c3216e, izsVar);
                M.R(x);
            }
            lqy.a(E, null, null, null, null, null, false, null, (izs) x, M, 6, 510);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xwl(izsVar, c3216e, q630Var, i, 0);
        }
    }

    public static final void e(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1380623714);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1380623714, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.Distance (DeliveryPointsList.kt:195)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.m0;
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            q630Var2 = q630.a.a;
            yqv0.c(str, q630Var2, j, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, M, i3, 48, 6136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iq8(str, q630Var2, i, 2);
        }
    }

    public static final void f(String str, DeliveryPoint.Service service, DeliveryPoint.PlaceMark placeMark, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1110315610);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.o(service.ordinal()) ? 32 : 16) | (M.J(placeMark) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1110315610, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.Title (DeliveryPointsList.kt:127)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            b(stk0.a(placeMark, service), 48, M, s200.H(aVar3, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            q630 H = s200.H(txj0.f(aVar3, 1.0f), 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, H, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.N, aVar2, (i2 & 14) | 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vwl(str, service, placeMark, q630Var2, i, 0);
        }
    }
}
