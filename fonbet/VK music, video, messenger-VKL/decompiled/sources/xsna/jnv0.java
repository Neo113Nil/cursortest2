package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSubnavigationBar.kt */
/* loaded from: classes17.dex */
public final class jnv0 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final SubnavigationBarAppearance subnavigationBarAppearance, q630 q630Var, final boolean z2, boolean z3, jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z4;
        final jai jaiVar2;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-191684882);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(subnavigationBarAppearance.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.l(z2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z4 = z3;
            i3 |= M.l(z4) ? 16384 : 8192;
            if (M.t(i3 & 1, (74899 & i3) == 74898)) {
                jaiVar2 = jaiVar;
                M.h();
                q630Var2 = q630Var;
            } else {
                q630Var2 = i4 != 0 ? q630.a.a : q630Var;
                if (i5 != 0) {
                    z4 = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-191684882, i3, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationBar (VkSubnavigationBar.kt:40)");
                }
                q630 E = s200.E(p490.r(txj0.f(q630Var2, 1.0f), p490.x(M), 14), z4 ? kqu0.b : 0, z2 ? kqu0.v : 0);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
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
                jaiVar2 = jaiVar;
                jaiVar2.invoke(new num0(z, subnavigationBarAppearance), M, 48);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            final boolean z5 = z4;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.inv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jnv0.a(z, subnavigationBarAppearance, q630Var2, z2, z5, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z4 = z3;
        if (M.t(i3 & 1, (74899 & i3) == 74898)) {
        }
        final boolean z52 = z4;
        s = M.s();
        if (s == null) {
        }
    }
}
