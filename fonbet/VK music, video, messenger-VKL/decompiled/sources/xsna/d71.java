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

/* compiled from: AfterMoreImpl.kt */
/* loaded from: classes17.dex */
public final class d71 extends z06.c {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public d71() {
        throw null;
    }

    public d71(gzs gzsVar) {
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.z06
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1774542354);
        int i3 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1774542354, i3, -1, "com.vk.core.compose.component.banner.AfterMoreImpl.Content (AfterMoreImpl.kt:30)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1202158799, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.morePaddings (VkBannerDefaults.kt:188)");
            }
            sco scoVar = tco.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            sco scoVar2 = tco.a;
            float f = scoVar2.a;
            float f2 = scoVar2.b;
            float f3 = scoVar2.c;
            float f4 = scoVar2.d;
            q630.a aVar2 = q630.a.a;
            q630 G = s200.G(aVar2, f, f2, f3, f4);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
                M.K(-570474504);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.logic.interactor.l(1);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1505617909);
            }
            M.j();
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.c).getValue());
            float f5 = 24;
            boolean z = ((gzs) ((zak0) wh50Var).getValue()) != null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(608797657, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.moreIcon (VkBannerDefaults.kt:60)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(245428636, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal24> (VkSdkIcons.kt:2634)");
            }
            lg90 b2 = or.b(M, 1530334916, R.drawable.vk_icon_more_horizontal_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g l5gVar = (l5g) ((zak0) this.e).getValue();
            if (l5gVar == null) {
                M.K(1505626784);
                Banner$BackgroundMode banner$BackgroundMode = (Banner$BackgroundMode) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1336592277, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.moreIconTint (VkBannerDefaults.kt:63)");
                }
                M.K(221431460);
                if ((banner$BackgroundMode == null ? -1 : tdu0.a.$EnumSwitchMapping$0[banner$BackgroundMode.ordinal()]) == 1) {
                    M.K(-269948937);
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
                    M.K(-269947235);
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
                M.j();
            } else {
                M.K(1505625885);
                M.j();
                j = l5gVar.a;
            }
            i2 = 1;
            nzu0.c(gzsVar, b2, (String) ((zak0) this.b).getValue(), b, f5, j, false, null, z, null, null, M, 24640, 1728);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 1;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y2(this, i, i2);
        }
    }
}
