package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetTiles.kt */
/* loaded from: classes17.dex */
public final class yox0 {
    public static final void a(pox0.h hVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i2;
        String str;
        String str2;
        q630.a aVar3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(-363670942);
        int i8 = 2;
        int i9 = 32;
        int i10 = i | (M.J(hVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        int i11 = 0;
        if (M.t(i10 & 1, (i10 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-363670942, i10, -1, "com.vk.community.design.compose.widget.tiles.WidgetTiles (WidgetTiles.kt:38)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            String str3 = hVar.a.a;
            q630 r = p490.r(s200.H(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (str3 == null || str3.length() == 0) ? kqu0.v : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), p490.x(M), 14);
            float f2 = kqu0.u;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, r);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1490840838);
            for (pox0.h.a aVar5 : hVar.b) {
                String str4 = aVar5.c;
                pox0.h.a.b bVar = aVar5.d;
                M.K(1490842373);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                q630.a aVar6 = q630.a.a;
                if (str4 == null || drm0.N(str4)) {
                    q630Var2 = aVar6;
                } else {
                    int i12 = ((i10 & 112) == i9 ? 1 : i11) | (M.J(str4) ? 1 : 0);
                    Object x = M.x();
                    if (i12 != 0 || x == c0012a) {
                        x = new wo1(str4, izsVar);
                        M.R(x);
                    }
                    q630Var2 = ojc.c(aVar6, false, null, null, (gzs) x, 15);
                }
                M.j();
                float f4 = kqu0.s;
                q630 F2 = s200.F(f4, f3, i8, q630Var2);
                float f5 = kqu0.r;
                float f6 = kqu0.t;
                q630 H = s200.H(F2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, 5);
                float f7 = zox0.a;
                q630 v = txj0.v(H, f7);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, i11);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, v);
                cri.h7.getClass();
                LayoutNode.a aVar7 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar7);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                androidx.compose.runtime.a aVar8 = M;
                int i13 = i10;
                gdv0.d(phw.a.a(fwu0.l(bVar != null ? bVar.a : null, null, null, null, aVar8, 0, 62), null, null, null, null, aVar8, 196616, 30), byc0.b(f7, f7 / (bVar != null ? bVar.b : 1.0f)), EmptyList.b, txj0.v(aVar6, f7), null, null, null, aVar8, 3456, 112);
                androidx.compose.runtime.a aVar9 = aVar8;
                String str5 = aVar5.a;
                if (str5 == null || str5.length() == 0) {
                    i2 = 830861257;
                    str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    aVar3 = aVar6;
                    aVar9.K(830861257);
                } else {
                    aVar9.K(834150667);
                    String str6 = aVar5.a;
                    q630 H2 = s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    aVar3 = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar9.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar9.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    i2 = 830861257;
                    str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                    yqv0.c(str6, H2, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.d0, aVar9, 100663296, 48, 5880);
                    aVar9 = aVar9;
                }
                aVar9.j();
                String str7 = aVar5.b;
                if (str7 == null || str7.length() == 0) {
                    i3 = 0;
                    aVar9.K(i2);
                } else {
                    aVar9.K(834645923);
                    String str8 = aVar5.b;
                    q630 H3 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar9.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(-473561179, 0, -1, str);
                    } else {
                        i7 = 0;
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar9.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar10 = aVar9;
                    i3 = i7;
                    yqv0.c(str8, H3, j2, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var2.i0, aVar10, 100663296, 48, 5880);
                    aVar9 = aVar10;
                }
                aVar9.j();
                pox0.h.a.C3526a c3526a = aVar5.e;
                if (c3526a == null) {
                    aVar9.K(835130452);
                    aVar9.j();
                    i5 = 2;
                    i6 = 32;
                } else {
                    aVar9.K(835130453);
                    String str9 = c3526a.a;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    ButtonStyle buttonStyle = ButtonStyle.Outline;
                    ButtonSize buttonSize = ButtonSize.Small;
                    q630 v2 = txj0.v(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), f7);
                    int i14 = (aVar9.J(c3526a) ? 1 : 0) | ((i13 & 112) == 32 ? 1 : i3);
                    Object x2 = aVar9.x();
                    if (i14 != 0 || x2 == c0012a) {
                        i4 = 2;
                        x2 = new ofx0(2, izsVar, c3526a);
                        aVar9.R(x2);
                    } else {
                        i4 = 2;
                    }
                    i5 = i4;
                    androidx.compose.runtime.a aVar11 = aVar9;
                    i6 = 32;
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, v2, null, false, false, null, null, null, str9, null, null, null, null, false, null, null, null, aVar11, X2.b.f, 0, 0, 4190176);
                    aVar9 = aVar11;
                    s3q0 s3q0Var = s3q0.a;
                    aVar9.j();
                }
                aVar9.G();
                M = aVar9;
                f3 = 0.0f;
                i8 = i5;
                i10 = i13;
                i9 = i6;
                i11 = i3;
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new q17(i, 4, hVar, izsVar, q630Var);
        }
    }
}
