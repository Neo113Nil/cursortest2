package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.k7d0;
import xsna.q630;

/* compiled from: CommunityPrimaryBlockAdsPromotionImpl.kt */
/* loaded from: classes17.dex */
public final class cdh extends k7d0.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public cdh(String str, String str2, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(str2);
        this.c = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // xsna.k7d0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1041368588);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1041368588, i2, -1, "com.vk.community.design.compose.primaryblock.CommunityPrimaryBlockAdsPromotionImpl.Content (CommunityPrimaryBlockAdsPromotionImpl.kt:38)");
            }
            b((i2 << 9) & 57344, M, (String) ((zak0) this.a).getValue(), (String) ((zak0) this.b).getValue(), (gzs) ((zak0) this.c).getValue(), com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue()));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new adh(this, q630Var, i, 0);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, String str, String str2, gzs gzsVar, q630 q630Var) {
        String str3;
        int i2;
        String str4;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(973500726);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (M.J(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= M.J(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(973500726, i2, -1, "com.vk.community.design.compose.primaryblock.CommunityPrimaryBlockAdsPromotionImpl.AdsPromotion (CommunityPrimaryBlockAdsPromotionImpl.kt:54)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
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
            SeparatorDpi separatorDpi = SeparatorDpi.At3x;
            SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
            float f = kqu0.b;
            q630.a aVar3 = q630.a.a;
            ijv0.c(separatorDpi, separatorAppearance, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), M, 54, 0);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sc(14);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(str3, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, (i2 & 14) | 12582912, 94), null, null, null, M, 196608, 30);
            if (gzsVar == null) {
                M.K(-2116106284);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new qo0(9);
                    M.R(x2);
                }
                M.j();
                gzsVar2 = (gzs) x2;
            } else {
                M.K(-1038093252);
                M.j();
                gzsVar2 = gzsVar;
            }
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new wr0(12);
                M.R(x3);
            }
            wiu0.b(aVar3, false, null, a2, com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, buttonSize, str4, null, null, null, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), gzsVar2, M, ((i2 << 3) & 7168) | 438, 1572864, 16368), null, null, M, 6, 102);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bdh(this, str, q630Var, str2, gzsVar, i);
        }
    }
}
