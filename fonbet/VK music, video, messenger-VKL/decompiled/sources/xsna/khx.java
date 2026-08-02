package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InternalTabs.kt */
/* loaded from: classes17.dex */
public final class khx {
    public final rg50 a = androidx.compose.runtime.i.a(0);
    public final kg50 b = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public final void a(final float f, final int i, androidx.compose.runtime.a aVar, final jai jaiVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-823907928);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-823907928, i3, -1, "com.vk.core.compose.component.internal.InternalIndicatorScope.InternalIndicator (InternalTabs.kt:75)");
            }
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new izs() { // from class: xsna.ihx
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        return new h9x((((azl) obj).r0(f) << 32) | (0 & 4294967295L));
                    }
                };
                M.R(x);
            }
            q630Var = q630.a.a;
            q630 k = kci.k(q630Var, (izs) x);
            boolean z2 = (i3 & 7168) == 2048;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new zkh(this, 25);
                M.R(x2);
            }
            q630 A = hr80.A(k, (izs) x2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, A);
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
            if (er.f((i3 >> 6) & 14, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jhx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    khx.this.a(f, I, (androidx.compose.runtime.a) obj, jaiVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }
}
