package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.p7t;
import xsna.q630;

/* compiled from: GameItemWithBadge.kt */
/* loaded from: classes17.dex */
public final class o7t {
    public static final uog0 a;
    public static final uog0 b;

    static {
        float f = kqu0.a;
        a = vog0.b(kqu0.f);
        b = vog0.b(kqu0.e);
    }

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1754481784);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1754481784, i, -1, "com.vk.games.presentation.components.items.AchievementLabelBadge (GameItemWithBadge.kt:181)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.j;
            ra8 ra8Var = ra8.a;
            q630.a aVar2 = q630.a.a;
            q630 b2 = ra8Var.b(aVar2, ty6Var);
            float f = 6;
            q630 q = txj0.q(kci.l(b2, f, f), 24);
            float f2 = 12;
            q630 d = rte0.d(q, vog0.b(f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.q().e, androidx.compose.ui.graphics.e.a);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-935654142, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash12> (VkSdkIcons.kt:904)");
            }
            lg90 b3 = or.b(M, 265374120, R.drawable.vk_icon_flash_12, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b3, null, txj0.q(aVar2, f2), ylu0Var2.getIcon().c, M, 440, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aad(i, 5);
        }
    }

    public static final void b(h8t h8tVar, izs izsVar, i8t i8tVar, rha rhaVar, q630 q630Var, q630 q630Var2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-279594974);
        if ((i & 6) == 0) {
            i2 = (M.J(h8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(i8tVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(rhaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var2) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-279594974, i2, -1, "com.vk.games.presentation.components.items.GameItem (GameItemWithBadge.kt:90)");
            }
            q630 d = rte0.d(q630Var, b);
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dyc(izsVar, h8tVar, i8tVar, 2);
                M.R(x);
            }
            q630 c = ojc.c(d, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            float f = 6;
            int i4 = i2;
            q630 G = s200.G(txj0.d(q630.a.a, 1.0f), f, 4, f, 8);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, G);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            c(h8tVar, i8tVar, q630Var2, M, ((i4 >> 3) & 112) | i3 | ((i4 >> 9) & 896));
            String str = h8tVar.e;
            GameCatalogBadge gameCatalogBadge = h8tVar.g;
            d(str, h8tVar.f, rhaVar.d, M, 0);
            M.G();
            if (gameCatalogBadge != null) {
                M.K(1432306357);
                h7t.a(gameCatalogBadge, M, 0);
            } else {
                M.K(1428058086);
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
            s.d = new ibo(h8tVar, izsVar, i8tVar, rhaVar, q630Var, q630Var2, i);
        }
    }

    public static final void c(h8t h8tVar, i8t i8tVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-566980654);
        if ((i & 6) == 0) {
            i2 = (M.J(h8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(i8tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-566980654, i2, -1, "com.vk.games.presentation.components.items.GameItemImage (GameItemWithBadge.kt:127)");
            }
            if (uca.a()) {
                M.K(1185886851);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.h, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630.a.a);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                f(h8tVar, i8tVar, q630Var, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                if (h8tVar.j) {
                    M.K(731122170);
                    a(6, M);
                } else {
                    M.K(726421361);
                }
                M.j();
                M.G();
                M.j();
            } else {
                M.K(1186185691);
                f(h8tVar, i8tVar, q630Var, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j8k(h8tVar, i8tVar, q630Var, i, 1);
        }
    }

    public static final void d(String str, String str2, boolean z, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-525743744);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-525743744, i2, -1, "com.vk.games.presentation.components.items.GameItemTextContent (GameItemWithBadge.kt:205)");
            }
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(1314016178);
                ntu0.c(ws2.b(str, M, i2 & 14), s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.l(M).T, wlb0.h(M).getText().m, 1, false, false, false, null, 0, null, 0, null, M, 24624, 0, 8160);
                M = M;
                if (str2 != null) {
                    M.K(1314305253);
                    ntu0.c(ws2.b(str2, M, (i2 >> 3) & 14), s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.l(M).Y, wlb0.h(M).getText().p, 1, false, false, false, null, 0, null, 0, null, M, 24624, 0, 8160);
                    M = M;
                } else {
                    M.K(1307474434);
                }
                M.j();
                M.j();
            } else {
                M.K(1314641696);
                yqv0.c(str, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).d0, M, (i2 & 14) | 100663344, 48, 5880);
                if (str2 != null) {
                    M.K(1314939420);
                    yqv0.c(str2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, ((i2 >> 3) & 14) | 100663344, 48, 5880);
                } else {
                    M.K(1307474434);
                }
                M.j();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ih2(i, 1, str, str2, z);
        }
    }

    public static final void e(h8t h8tVar, izs izsVar, i8t i8tVar, rha rhaVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        p7t p7tVar = i8tVar.c;
        androidx.compose.runtime.a M = aVar.M(-907082408);
        if ((i & 6) == 0) {
            i2 = (M.J(h8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(i8tVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(rhaVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-907082408, i2, -1, "com.vk.games.presentation.components.items.GameItemWithBadge (GameItemWithBadge.kt:53)");
            }
            boolean z = p7tVar instanceof p7t.a;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(172176702);
                p7t.a aVar3 = (p7t.a) p7tVar;
                b(h8tVar, izsVar, i8tVar, rhaVar, txj0.v(q630Var, aVar3.a), txj0.h(txj0.v(aVar2, aVar3.c), aVar3.b), M, i2 & 8190);
                M.j();
            } else {
                if (!epx.f(p7tVar, p7t.b.a)) {
                    throw alb0.c(172175056, M);
                }
                M.K(172189496);
                b(h8tVar, izsVar, i8tVar, rhaVar, txj0.f(q630Var, 1.0f), sua.d(1.0f, txj0.f(aVar2, 1.0f), false), M, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n7t(h8tVar, izsVar, i8tVar, rhaVar, q630Var, i);
        }
    }

    public static final void f(h8t h8tVar, i8t i8tVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3 = i8tVar.b;
        androidx.compose.runtime.a M = aVar.M(863751740);
        if ((i & 6) == 0) {
            i2 = (M.J(h8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(i8tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(863751740, i2, -1, "com.vk.games.presentation.components.items.ImageBox (GameItemWithBadge.kt:153)");
            }
            float f = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getImage().a;
            uog0 uog0Var = a;
            q630 d = rte0.d(r18.a(f, j, q630Var, uog0Var), uog0Var);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.h, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            lg90 l = fwu0.l(null, h8tVar.h, null, null, M, 0, 61);
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 a2 = ra8Var.a(aVar3);
            int i4 = i8tVar.a;
            boolean o = M.o(i3) | M.o(i4);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = "gameWithBadgeImageItem_" + i3 + '_' + i4;
                M.R(x);
            }
            vjw.a(l, null, ahn.E(a2, (String) x), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            c8t c8tVar = h8tVar.i;
            if (c8tVar == null) {
                M.K(1539402730);
            } else {
                M.K(1539402731);
                f8t.a(c8tVar, s200.D(aVar3, 8), M, 48);
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
            s.d = new pha(h8tVar, i8tVar, q630Var, i, 4);
        }
    }
}
