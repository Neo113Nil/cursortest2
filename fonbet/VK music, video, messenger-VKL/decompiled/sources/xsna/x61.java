package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.q630;
import xsna.tdu0;
import xsna.z06;

/* compiled from: AfterDismissImpl.kt */
/* loaded from: classes17.dex */
public final class x61 extends z06.b {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public x61() {
        throw null;
    }

    public x61(String str, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, lg90 lg90Var, l5g l5gVar, dt1 dt1Var) {
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(lg90Var);
        this.f = androidx.compose.runtime.k.b(l5gVar);
        this.g = androidx.compose.runtime.k.b(dt1Var);
    }

    @Override // xsna.z06
    public final void a(int i, androidx.compose.runtime.a aVar) {
        long j;
        androidx.compose.runtime.a M = aVar.M(658684596);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(658684596, i2, -1, "com.vk.core.compose.component.banner.AfterDismissImpl.Content (AfterDismissImpl.kt:37)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1518501944, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.dismissPaddings (VkBannerDefaults.kt:160)");
            }
            float f = kqu0.q;
            float f2 = 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            q630 c = txj0.c(s200.G(aVar2, f2, f, f, f2), 1.0f);
            cp10 d = ja8.d((dt1) ((zak0) this.g).getValue(), false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, c2, cri.a.d);
            wh50 wh50Var = this.d;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-2110903054);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.ui.g0(2);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-1176472645);
            }
            M.j();
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.c).getValue());
            float f3 = 24;
            boolean z = ((gzs) ((zak0) wh50Var).getValue()) != null;
            lg90 lg90Var = (lg90) ((zak0) this.e).getValue();
            if (lg90Var == null) {
                M.K(-1176465573);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1962212402, 6, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.dismissIcon (VkBannerDefaults.kt:26)");
                }
                M.K(1764882760);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
                }
                lg90Var = or.b(M, 1971505535, R.drawable.vk_icon_dismiss_dark_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(-1176466348);
            }
            M.j();
            l5g l5gVar = (l5g) ((zak0) this.f).getValue();
            if (l5gVar == null) {
                M.K(-1176463415);
                Banner$BackgroundMode banner$BackgroundMode = (Banner$BackgroundMode) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-165749052, 48, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.dismissIconTint (VkBannerDefaults.kt:33)");
                }
                M.K(1382519755);
                if ((banner$BackgroundMode == null ? -1 : tdu0.a.$EnumSwitchMapping$0[banner$BackgroundMode.ordinal()]) == 1) {
                    M.K(-371041808);
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
                    M.K(-371040106);
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
                M.K(-1176464314);
                M.j();
                j = l5gVar.a;
            }
            nzu0.c(gzsVar, lg90Var, (String) ((zak0) this.b).getValue(), b, f3, j, false, null, z, null, null, M, 24640, 1728);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w61(this, i, 0);
        }
    }
}
