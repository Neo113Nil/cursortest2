package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.q630;

/* compiled from: SkipContainer.kt */
/* loaded from: classes3.dex */
public final class jzj0 {
    public static final void a(q630 q630Var, int i, float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        androidx.compose.runtime.a M = aVar.M(-687499264);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (M.J(q630Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if (M.t(i7 & 1, (i7 & 1171) != 1170)) {
            if (i5 != 0) {
                q630Var = q630.a.a;
            }
            if (i6 != 0) {
                i = Integer.MAX_VALUE;
            }
            f = 2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-687499264, i7, -1, "com.vk.libvideo.tool.compose.skipcontainer.SkipContainer (SkipContainer.kt:36)");
            }
            int r0 = ((azl) M.r(uvi.h)).r0(f);
            boolean o = M.o(r0) | ((i7 & 112) == 32);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = new izj0(i, r0);
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(mzj0.a, M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        final int i8 = i;
        final float f2 = f;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hzj0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzj0.a(q630.this, i8, f2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                    return s3q0.a;
                }
            };
        }
    }
}
