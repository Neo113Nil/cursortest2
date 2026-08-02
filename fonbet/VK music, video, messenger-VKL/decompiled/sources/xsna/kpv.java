package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.iy5;
import xsna.q630;

/* compiled from: IconBadge.kt */
/* loaded from: classes17.dex */
public final class kpv implements iy5 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;

    /* compiled from: IconBadge.kt */
    public static final class a {
        public static kpv a(lg90 lg90Var, long j, long j2, BadgeAlignment badgeAlignment, boolean z, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            long j3 = (i2 & 4) != 0 ? 9205357640488583168L : j2;
            BadgeAlignment badgeAlignment2 = (i2 & 16) != 0 ? BadgeAlignment.BottomRight : badgeAlignment;
            boolean z2 = (i2 & 32) != 0 ? false : z;
            com.vk.core.compose.component.semantics.a aVar3 = (i2 & 64) != 0 ? null : aVar;
            gzs gzsVar2 = (i2 & 128) != 0 ? null : gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(771224902, i, -1, "com.vk.core.compose.component.image.badge.IconBadge.Companion.invoke (IconBadge.kt:122)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                kpv kpvVar = new kpv(lg90Var, j, j3, badgeAlignment2, z2, aVar3, gzsVar2);
                aVar2.R(kpvVar);
                x = kpvVar;
            }
            kpv kpvVar2 = (kpv) x;
            ((zak0) kpvVar2.a).setValue(lg90Var);
            ((zak0) kpvVar2.b).setValue(new l5g(j));
            ((zak0) kpvVar2.c).setValue(new uco(j3));
            ((zak0) kpvVar2.d).setValue(new pco(Float.NaN));
            ((zak0) kpvVar2.f).setValue(badgeAlignment2);
            ((zak0) kpvVar2.e).setValue(Boolean.valueOf(z2));
            ((zak0) kpvVar2.h).setValue(aVar3);
            ((zak0) kpvVar2.g).setValue(gzsVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return kpvVar2;
        }
    }

    public kpv() {
        throw null;
    }

    public kpv(lg90 lg90Var, long j, long j2, BadgeAlignment badgeAlignment, boolean z, SemanticsConfiguration semanticsConfiguration, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(new uco(j2));
        this.d = cq.f(Float.NaN);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(badgeAlignment);
        this.g = androidx.compose.runtime.k.b(gzsVar);
        this.h = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.m2k0
    public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        return iy5.a.b(this, j, z, aVar, i);
    }

    @Override // xsna.m2k0
    public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        scc sccVar;
        aVar.K(-339454640);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-339454640, i, -1, "com.vk.core.compose.component.image.badge.IconBadge.provideClipShape (IconBadge.kt:55)");
        }
        if (((Boolean) ((zak0) this.e).getValue()).booleanValue()) {
            aVar.K(1954916232);
            aVar2 = aVar;
            sccVar = new scc(d(j), iy5.a.b(this, j, z, aVar2, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
            aVar2.j();
        } else {
            aVar2 = aVar;
            aVar2.K(1955024670);
            aVar2.j();
            sccVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return sccVar;
    }

    @Override // xsna.m2k0
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        float f;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(1773357241);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1773357241, i2, -1, "com.vk.core.compose.component.image.badge.IconBadge.invoke (IconBadge.kt:75)");
            }
            if (((Boolean) ((zak0) this.e).getValue()).booleanValue()) {
                M.K(1987923917);
                M.j();
                f = 0;
            } else {
                M.K(1987958637);
                f870.A().getClass();
                M.K(-984963428);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-984963428, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeAvatarDefault.iconBadgeElevation (MilkshakeAvatarDefault.kt:37)");
                }
                f = 0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                M.j();
            }
            q630 b = a5j0.b(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.h).getValue()), f, vog0.a, false, 0L, 0L, 28);
            gzs gzsVar = (gzs) ((zak0) this.g).getValue();
            q630.a aVar2 = q630.a.a;
            if (gzsVar != null && (g = b.g(ojc.c(aVar2, false, null, null, gzsVar, 15))) != null) {
                b = g;
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            pzu0.b((lg90) ((zak0) this.a).getValue(), null, txj0.d(aVar2, 1.0f), ((l5g) ((zak0) this.b).getValue()).a, M, 440, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mog(this, q630Var, i, 6);
        }
    }

    @Override // xsna.m2k0
    public final long d(long j) {
        wh50 wh50Var = this.c;
        if (((uco) ((zak0) wh50Var).getValue()).a != 9205357640488583168L) {
            return ((uco) ((zak0) wh50Var).getValue()).a;
        }
        float f = xcv0.a;
        return xcv0.a(Math.min(uco.c(j), uco.b(j)));
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
        long d;
        aVar.K(-120470002);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-120470002, i, -1, "com.vk.core.compose.component.image.badge.IconBadge.calculatePositionForPicture (IconBadge.kt:68)");
        }
        wh50 wh50Var = this.d;
        if (Float.isNaN(((pco) ((zak0) wh50Var).getValue()).b)) {
            aVar.K(1671004406);
            d = iy5.a.d(this, j, aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            aVar.j();
        } else {
            aVar.K(1670944638);
            aVar.j();
            d = iy5.a.a(this, j, ((pco) ((zak0) wh50Var).getValue()).b);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return d;
    }

    @Override // xsna.m2k0
    public final BadgeAlignment getAlignment() {
        return (BadgeAlignment) ((zak0) this.f).getValue();
    }
}
