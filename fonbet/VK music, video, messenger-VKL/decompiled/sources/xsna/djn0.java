package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import xsna.cri;
import xsna.dt1;

/* compiled from: SupportedFrameworksBadges.kt */
/* loaded from: classes18.dex */
public final class djn0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final boolean z3;
        int i3;
        final boolean z4;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1145821405);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 48;
            z3 = z;
        } else if ((i & 48) == 0) {
            z3 = z;
            i3 = (M.l(z3) ? 32 : 16) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z4 = z2;
            i3 |= M.l(z4) ? 256 : 128;
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                M.h();
            } else {
                boolean z5 = i4 != 0 ? false : z3;
                boolean z6 = i5 != 0 ? false : z4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1145821405, i3, -1, "com.vk.design.demo.presentation.components.SupportedFrameworksBadges (SupportedFrameworksBadges.kt:20)");
                }
                dt1.a.getClass();
                float f = 2;
                q630 D = s200.D(new gcv(dt1.a.o), f);
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), dt1.a.k, M, 6);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c = qri.c(M, D);
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
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (z5) {
                    M.K(-1381617900);
                    rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Positive, null, null, null, "Compose", null, null, null, false, null, false, null, M, 1573302, 0, 16312);
                    M = M;
                } else {
                    M.K(-1382683711);
                }
                M.j();
                if (z6) {
                    M.K(-1381479113);
                    androidx.compose.runtime.a aVar3 = M;
                    rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Negative, null, null, null, "View", null, null, null, false, null, false, null, aVar3, 1573302, 0, 16312);
                    M = aVar3;
                } else {
                    M.K(-1382683711);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z3 = z5;
                z4 = z6;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.cjn0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        djn0.a(z3, z4, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z4 = z2;
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
