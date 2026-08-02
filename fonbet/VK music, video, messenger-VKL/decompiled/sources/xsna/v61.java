package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tdu0;
import xsna.z06;

/* compiled from: AfterChevronImpl.kt */
/* loaded from: classes17.dex */
public final class v61 extends z06.a {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public v61(SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar) {
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // xsna.z06
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1018883884);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1018883884, i2, -1, "com.vk.core.compose.component.banner.AfterChevronImpl.Content (AfterChevronImpl.kt:30)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1392748519, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.chevronPaddings (VkBannerDefaults.kt:176)");
            }
            float f = kqu0.q;
            float f2 = 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(txj0.c(s200.G(q630.a.a, f2, f2, f, f2), 1.0f), (SemanticsConfiguration) ((zak0) this.b).getValue());
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            wh50 wh50Var = this.d;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(1980932818);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new t61(0);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1587921371);
            }
            M.j();
            boolean z = ((gzs) ((zak0) wh50Var).getValue()) != null;
            long b2 = byc0.b(16, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2144439011, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.chevronIcon (VkBannerDefaults.kt:43)");
            }
            M.K(1639119663);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Banner$BackgroundMode banner$BackgroundMode = (Banner$BackgroundMode) ((zak0) this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-946738315, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.chevronIconTint (VkBannerDefaults.kt:50)");
            }
            M.K(769242042);
            if ((banner$BackgroundMode == null ? -1 : tdu0.a.$EnumSwitchMapping$0[banner$BackgroundMode.ordinal()]) == 1) {
                M.K(717553697);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().c;
                M.j();
            } else {
                M.K(717555399);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().m;
                M.j();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.b(gzsVar, a, b2, (String) ((zak0) this.c).getValue(), null, j, false, null, z, null, null, aVar2, 448, 0, 1744);
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
            s.d = new u61(this, i, 0);
        }
    }
}
