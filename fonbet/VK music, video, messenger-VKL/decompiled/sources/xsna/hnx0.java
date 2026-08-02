package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.p5g;
import xsna.phw;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetListItemCell.kt */
/* loaded from: classes17.dex */
public final class hnx0 {
    public static final void a(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1864071516);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1864071516, i2, -1, "com.vk.community.design.compose.widget.list.WidgetImage (WidgetListItemCell.kt:120)");
            }
            q630 H = s200.H(q630.a.a, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            phw a = phw.a.a(fwu0.l(str, null, null, null, M, i2 & 14, 62), null, null, null, null, M, 196616, 30);
            float f = 32;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldu0.b(a, f, H, null, p5g.a.a((float) 0.5d, 199680, 22, ylu0Var.getImage().a, M, false), false, null, null, null, M, Tensorflow.FRAME_WIDTH, 488);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fne(str, i, 14);
        }
    }

    public static final void b(pox0.b.C3524b c3524b, boolean z, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        float f;
        int i4;
        String str;
        androidx.compose.runtime.a M = aVar.M(1015580205);
        if ((i & 6) == 0) {
            i2 = (M.J(c3524b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1015580205, i2, -1, "com.vk.community.design.compose.widget.list.WidgetListItemCell (WidgetListItemCell.kt:34)");
            }
            String str2 = c3524b.a;
            String str3 = c3524b.c;
            boolean z2 = !(str3 == null || drm0.N(str3));
            int i5 = i2 & 7168;
            int i6 = i2 & 14;
            boolean z3 = (i5 == 2048) | (i6 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new ofx0(1, izsVar, c3524b);
                M.R(x);
            }
            float f2 = 8;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, ojc.c(q630Var, z2, null, null, (gzs) x, 14));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (str2 != null) {
                M.K(-1196017029);
                a(str2, M, 0);
            } else {
                M.K(-1197829103);
            }
            M.j();
            if (str2 == null) {
                i3 = 16;
                f = 16;
            } else {
                i3 = 16;
                f = f2;
            }
            float f3 = z ? i3 : f2;
            q630.a aVar4 = q630.a.a;
            q630 H = s200.H(txj0.f(aVar4, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(txj0.f(aVar4, 1.0f), "CommunityProfileWidgetCardTitle");
            String str4 = c3524b.b;
            if (str4 == null) {
                str4 = "";
            }
            boolean z4 = false;
            yqv0.c(str4, E, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).h0, M, 100663344, 48, 5880);
            aVar2 = M;
            String str5 = c3524b.f;
            if (str5 == null || drm0.N(str5)) {
                i4 = -286161381;
                aVar2.K(-286161381);
            } else {
                aVar2.K(-283521173);
                i4 = -286161381;
                yqv0.c(c3524b.f, s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).i0, aVar2, 100663344, 48, 5880);
                aVar2 = aVar2;
            }
            aVar2.j();
            String str6 = c3524b.g;
            if (str6 == null || drm0.N(str6)) {
                aVar2.K(i4);
            } else {
                aVar2.K(-283048082);
                androidx.compose.runtime.a aVar5 = aVar2;
                yqv0.c(c3524b.g, s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar5).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar5).i0, aVar5, 100663344, 48, 5880);
                aVar2 = aVar5;
            }
            aVar2.j();
            String str7 = c3524b.h;
            if (str7 == null || drm0.N(str7)) {
                aVar2.K(i4);
            } else {
                aVar2.K(-282575518);
                androidx.compose.runtime.a aVar6 = aVar2;
                yqv0.c(c3524b.h, ahn.E(s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "CommunityProfileWidgetCardDescription"), wlb0.h(aVar6).getText().m, null, null, 0, 0, null, 2, false, 0, 3, null, wlb0.l(aVar6).i0, aVar6, 100663344, 48, 5880);
                aVar2 = aVar6;
            }
            aVar2.j();
            String str8 = c3524b.d;
            if (str8 == null || drm0.N(str8) || (str = c3524b.e) == null || drm0.N(str)) {
                aVar2.K(i4);
            } else {
                aVar2.K(-281939491);
                boolean z5 = i5 == 2048;
                if (i6 == 4) {
                    z4 = true;
                }
                boolean z6 = z5 | z4;
                Object x2 = aVar2.x();
                if (z6 || x2 == c0012a) {
                    x2 = new gnx0(0, izsVar, c3524b);
                    aVar2.R(x2);
                }
                androidx.compose.runtime.a aVar7 = aVar2;
                yqv0.c(c3524b.d, ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, ojc.c(aVar4, false, null, null, (gzs) x2, 15)), "CommunityProfileCardWidgetButton"), wlb0.h(aVar7).getText().c, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar7).h0, aVar7, 100663296, 48, 5880);
                aVar2 = aVar7;
            }
            aVar2.j();
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new okq(c3524b, z, q630Var, izsVar, i);
        }
    }
}
