package xsna;

import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.MarketDiscountBadgeStyle;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.design.compose.tile.VkMarket$BadgesTinColor;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.vid0;

/* compiled from: BadgeContent.kt */
/* loaded from: classes18.dex */
public final class wy5 {
    public final wh50 a;

    public wy5(MarketProductTileConfig.a aVar) {
        this.a = androidx.compose.runtime.k.b(aVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-206959409);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-206959409, i2, -1, "com.vk.ecomm.design.compose.tile.impl.badges.BadgeContent.Content (BadgeContent.kt:52)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1536711014);
            for (vid0 vid0Var : ((MarketProductTileConfig.a) ((zak0) this.a).getValue()).a) {
                if (vid0Var instanceof vid0.c) {
                    M.K(144750566);
                    c(ahn.E(q630.a.a, "product_ozon_badge"), M, (i2 & 112) | 6);
                    M.j();
                } else if (vid0Var instanceof vid0.a) {
                    M.K(144949958);
                    sw00.b(((vid0.a) vid0Var).a, null, MarketDiscountBadgeStyle.Accent, M, 384, 2);
                    M.j();
                } else if (vid0Var instanceof vid0.b) {
                    M.K(145214884);
                    b((vid0.b) vid0Var, null, M, (i2 << 3) & 896);
                    M.j();
                } else {
                    M.K(-1103690646);
                    M.j();
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy5(this, q630Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(vid0.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        lg90 lg90Var;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-874283651);
        if ((i & 6) == 0) {
            i2 = i | (M.J(bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            q630.a aVar3 = q630.a.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-874283651, i2, -1, "com.vk.ecomm.design.compose.tile.impl.badges.BadgeContent.MarketProductTileIntegrationBadge (BadgeContent.kt:113)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                TypedValue typedValue = krv0.a;
                x = androidx.compose.runtime.k.b(Boolean.valueOf(epx.f(krv0.i(krv0.b != null ? dhr0.E() : null), Boolean.FALSE)));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new me2(1, wh50Var);
                M.R(x2);
            }
            bap.c(s3q0Var, (izs) x2, M, 54);
            ely elyVar = bVar.a;
            if (elyVar == null) {
                M.K(-1101770489);
                M.j();
                lg90Var = null;
            } else {
                M.K(-1101770488);
                lg90 l = fwu0.l(((Boolean) wh50Var.getValue()).booleanValue() ? elyVar.a : elyVar.b, null, null, null, M, 0, 62);
                M.j();
                lg90Var = l;
            }
            if (lg90Var != null) {
                M.K(-1101639234);
                Integer num = bVar.a.c;
                aVar2 = aVar3;
                q630 d = rte0.d(txj0.u(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, num != null ? num.intValue() : 37, bVar.a.d != null ? r0.intValue() : 20, 3), vog0.b(6));
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
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
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                r0v0.a(lg90Var, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 12582920, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.G();
            } else {
                aVar2 = aVar3;
                M.K(-1106864315);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ty5(i, 0, this, bVar, q630Var2);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        long a;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-316636249);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-316636249, i, -1, "com.vk.ecomm.design.compose.tile.impl.badges.BadgeContent.MarketProductTileOzonWithTextBadge (BadgeContent.kt:80)");
            }
            VkMarket$BadgesTinColor vkMarket$BadgesTinColor = VkMarket$BadgesTinColor.Ozon;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(536985982, 6, -1, "com.vk.ecomm.design.compose.tile.getColorResourceByTint (functions.kt:8)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-195662435, 6, -1, "com.vk.ecomm.design.compose.tile.getColorBackgroundByType (functions.kt:15)");
            }
            int i3 = i0t.$EnumSwitchMapping$0[vkMarket$BadgesTinColor.ordinal()];
            if (i3 == 1) {
                M.K(946965617);
                a = s7g.a(R.color.ecomm_design_ozon_badge_light, M);
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(946963994, M);
                }
                M.K(946969382);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = ylu0Var.q().m;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = s200.E(hr80.m(q630Var, a, vog0.b(6)), 5, kqu0.q);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            yqv0.c(d370.N(R.string.product_tile_ozon_badge_title, 0, M), s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).R0.b(M), M, 48, 0, 8184);
            f9t.e(txj0.v(aVar4, 4), M, 6);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-2025794586, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoOzon14H> (VkIcons.kt:6888)");
            } else {
                i2 = 0;
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_logo_ozon_14h, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a3, null, null, wlb0.h(M).getText().d, M, 56, 4);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ks3(this, q630Var, i, 1);
        }
    }
}
