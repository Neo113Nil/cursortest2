package xsna;

import android.text.SpannableString;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.dto.group.GroupMarketInfo;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ru.ok.gl.tf.Tensorflow;
import xsna.ar20;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.us2;
import xsna.wkj;
import xsna.zq20;

/* compiled from: GroupHeaderItem.kt */
/* loaded from: classes18.dex */
public final class sku {
    public static final void a(pju pjuVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.f fVar;
        androidx.compose.runtime.a M = aVar.M(-377318817);
        if ((i & 6) == 0) {
            i2 = (M.J(pjuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-377318817, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.CommunitySite (GroupHeaderItem.kt:483)");
            }
            String str = pjuVar.m;
            if (str == null || drm0.N(str)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new u7d(pjuVar, izsVar, i, 1);
                    fVar.d = wzsVar;
                }
                return;
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-576005502, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GlobeOutline20> (VkIcons.kt:3120)");
            }
            lg90 b = or.b(M, -1385390045, R.drawable.vk_icon_globe_outline_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            zq20 a = zq20.a.a(b, null, null, M, 24584, 14);
            String str2 = pjuVar.m;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new x50(20);
                M.R(x);
            }
            ar20 a2 = ar20.a.a(str2, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
            MiniInfoCell$Mode miniInfoCell$Mode = MiniInfoCell$Mode.Link;
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new mse(izsVar, 1);
                M.R(x2);
            }
            b4v0.a(a2, miniInfoCell$Mode, null, a, null, (gzs) x2, null, M, 48, 84);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new jnc(pjuVar, izsVar, i, 1);
            fVar.d = wzsVar;
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, List list, final izs izsVar) {
        int i3;
        final List list2;
        androidx.compose.runtime.a aVar2;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1968065081);
        int i5 = i2 & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i5 == 0) {
            i3 = (M.J(tpg0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1968065081, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.FriendsPart (GroupHeaderItem.kt:407)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            int i6 = i3 & 896;
            boolean z = i6 == 256;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new nq0(izsVar, 3);
                M.R(x2);
            }
            q630.a aVar3 = q630.a.a;
            q630 b = ojc.b(aVar3, sg50Var, null, false, null, (gzs) x2, 28);
            us2.b bVar = new us2.b();
            String d = uqm0.d(i);
            String i7 = uqm0.i(i, R.plurals.community_market_friends, R.string.community_friends_formatted, true);
            SpannableString spannableString = rik0.a;
            bVar.f(spannableString);
            bVar.g(i7);
            bVar.d(new hik0(0L, 0L, b6s.k, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), spannableString.length(), spannableString.length() + d.length());
            us2 n = bVar.n();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                i4 = i3;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i4 = i3;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = i4;
            yqv0.d(n, b, ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8184);
            f9t.e(tpg0Var.b(1.0f, aVar3, true), M, 0);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = ir.h(M);
            }
            sg50 sg50Var2 = (sg50) x3;
            boolean z2 = i6 == 256;
            Object x4 = M.x();
            if (z2 || x4 == obj) {
                x4 = new yt7(izsVar, 3);
                M.R(x4);
            }
            q630 b2 = ojc.b(aVar3, sg50Var2, null, false, null, (gzs) x4, 28);
            boolean z3 = (i8 & 112) == 32;
            Object x5 = M.x();
            if (z3 || x5 == obj) {
                list2 = list;
                x5 = new fre(list2, 28);
                M.R(x5);
            } else {
                list2 = list;
            }
            hyv0.c(b2, null, null, (izs) x5, M, 0, 6);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            list2 = list;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nku
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i2 | 1);
                    sku.b(i, I, (androidx.compose.runtime.a) obj2, list2, izsVar);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(pju pjuVar, izs izsVar, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(883425669);
        int i2 = i | (M.J(pjuVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | (M.J(q630Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(883425669, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GroupHeader (GroupHeaderItem.kt:144)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            float f2 = 20;
            q630 m = hr80.m(f, j, vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3));
            float f3 = 3;
            float f4 = 16;
            q630 H = s200.H(m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i4 = i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            e(pjuVar, izsVar, M, i4);
            q630.a aVar3 = q630.a.a;
            f9t.e(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 6);
            a(pjuVar, izsVar, M, i4);
            g(pjuVar, izsVar, M, i4);
            f(pjuVar.t, pjuVar.a, pjuVar.b, pjuVar.c, s200.H(aVar3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), izsVar, M, ((i3 << 12) & 458752) | 24576);
            jaiVar2 = jaiVar;
            if (er.f(6, M, jaiVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vyn(i, 1, pjuVar, q630Var, izsVar, jaiVar2);
        }
    }

    public static final void d(pju pjuVar, final sll0 sll0Var, final rg50 rg50Var, final boolean z, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        pju pjuVar2;
        final izs<? super hjl0, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(-1582268854);
        int i2 = (M.J(pjuVar) ? 4 : 2) | i | (M.J(sll0Var) ? 32 : 16) | (M.J(rg50Var) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1582268854, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GroupHeader (GroupHeaderItem.kt:94)");
            }
            int I0 = (int) ((azl) M.r(uvi.h)).I0(8);
            boolean o = M.o(I0) | ((i2 & 896) == 256);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = new vva(rg50Var, I0, 1);
                M.R(x);
            }
            pjuVar2 = pjuVar;
            c(pjuVar2, izsVar, sv1.z(q630.a.a, (izs) x), kai.c(-353395348, new pku(z, sll0Var, izsVar), M), M, (i2 & 14) | 3072 | ((i2 >> 9) & 112));
            izsVar2 = izsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            pjuVar2 = pjuVar;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final pju pjuVar3 = pjuVar2;
            s.d = new wzs(sll0Var, rg50Var, z, izsVar2, i) { // from class: xsna.rku
                public final /* synthetic */ sll0 c;
                public final /* synthetic */ rg50 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    sku.d(pju.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(pju pjuVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super hjl0, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        int i3;
        com.vk.core.compose.component.cell.content.x xVar;
        boolean z;
        boolean z2;
        int i4;
        a.C0011a.C0012a c0012a;
        int i5;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i6;
        int i7;
        Float f = pjuVar.q;
        androidx.compose.runtime.a M = aVar.M(1458176331);
        if ((i & 6) == 0) {
            i2 = i | (M.J(pjuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i8 = i2;
        if (M.t(i8 & 1, (i8 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1458176331, i8, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GroupHeaderInfoCell (GroupHeaderItem.kt:186)");
            }
            int i9 = i8 & 112;
            boolean z3 = i9 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z3 || x == c0012a2) {
                x = new d97(izsVar, 2);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            lg90 l = fwu0.l(null, pjuVar.d, null, null, M, 0, 61);
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = new j60(25);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.t a = com.vk.core.compose.component.cell.content.e.a(phw.a.a(l, null, wkj.a.a, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 197000, 10), Cell$Left.Main.Size.Small, null, null, null, null, null, M, 100663344, 252);
            androidx.compose.runtime.a aVar3 = M;
            String str = pjuVar.e;
            if (pjuVar.f) {
                aVar3.K(1232650211);
                if (androidx.compose.runtime.b.d()) {
                    i6 = -1;
                    i7 = 0;
                    androidx.compose.runtime.b.f(2124872764, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified20> (VkSdkIcons.kt:3656)");
                } else {
                    i6 = -1;
                    i7 = 0;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_verified_20, i7, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i7, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = i6;
                xVar = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(a2, ylu0Var.getIcon().a, null, null, aVar3, 24584, 12);
                aVar3 = aVar3;
                aVar3.j();
            } else {
                i3 = -1;
                aVar3.K(1232861259);
                aVar3.j();
                xVar = null;
            }
            Object x3 = aVar3.x();
            if (x3 == c0012a2) {
                x3 = new gzn(8);
                aVar3.R(x3);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str, null, xVar, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, aVar4, 12610560, 66);
            androidx.compose.runtime.a aVar5 = aVar4;
            int i10 = i8 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1926203044, i10, i3, "com.vk.ecomm.storefront.impl.community.presentation.ui.getSubtitle (GroupHeaderItem.kt:242)");
            }
            String str2 = pjuVar.j;
            Integer num = pjuVar.r;
            if (f == null || num == null) {
                z = true;
                z2 = false;
                if (str2 != null) {
                    aVar5.K(1544324956);
                    us2 e = ws2.e(str2);
                    boolean z4 = ((i10 ^ 6) > 4 && aVar5.J(pjuVar)) || (i8 & 6) == 4;
                    Object x4 = aVar5.x();
                    if (z4 || x4 == c0012a2) {
                        x4 = new h2s(pjuVar, 5);
                        aVar5.R(x4);
                    }
                    i4 = i10;
                    i5 = 4;
                    c0012a = c0012a2;
                    com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.c.b.a(e, null, 1, 2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, aVar5, 805309824, 434);
                    aVar5 = aVar5;
                    aVar5.j();
                    h1Var = a4;
                } else {
                    i4 = i10;
                    c0012a = c0012a2;
                    i5 = 4;
                    aVar5.K(1544690817);
                    aVar5.j();
                    h1Var = null;
                }
            } else {
                aVar5.K(1543344395);
                String str3 = brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1)), ".", StringUtils.COMMA) + ((Object) rik0.a) + d370.F(R.plurals.community_review_count, num.intValue(), new Object[]{num}, aVar5, 0);
                String str4 = d370.N(R.string.community_market_rating_accessibility, 0, aVar5) + ' ' + str3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(171813404, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
                }
                lg90 b = or.b(aVar5, -1107727797, R.drawable.vk_icon_favorite_16, aVar5, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.core.compose.component.cell.content.x a5 = com.vk.core.compose.component.cell.content.h.a(b, ylu0Var2.q().i, aVar5, 24968, 8);
                boolean J = aVar5.J(str4);
                Object x5 = aVar5.x();
                if (J || x5 == c0012a2) {
                    x5 = new kf5(str4, 2);
                    aVar5.R(x5);
                }
                z = true;
                z2 = false;
                com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str3, 0, a5, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar5, 12582912, 86);
                aVar5 = aVar5;
                aVar5.j();
                h1Var = b2;
                i4 = i10;
                c0012a = c0012a2;
                i5 = 4;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(a3, h1Var, null, null, aVar5, 196608, 28);
            Boolean bool = pjuVar.s;
            boolean z5 = pjuVar.t;
            boolean z6 = i4 == i5 ? z : z2;
            Object x6 = aVar5.x();
            if (z6 || x6 == c0012a) {
                x6 = new ire(pjuVar, 20);
                aVar5.R(x6);
            }
            com.vk.core.compose.component.semantics.a a7 = com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3);
            boolean z7 = i4 == i5 ? z : z2;
            if (i9 != 32) {
                z = z2;
            }
            boolean z8 = z7 | z;
            Object x7 = aVar5.x();
            if (z8 || x7 == c0012a) {
                izsVar2 = izsVar;
                x7 = new sk(16, pjuVar, izsVar2);
                aVar5.R(x7);
            } else {
                izsVar2 = izsVar;
            }
            gzs gzsVar = (gzs) x7;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(857415356, 24576, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.SubscriptionButtonCell.Companion.invoke (SubscriptionButtonCell.kt:91)");
            }
            Object x8 = aVar5.x();
            if (x8 == c0012a) {
                x8 = new pxm0(bool, z5, gzsVar, a7);
                aVar5.R(x8);
            }
            pxm0 pxm0Var = (pxm0) x8;
            ((zak0) pxm0Var.c).setValue(gzsVar);
            ((zak0) pxm0Var.a).setValue(bool);
            ((zak0) pxm0Var.b).setValue(Boolean.valueOf(z5));
            ((zak0) pxm0Var.d).setValue(a7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar6 = aVar5;
            wiu0.b(c, false, a, a6, pxm0Var, null, null, aVar6, 0, 98);
            aVar2 = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qvi(pjuVar, izsVar2, i, 1);
        }
    }

    public static final void f(final boolean z, final int i, final int i2, final List list, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(799237949);
        if ((i3 & 6) == 0) {
            i4 = (M.l(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(list) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(799237949, i4, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.GroupSubscribersInfo (GroupHeaderItem.kt:339)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, m200.u(q630Var, IntrinsicSize.Max));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "storefront_group_subscriber_status_icon");
            if (z) {
                i5 = 1464592866;
                i6 = R.drawable.vk_icon_check_20;
            } else {
                i5 = 1464693306;
                i6 = R.drawable.vk_icon_users_outline_20;
            }
            int i8 = i4;
            pzu0.b(or.b(M, i5, i6, M, 0), null, E, wlb0.h(M).getText().p, M, 440, 0);
            f9t.e(txj0.v(aVar3, 12), M, 6);
            if (z) {
                M.K(1464968679);
                h(izsVar, M, (i8 >> 15) & 14);
            } else {
                M.K(1451935969);
            }
            M.j();
            if (i > 0) {
                M.K(1465094074);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                boolean z2 = (i8 & 458752) == 131072;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new ln7(izsVar, 4);
                    M.R(x2);
                }
                q630 b = ojc.b(aVar3, sg50Var, null, false, null, (gzs) x2, 28);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                String d = uqm0.d(i);
                sb.append(uqm0.i(i, R.plurals.community_market_subscribers, R.string.community_market_subscribers_formatted, true));
                arrayList.add(new us2.b.a(0, d.length(), 8, new hik0(0L, 0L, b6s.j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531)));
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    StringBuilder sb3 = sb;
                    arrayList2.add(((us2.b.a) arrayList.get(i9)).a(sb3.length()));
                    i9++;
                    sb = sb3;
                }
                i7 = 1451935969;
                yqv0.d(new us2(sb2, arrayList2), b, wlb0.h(M).getText().p, 0, null, 0, false, 0, null, null, wlb0.l(M).d0, M, 0, 0, 8184);
                M = M;
            } else {
                i7 = 1451935969;
                M.K(1451935969);
            }
            M.j();
            if (i2 <= 0 || z) {
                M.K(i7);
            } else {
                M.K(1466348954);
                b(i2, ((i8 >> 6) & 112) | 6 | ((i8 >> 9) & 896) | ((i8 << 3) & 7168), M, list, izsVar);
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
            s.d = new wzs() { // from class: xsna.mku
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sku.f(z, i, i2, list, q630Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(pju pjuVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> ubhVar;
        androidx.compose.runtime.a M = aVar.M(-1119532807);
        if ((i & 6) == 0) {
            i2 = (M.J(pjuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1119532807, i3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ShopConditions (GroupHeaderItem.kt:459)");
            }
            GroupMarketInfo.b bVar = pjuVar.h;
            if (bVar != null && !bVar.b) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    ubhVar = new a8d(pjuVar, izsVar, i, 2);
                    s.d = ubhVar;
                }
                return;
            }
            qzu0.a.getClass();
            zq20 a = zq20.a.a(qzu0.d0(M), null, null, M, 24584, 14);
            String N = d370.N(R.string.community_market_payment_delivery_return, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new jt(27);
                M.R(x);
            }
            ar20 a2 = ar20.a.a(N, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
            MiniInfoCell$Mode miniInfoCell$Mode = MiniInfoCell$Mode.Link;
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new nhf(izsVar, 2);
                M.R(x2);
            }
            b4v0.a(a2, miniInfoCell$Mode, null, a, null, (gzs) x2, null, M, 48, 84);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            ubhVar = new ubh(pjuVar, izsVar, i, 3);
            s.d = ubhVar;
        }
    }

    public static final void h(izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1779458519);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1779458519, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.SubscribeText (GroupHeaderItem.kt:282)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            q630 E = ahn.E(aVar2, "storefront_group_subscriber_status");
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new loi(1, wh50Var);
                M.R(x2);
            }
            q630 c2 = ojc.c(E, false, null, null, (gzs) x2, 15);
            String str = d370.N(R.string.community_market_you_subscribed, 0, M) + ((Object) rik0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, c2, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            M = M;
            i(izsVar, wh50Var, M, (i2 & 14) | Tensorflow.FRAME_WIDTH);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oku(izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(izs izsVar, wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1178284619);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1178284619, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.UnsubscribePopup (GroupHeaderItem.kt:309)");
            }
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new bk6(1, wh50Var);
                M.R(x);
            }
            oqu0.b(booleanValue, (gzs) x, aVar2, ty6Var, 0L, null, null, false, null, kai.c(-1884643141, new qku(0, wh50Var, izsVar), M), M, (i2 & 896) | 3072, 6, 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qol(izsVar, wh50Var, i);
        }
    }
}
