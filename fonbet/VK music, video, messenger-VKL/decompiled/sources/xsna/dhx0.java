package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.iy5;
import xsna.q630;

/* compiled from: WebOnlineBadge.kt */
/* loaded from: classes17.dex */
public final class dhx0 implements iy5 {
    public final wh50 a = androidx.compose.runtime.k.b(null);

    /* compiled from: WebOnlineBadge.kt */
    public static final class a {
        public static dhx0 a(androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new dhx0();
                aVar.R(x);
            }
            dhx0 dhx0Var = (dhx0) x;
            ((zak0) dhx0Var.a).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return dhx0Var;
        }
    }

    @Override // xsna.m2k0
    public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        return iy5.a.b(this, j, z, aVar, i);
    }

    @Override // xsna.m2k0
    public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-444087628);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-444087628, i, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.provideClipShape (WebOnlineBadge.kt:55)");
        }
        ehx0 ehx0Var = new ehx0(d(j), iy5.a.b(this, j, z, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return ehx0Var;
    }

    @Override // xsna.m2k0
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2037401309);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2037401309, i2, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.invoke (WebOnlineBadge.kt:33)");
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
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.q().e;
            uog0 uog0Var = vog0.a;
            f9t.e(rte0.d(hr80.m(d2, j, uog0Var), uog0Var), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(this, q630Var, i, 13);
        }
    }

    @Override // xsna.m2k0
    public final long d(long j) {
        float f = pco.a(Math.min(uco.c(j), uco.b(j)), (float) 72) < 0 ? 8 : 10;
        return byc0.b(f, f);
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
