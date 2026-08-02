package xsna;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.hmd0;
import xsna.q630;

/* compiled from: ProductCardAdminInfoBanner.kt */
/* loaded from: classes18.dex */
public final class fjd0 {
    public static final void a(hmd0 hmd0Var, izs izsVar, izs izsVar2, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(209768578);
        int i2 = i | (M.J(hmd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(209768578, i2, -1, "com.vk.ecomm.market.good.ui.holder.reject.ProductCardAdminInfoBanner (ProductCardAdminInfoBanner.kt:53)");
            }
            long j = wlb0.h(M).getBackground().x;
            float f = kqu0.e;
            q630 D = s200.D(r18.a((float) 0.5d, wlb0.h(M).getImage().c, hr80.m(q630Var, j, vog0.b(f)), vog0.b(f)), kqu0.v);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = hmd0Var.a;
            CharSequence charSequence = hmd0Var.e;
            q630.a aVar4 = q630.a.a;
            yqv0.c(str, ahn.E(aVar4, "product_card_soft_block_banner_title"), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).J, M, 48, 0, 8184);
            yqv0.c(hmd0Var.b, o19.a(s200.H(ahn.E(aVar4, "product_card_soft_block_banner_subtitle"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0.72f), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).d0, M, 0, 0, 8184);
            if (charSequence != null) {
                M.K(-457349715);
                c(charSequence, izsVar, ahn.E(aVar4, "product_card_soft_block_banner_info_link"), M, (i2 & 112) | 384);
            } else {
                M.K(-460659926);
            }
            M.j();
            hmd0.a aVar5 = hmd0Var.c;
            hmd0.a aVar6 = hmd0Var.d;
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new byb(izsVar2, 1);
                M.R(x);
            }
            b(aVar5, aVar6, (izs) x, gzsVar, null, M, i2 & 7168);
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
            s.d = new ao7(hmd0Var, izsVar, izsVar2, gzsVar, q630Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e4, code lost:
    
        if (r13.y(r1) != false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(hmd0.a aVar, hmd0.a aVar2, izs izsVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar3, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar4;
        q630 q630Var2;
        int i3;
        q630.a aVar5;
        int i4;
        a.C0011a.C0012a c0012a;
        q630.a aVar6;
        hmd0.a aVar7;
        boolean z;
        boolean z2;
        Object x;
        androidx.compose.runtime.a M = aVar3.M(1581269624);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(aVar) : M.y(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(aVar2) : M.y(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        int i5 = i2 | 24576;
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1581269624, i5, -1, "com.vk.ecomm.market.good.ui.holder.reject.ProductCardRejectActions (ProductCardAdminInfoBanner.kt:142)");
            }
            if (aVar == null && aVar2 == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new kiy(aVar, aVar2, izsVar, gzsVar2, i);
                    return;
                }
                return;
            }
            float f = kqu0.t;
            q630.a aVar8 = q630.a.a;
            q630 H = s200.H(aVar8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar9 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar9);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (aVar != null) {
                M.K(-1976339643);
                int i6 = i5 & 14;
                boolean z3 = (i6 == 4 || ((i5 & 8) != 0 && M.y(aVar))) | ((i5 & 896) == 256);
                Object x2 = M.x();
                if (z3 || x2 == c0012a2) {
                    x2 = new mh3(23, izsVar, aVar);
                    M.R(x2);
                }
                i4 = i5;
                aVar5 = aVar8;
                c0012a = c0012a2;
                i3 = -1981773850;
                bhu0.e((gzs) x2, ButtonSize.Small, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(aVar8, "product_card_soft_block_banner_primary_button"), null, false, false, null, null, null, d(aVar, M, i6), null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                M = M;
            } else {
                i3 = -1981773850;
                aVar5 = aVar8;
                i4 = i5;
                c0012a = c0012a2;
                M.K(-1981773850);
            }
            M.j();
            if (aVar2 != null) {
                M.K(-1975824578);
                int i7 = i4;
                boolean z4 = (i7 & 896) == 256;
                if ((i7 & 112) != 32) {
                    if ((i7 & 64) != 0) {
                        aVar7 = aVar2;
                    } else {
                        aVar7 = aVar2;
                    }
                    z = false;
                    z2 = z | z4;
                    x = M.x();
                    if (!z2 || x == c0012a) {
                        x = new d5(22, izsVar, aVar7);
                        M.R(x);
                    }
                    q630.a aVar10 = aVar5;
                    androidx.compose.runtime.a aVar11 = M;
                    aVar6 = aVar10;
                    bhu0.e((gzs) x, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Accent, ahn.E(aVar10, "product_card_soft_block_banner_secondary_button"), null, false, false, null, null, null, d(aVar7, M, (i7 >> 3) & 14), null, null, null, null, false, null, null, null, aVar11, 28080, 0, 0, 4190176);
                    M = aVar11;
                    M.j();
                    i4 = i7;
                } else {
                    aVar7 = aVar2;
                }
                z = true;
                z2 = z | z4;
                x = M.x();
                if (!z2) {
                }
                x = new d5(22, izsVar, aVar7);
                M.R(x);
                q630.a aVar102 = aVar5;
                androidx.compose.runtime.a aVar112 = M;
                aVar6 = aVar102;
                bhu0.e((gzs) x, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Accent, ahn.E(aVar102, "product_card_soft_block_banner_secondary_button"), null, false, false, null, null, null, d(aVar7, M, (i7 >> 3) & 14), null, null, null, null, false, null, null, null, aVar112, 28080, 0, 0, 4190176);
                M = aVar112;
                M.j();
                i4 = i7;
            } else {
                aVar6 = aVar5;
                M.K(i3);
                M.j();
            }
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            qzu0.a.getClass();
            lg90 t0 = qzu0.t0(M);
            String N = d370.N(R.string.product_card_reject_info_icon_description, 0, M);
            q630.a aVar12 = aVar6;
            q630 g2 = ahn.E(aVar12, "product_card_soft_block_banner_details_button").g(new gor0(dt1.a.l));
            float f2 = 20;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, t0, N, g2, f2, ylu0Var.getIcon().n, false, null, false, null, null, M, ((i4 >> 9) & 14) | 24640, 1984);
            aVar4 = M;
            aVar4.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar12;
        } else {
            aVar4 = M;
            aVar4.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = aVar4.s();
        if (s2 != null) {
            s2.d = new a9t(aVar, aVar2, izsVar, gzsVar, q630Var2, i, 2);
        }
    }

    public static final void c(Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        List list;
        androidx.compose.runtime.a M = aVar.M(-1783693769);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1783693769, i2, -1, "com.vk.ecomm.market.good.ui.holder.reject.ProductCardRejectInfoLink (ProductCardAdminInfoBanner.kt:108)");
            }
            String obj2 = obj.toString();
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) charSequence;
                list = rl3.u0(spannedString.getSpans(0, spannedString.length(), qjc.class));
            } else if (charSequence instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                list = rl3.u0(new SpannableString(spannableStringBuilder).getSpans(0, spannableStringBuilder.length(), qjc.class));
            } else {
                list = EmptyList.b;
            }
            qjc qjcVar = (qjc) j5g.a0(list);
            String i3 = qjcVar != null ? qjcVar.i() : null;
            if (i3 == null || i3.length() == 0) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new q5v(obj, izsVar, q630Var, i, 2);
                    fVar.d = wzsVar;
                }
                return;
            }
            Object x = M.x();
            Object obj3 = a.C0011a.a;
            if (x == obj3) {
                x = new xht(23);
                M.R(x);
            }
            q630 d = rte0.d(s200.H(egi0.b(q630Var, false, (izs) x), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), vog0.b(4));
            boolean J = M.J(i3) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == obj3) {
                x2 = new cm(25, izsVar, i3);
                M.R(x2);
            }
            q630 H = s200.H(ojc.c(d, false, null, null, (gzs) x2, 15), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 5.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 6.5d, 5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(obj2, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        fVar = aVar2.s();
        if (fVar != null) {
            wzsVar = new ty5(i, 5, obj, izsVar, q630Var);
            fVar.d = wzsVar;
        }
    }

    public static final String d(hmd0.a aVar, androidx.compose.runtime.a aVar2, int i) {
        String a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1320730557, i, -1, "com.vk.ecomm.market.good.ui.holder.reject.resolveActionButtonText (ProductCardAdminInfoBanner.kt:197)");
        }
        if (aVar instanceof hmd0.a.b) {
            a = zq.a(aVar2, -2088248721, R.string.reject_info_holder_delete, aVar2, 0);
        } else {
            if (!(aVar instanceof hmd0.a.C3009a)) {
                throw alb0.c(-2088250608, aVar2);
            }
            a = zq.a(aVar2, -2088245619, R.string.reject_info_holder_edit, aVar2, 0);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
