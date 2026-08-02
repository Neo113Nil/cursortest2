package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;

/* compiled from: MiddleImpl.kt */
/* loaded from: classes17.dex */
public final class wl20 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public wl20() {
        this(null, null, null);
    }

    public final void a(xpy xpyVar, androidx.compose.runtime.a aVar, int i) {
        String str;
        String str2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1336459995);
        int i4 = i | (M.J(xpyVar) ? 4 : 2) | (M.J(this) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1336459995, i4, -1, "com.vk.core.compose.component.snackbar.MiddleImpl.Content (MiddleImpl.kt:29)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(xpyVar, (SemanticsConfiguration) ((zak0) this.d).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            w65.k().getClass();
            a.j g = androidx.compose.foundation.layout.a.g(2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            String str3 = (String) ((zak0) this.a).getValue();
            if (str3 == null) {
                M.K(1215454106);
                M.j();
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i2 = -1;
                i3 = 0;
            } else {
                M.K(1215454107);
                w65.k().getClass();
                M.K(894582676);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(894582676, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.titleTextStyle (MilkshakeSnackbarDefaults.kt:19)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                w65.k().getClass();
                M.K(445030770);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(445030770, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.titleTextColor (MilkshakeSnackbarDefaults.kt:26)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str2 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i2 = -1;
                i3 = 0;
                yqv0.c(str3, null, j, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, M, 100663296, 48, 5882);
                M = M;
                M.j();
            }
            String str4 = (String) ((zak0) this.b).getValue();
            if (str4 == null) {
                M.K(1215796718);
            } else {
                M.K(1215796719);
                w65.k().getClass();
                M.K(362247416);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(362247416, i3, i2, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.subtitleTextStyle (MilkshakeSnackbarDefaults.kt:22)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, i3, i2, str2);
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.e0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                w65.k().getClass();
                M.K(245936598);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(245936598, i3, i2, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.subtitleTextColor (MilkshakeSnackbarDefaults.kt:29)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i2, str);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getText().r;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                androidx.compose.runtime.a aVar3 = M;
                yqv0.c(str4, null, j2, null, null, 0, 0, null, 2, false, 0, 3, null, frv0Var2, aVar3, 100663296, 48, 5882);
                M = aVar3;
            }
            M.j();
            f7k0 f7k0Var = (f7k0) ((zak0) this.c).getValue();
            if (f7k0Var == null) {
                M.K(1216139051);
            } else {
                M.K(-2038979690);
                f7k0Var.a(6, M);
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
            s.d = new s70(this, xpyVar, i, 7);
        }
    }

    public wl20(String str, String str2, f7k0 f7k0Var) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(str2);
        this.c = androidx.compose.runtime.k.b(f7k0Var);
        this.d = androidx.compose.runtime.k.b(null);
    }
}
