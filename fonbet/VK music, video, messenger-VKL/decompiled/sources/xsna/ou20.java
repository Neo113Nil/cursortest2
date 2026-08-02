package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.iy5;
import xsna.q630;

/* compiled from: MobileOnlineBadge.kt */
/* loaded from: classes17.dex */
public final class ou20 implements iy5 {
    public final wh50 a = androidx.compose.runtime.k.b(null);

    @Override // xsna.m2k0
    public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        return iy5.a.b(this, j, z, aVar, i);
    }

    @Override // xsna.m2k0
    public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-875176752);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-875176752, i, -1, "com.vk.core.compose.component.image.badge.MobileOnlineBadge.provideClipShape (MobileOnlineBadge.kt:53)");
        }
        pu20 pu20Var = new pu20(d(j), iy5.a.b(this, j, z, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return pu20Var;
    }

    @Override // xsna.m2k0
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(19586617);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(19586617, i2, -1, "com.vk.core.compose.component.image.badge.MobileOnlineBadge.invoke (MobileOnlineBadge.kt:31)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.a).getValue());
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1364632772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-OnlineMobile12> (VkSdkIcons.kt:2766)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_online_mobile_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a, null, d2, ylu0Var.q().e, M, 440, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hp7(this, q630Var, i, 5);
        }
    }

    @Override // xsna.m2k0
    public final long d(long j) {
        float f;
        int i;
        if (pco.a(Math.min(uco.c(j), uco.b(j)), 72) < 0) {
            f = 8;
            i = 12;
        } else {
            f = 9;
            i = 14;
        }
        return byc0.b(f, i);
    }

    @Override // xsna.iy5
    public final long e(float f, long j) {
        return iy5.a.a(this, j, f);
    }

    @Override // xsna.iy5
    public final long f(int i, long j, androidx.compose.runtime.a aVar) {
        return iy5.a.c(this, j, aVar, i);
    }

    @Override // xsna.iy5
    public final long g(int i, long j, androidx.compose.runtime.a aVar) {
        return iy5.a.d(this, j, aVar, i);
    }

    @Override // xsna.m2k0
    public final BadgeAlignment getAlignment() {
        return BadgeAlignment.BottomRight;
    }
}
