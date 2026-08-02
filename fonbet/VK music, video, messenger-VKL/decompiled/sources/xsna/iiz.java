package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.iy5;
import xsna.q630;

/* compiled from: LiveBadge.kt */
/* loaded from: classes17.dex */
public final class iiz implements iy5 {
    public final wh50 a;
    public final wh50 b;

    /* compiled from: LiveBadge.kt */
    public static final class a {
        public static iiz a(int i, int i2, androidx.compose.runtime.a aVar, boolean z) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1784105386, i, -1, "com.vk.core.compose.component.image.badge.LiveBadge.Companion.invoke (LiveBadge.kt:69)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new iiz(z, null);
                aVar.R(x);
            }
            iiz iizVar = (iiz) x;
            ((zak0) iizVar.a).setValue(Boolean.valueOf(z));
            ((zak0) iizVar.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return iizVar;
        }
    }

    public iiz(boolean z, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.m2k0
    public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        return iy5.a.b(this, j, z, aVar, i);
    }

    @Override // xsna.m2k0
    public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        jiz jizVar;
        aVar.K(-1862133200);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1862133200, i, -1, "com.vk.core.compose.component.image.badge.LiveBadge.provideClipShape (LiveBadge.kt:58)");
        }
        if (((Boolean) ((zak0) this.a).getValue()).booleanValue()) {
            aVar.K(-1012457810);
            aVar2 = aVar;
            jizVar = new jiz(d(j), iy5.a.b(this, j, z, aVar2, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
            aVar2.j();
        } else {
            aVar2 = aVar;
            aVar2.K(-1012355138);
            aVar2.j();
            jizVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return jizVar;
    }

    @Override // xsna.m2k0
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(250678681);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(250678681, i2, -1, "com.vk.core.compose.component.image.badge.LiveBadge.invoke (LiveBadge.kt:33)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.b).getValue());
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
                androidx.compose.runtime.b.f(1607766808, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LiveBadge16> (VkSdkIcons.kt:2112)");
            }
            lg90 b2 = or.b(M, -494135347, R.drawable.vk_icon_live_badge_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vqv.a(b2, null, d2, l5g.k, M, 3512, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qed(this, q630Var, i, 8);
        }
    }

    @Override // xsna.m2k0
    public final long d(long j) {
        float min = Math.min(uco.c(j), uco.b(j));
        return pco.a(min, (float) 36) < 0 ? byc0.b(20, 10) : pco.a(min, (float) 56) < 0 ? byc0.b(24, 12) : pco.a(min, (float) 80) < 0 ? byc0.b(34, 16) : byc0.b(38, 18);
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
