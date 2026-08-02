package xsna;

import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: StorefrontInfoBlock.kt */
/* loaded from: classes18.dex */
public final class kml0 {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ jml0 a;

        public a(jml0 jml0Var) {
            this.a = jml0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            TypedValue typedValue = krv0.a;
            krv0.k(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(uvw uvwVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> ykuVar;
        androidx.compose.runtime.a M = aVar.M(-1522446579);
        int i2 = (M.J(uvwVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1522446579, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.InfoBlock (StorefrontInfoBlock.kt:38)");
            }
            if (uvwVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    ykuVar = new ed4(uvwVar, izsVar, i, 9);
                    s.d = ykuVar;
                }
                return;
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
                x2 = new v1k(3, wh50Var);
                M.R(x2);
            }
            bap.c(s3q0Var, (izs) x2, M, 54);
            b(((Boolean) wh50Var.getValue()).booleanValue(), uvwVar, izsVar, M, (i2 << 3) & 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            ykuVar = new yku(uvwVar, izsVar, i, 7);
            s.d = ykuVar;
        }
    }

    public static final void b(boolean z, uvw uvwVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1802313282);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(uvwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1802313282, i4, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.RedesignInfoBlock (StorefrontInfoBlock.kt:69)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 16;
            q630 G = s200.G(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), f2, 4, f2, f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            lg90 lg90Var = null;
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
            ijv0.c(SeparatorDpi.At1x, SeparatorAppearance.Secondary, null, M, 54, 4);
            dly dlyVar = uvwVar.a;
            if (dlyVar == null) {
                M.K(297848953);
                M.j();
                i3 = -1;
            } else {
                M.K(297848954);
                i3 = -1;
                lg90Var = fwu0.l(z ? dlyVar.a : dlyVar.b, null, null, null, M, 0, 62);
                M = M;
                M.j();
            }
            if (lg90Var == null) {
                M.K(1395084605);
                qzu0.a.getClass();
                lg90Var = qzu0.v(M);
                M.j();
            } else {
                M.K(1395080575);
                M.j();
            }
            lg90 lg90Var2 = lg90Var;
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Accent;
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z2 = (i4 & 896) == 256;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new oq5(izsVar, 12);
                M.R(x);
            }
            q630 c2 = ojc.c(H, false, null, null, (gzs) x, 15);
            long j = l5g.k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1304645628, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronOutline16> (VkSdkIcons.kt:472)");
            }
            lg90 b = or.b(M, 1539019876, R.drawable.vk_icon_chevron_outline_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar4 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, design, c2, lg90Var2, new l5g(j), uvwVar.b, null, b, null, false, null, false, null, aVar4, 134447542, 0, 16000);
            M = aVar4;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lwd0(z, uvwVar, izsVar, i);
        }
    }
}
