package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AlbumsItem.kt */
/* loaded from: classes18.dex */
public final class do1 {
    public static final void a(final hr1 hr1Var, final izs izsVar, final boolean z, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        ImageSize Fb;
        androidx.compose.runtime.a M = aVar.M(-981418774);
        int i4 = i2 & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i4 == 0) {
            i3 = (M.J(tpg0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(hr1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.o(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-981418774, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.Album (AlbumsItem.kt:195)");
            }
            List<GoodAlbum> list = hr1Var.a;
            GoodAlbum goodAlbum = list != null ? (GoodAlbum) j5g.b0(i, list) : null;
            if (goodAlbum == null) {
                M.K(-1604050007);
                if (z) {
                    M.K(-1604023750);
                    f9t.e(tpg0Var.b(1.0f, q630.a.a, true), M, 0);
                } else {
                    M.K(-1611261320);
                }
                M.j();
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs() { // from class: xsna.bo1
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            do1.a(hr1.this, izsVar, z, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            M.K(-1611261320);
            M.j();
            q630 b = tpg0Var.b(1.0f, q630Var, true);
            boolean z2 = ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new qn1(izsVar, i, 0);
                M.R(x);
            }
            q630 c = ojc.c(b, false, null, null, (gzs) x, 15);
            Photo photo = goodAlbum.e;
            xi1.b(0, M, (photo == null || (Fb = photo.Fb(176, true)) == null) ? null : Fb.d.d, goodAlbum.d, c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.rn1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    do1.a(hr1.this, izsVar, z, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, hr1 hr1Var, izs izsVar, r820 r820Var, q630 q630Var, w4p0 w4p0Var) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1049870275);
        if ((i & 6) == 0) {
            i2 = (M.J(hr1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(w4p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(r820Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1049870275, i4, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.AlbumsAndGoods (AlbumsItem.kt:140)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            mpl0 mpl0Var = hr1Var.d;
            int i5 = (mpl0Var == null || mpl0Var.d.size() < 3) ? 0 : 1;
            q630.a aVar3 = q630.a.a;
            if (i5 != 0) {
                M.K(385622768);
                q630 E = ahn.E(aVar3, "storefront_viewed_goods_album");
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 g2 = E.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                boolean z = (i4 & 57344) == 16384;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new wn1(izsVar, 0);
                    M.R(x);
                }
                q630 c2 = ojc.c(g2, false, null, null, (gzs) x, 15);
                i3 = i4;
                boolean z2 = ((i4 & 112) == 32) | ((i3 & 896) == 256);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new uf1(2, w4p0Var, r820Var);
                    M.R(x2);
                }
                xi1.f(hpt0.u(176, mpl0Var.d), mpl0Var.b, egi.o(c2, (izs) x2), M, 0);
                M.j();
            } else {
                i3 = i4;
                M.K(386399845);
                a(hr1Var, izsVar, false, 0, ahn.E(aVar3, "storefront_first_album"), M, ((i3 << 3) & 112) | 224262 | ((i3 >> 6) & 896));
                M.j();
            }
            a(hr1Var, izsVar, true, i5 ^ 1, ahn.E(aVar3, "storefront_second_album"), M, ((i3 << 3) & 112) | 199686 | ((i3 >> 6) & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yn1(i, hr1Var, izsVar, r820Var, q630Var, w4p0Var);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, hr1 hr1Var, izs izsVar, r820 r820Var, q630 q630Var, w4p0 w4p0Var) {
        izs izsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1312773515);
        int i2 = i | (M.J(hr1Var) ? 4 : 2) | (M.J(w4p0Var) ? 32 : 16) | (M.y(r820Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1312773515, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.AlbumsItem (AlbumsItem.kt:74)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, vog0.b(20));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            e(hr1Var.c, 0, M, null);
            float f2 = 16;
            b((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i2 << 3) & 57344), M, hr1Var, izsVar, r820Var, s200.G(aVar2, f2, 2, f2, 12), w4p0Var);
            izsVar2 = izsVar;
            if (hr1Var.a == null || !(!r2.isEmpty())) {
                M.K(1752556333);
            } else {
                M.K(1756505485);
                q630 f3 = txj0.f(s200.H(aVar2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                jqu0.a(f3, ylu0Var2.p().a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 12);
                M = M;
                d(((i2 >> 9) & 14) | 48, M, izsVar2, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, aVar2));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            izsVar2 = izsVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tn1(i, hr1Var, izsVar2, r820Var, q630Var2, w4p0Var);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1673646207);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1673646207, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ShowAllButton (AlbumsItem.kt:117)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i3 = i2;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 16;
            String N = d370.N(R.string.community_market_show_all, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.o().a;
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zn1(izsVar, 0);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, N, null, a, new l5g(j), new pco(f2), false, null, null, null, aVar2, X2.b.f, 1605632, 0, 4075488);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ao1(izsVar, q630Var, i, 0);
        }
    }

    public static final void e(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        q630 q630Var2;
        com.vk.core.compose.component.group.header.d dVar;
        androidx.compose.runtime.a M = aVar.M(1355730615);
        int i3 = (M.o(i) ? 4 : 2) | i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1355730615, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.Title (AlbumsItem.kt:217)");
            }
            b.c cVar = b.c.a;
            String N = d370.N(R.string.community_market_albums_count, 0, M);
            if (i > 0) {
                M.K(-1301357598);
                int i4 = com.vk.core.compose.component.defaults.f.h;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-206888136, i4, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.getCustomPrimaryCounter (VkCounterDefaults.kt:36)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().l;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                CounterAppearance.a aVar2 = new CounterAppearance.a(j, ylu0Var2.getText().d);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.core.compose.component.group.header.d a = d.a.a(i, aVar2, null, null, null, M, (i3 & 14) | 196608, 28);
                M.j();
                dVar = a;
            } else {
                M.K(-1301158361);
                M.j();
                dVar = null;
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ht(2);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.f a2 = f.a.a(N, null, dVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, M, 805306368, 442);
            q630Var2 = q630.a.a;
            com.vk.core.compose.component.group.header.g.b(a2, q630Var2, cVar, null, null, null, false, M, Tensorflow.FRAME_WIDTH, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vn1(i, q630Var2, i2);
        }
    }
}
