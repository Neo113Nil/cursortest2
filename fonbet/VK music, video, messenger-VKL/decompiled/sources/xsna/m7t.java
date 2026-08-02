package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.djc;
import xsna.dt1;
import xsna.iev;
import xsna.o9t;
import xsna.phw;
import xsna.q630;

/* compiled from: GameItemMini.kt */
/* loaded from: classes17.dex */
public final class m7t {
    public static final float a = 72;
    public static final float b = 64;
    public static final float c = 20;
    public static final float d = 12;

    public static final void a(g7t g7tVar, izs izsVar, eev eevVar, int i, q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        g7t g7tVar2;
        izs izsVar2;
        int i4;
        q630 q630Var2;
        final eev eevVar2;
        androidx.compose.runtime.a M = aVar.M(489856312);
        if ((i2 & 6) == 0) {
            i3 = (M.J(g7tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(eevVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(489856312, i3, -1, "com.vk.games.presentation.components.items.GamesItemMini (GameItemMini.kt:56)");
            }
            if (uca.a() || eevVar.b.d) {
                g7tVar2 = g7tVar;
                izsVar2 = izsVar;
                i4 = i;
                q630Var2 = q630Var;
                M.K(-989166085);
                c(g7tVar2, izsVar2, eevVar, i4, q630Var2, M, i3 & 65534);
                eevVar2 = eevVar;
                M.j();
            } else {
                M.K(-988922890);
                g7tVar2 = g7tVar;
                izsVar2 = izsVar;
                i4 = i;
                q630Var2 = q630Var;
                b(g7tVar2, izsVar2, eevVar.a, i4, q630Var2, M, i3 & 64638);
                M.j();
                eevVar2 = eevVar;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            g7tVar2 = g7tVar;
            izsVar2 = izsVar;
            i4 = i;
            q630Var2 = q630Var;
            eevVar2 = eevVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final g7t g7tVar3 = g7tVar2;
            final izs izsVar3 = izsVar2;
            final int i5 = i4;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.i7t
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m7t.a(g7t.this, izsVar3, eevVar2, i5, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final g7t g7tVar, final izs izsVar, final boolean z, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-859419647);
        if ((i2 & 6) == 0) {
            i3 = (M.J(g7tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-859419647, i3, -1, "com.vk.games.presentation.components.items.GamesItemMiniDefault (GameItemMini.kt:83)");
            }
            WebImageSize f = g7tVar.e.b.f((int) ((azl) M.r(uvi.h)).I0(pex0.a));
            String str = f != null ? f.b : null;
            uog0 b2 = vog0.b(kqu0.e);
            float f2 = z ? a : b;
            float f3 = (kqu0.s * 2) + f2;
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            q630 v = txj0.v(rte0.d(q630Var, b2), f3);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new j7t(izsVar, g7tVar, i, 0);
                M.R(x);
            }
            q630 c2 = ojc.c(v, false, null, null, (gzs) x, 15);
            float f4 = f2;
            pja0 a2 = HorizontalListItem$VisualContent.c.a(phw.a.a(fwu0.l(null, str, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), M, 0, 6);
            u3k0 a3 = iev.c.a(g7tVar.f, null, 1, null, M, 24576, 45);
            float f5 = kqu0.q;
            float f6 = 0;
            azu0.b(withPicture, a2, a3, c2, new gev(new uco(byc0.b(f3, f4)), new u890(f5, kqu0.r, f5, kqu0.t), new u890(f6, f6, f6, f6), 8), M, 6, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.k7t
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m7t.b(g7t.this, izsVar, z, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final g7t g7tVar, final izs izsVar, eev eevVar, final int i, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1757123081);
        if ((i2 & 6) == 0) {
            i3 = (M.J(g7tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(eevVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1757123081, i3, -1, "com.vk.games.presentation.components.items.GamesItemMiniWithAchievement (GameItemMini.kt:132)");
            }
            int I0 = (int) ((azl) M.r(uvi.h)).I0(pex0.a);
            WebPhoto webPhoto = g7tVar.e;
            String str = g7tVar.f;
            WebImageSize f = webPhoto.b.f(I0);
            String str2 = f != null ? f.b : null;
            float f2 = eevVar.a ? a : b;
            float f3 = kqu0.s;
            q630 d2 = rte0.d(txj0.v(q630Var, (2 * f3) + f2), vog0.b(kqu0.e));
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.l7t
                    @Override // xsna.gzs
                    public final Object invoke() {
                        izs.this.invoke(new o9t.m(new djc.b(g7tVar.d, Integer.valueOf(i), null, null)));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630 c2 = ojc.c(d2, false, null, null, (gzs) x, 15);
            float f4 = kqu0.q;
            q630 G = s200.G(c2, f4, kqu0.r, f4, kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, G);
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
            float f5 = f2;
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
            k9q0.w(M, c3, dVar);
            cp10 d3 = ja8.d(dt1.a.h, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            String str3 = str2;
            sy90 D2 = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c4 = qri.c(M, aVar3);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            lg90 l = fwu0.l(null, str3, null, null, M, 0, 61);
            q630 q = txj0.q(aVar3, f5);
            float f6 = kqu0.f;
            vjw.a(l, null, r18.a((float) 0.5d, wlb0.h(M).getImage().a, rte0.d(q, vog0.b(f6)), vog0.b(f6)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            androidx.compose.runtime.a aVar4 = M;
            if (g7tVar.g) {
                aVar4.K(508081950);
                float f7 = 4;
                q630 m = hr80.m(rte0.d(txj0.q(kci.l(ra8.a.b(aVar3, dt1.a.j), f7, f7), c), vog0.a), wlb0.h(aVar4).q().e, androidx.compose.ui.graphics.e.a);
                i4 = 0;
                cp10 d4 = ja8.d(dt1.a.f, false);
                int hashCode3 = Long.hashCode(n34.n(aVar4));
                sy90 D3 = aVar4.D();
                q630 c5 = qri.c(aVar4, m);
                if (aVar4.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar4.H();
                if (aVar4.L()) {
                    aVar4.I(aVar2);
                } else {
                    aVar4.f();
                }
                k9q0.w(aVar4, d4, cVar);
                k9q0.w(aVar4, D3, eVar);
                ur.d(hashCode3, aVar4, bVar, aVar4, c2678a);
                k9q0.w(aVar4, c5, dVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-935654142, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash12> (VkSdkIcons.kt:904)");
                }
                lg90 b2 = or.b(aVar4, 265374120, R.drawable.vk_icon_flash_12, aVar4, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(b2, null, txj0.q(aVar3, d), wlb0.h(aVar4).getIcon().c, aVar4, 440, 0);
                aVar4 = aVar4;
                aVar4.G();
            } else {
                i4 = 0;
                aVar4.K(501444509);
            }
            aVar4.j();
            aVar4.G();
            if (eevVar.b.d) {
                aVar4.K(559566163);
                androidx.compose.runtime.a aVar5 = aVar4;
                ntu0.c(ws2.b(str, aVar4, i4), s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.l(aVar4).i0, wlb0.h(aVar4).getText().m, 1, false, false, true, null, 3, null, 0, null, aVar5, 12607488, 0, 7520);
                M = aVar5;
                M.j();
            } else {
                aVar4.K(560063186);
                androidx.compose.runtime.a aVar6 = aVar4;
                yqv0.c(str, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar4).getText().m, null, null, 0, 3, null, 2, false, 0, 1, null, wlb0.l(aVar4).s0, aVar6, 100663296, 48, 5816);
                M = aVar6;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dna(g7tVar, izsVar, eevVar, i, q630Var, i2);
        }
    }
}
