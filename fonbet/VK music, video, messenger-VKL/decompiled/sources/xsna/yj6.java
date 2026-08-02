package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BasePin.kt */
/* loaded from: classes15.dex */
public final class yj6 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final float f, final gzs gzsVar, q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1973079641);
        if ((i & 6) == 0) {
            i3 = (M.p(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.y(jaiVar) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630Var3 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1973079641, i3, -1, "com.vk.biometrics.lock.impl.presentation.base.view.BasePin (BasePin.kt:25)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                vtu vtuVar = (vtu) M.r(uvi.l);
                q630 m = hr80.m(txj0.q(q630Var3, f), j, androidx.compose.ui.graphics.e.a);
                mlg0 a = qer0.a(f / 2, 1, l5g.c, false);
                boolean z = gzsVar != null;
                boolean y = M.y(vtuVar) | ((i3 & 896) == 256);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new hc1(1, vtuVar, gzsVar);
                    M.R(x2);
                }
                q630 b = ojc.b(m, sg50Var, a, z, null, (gzs) x2, 24);
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
                if (er.f((i3 >> 12) & 14, M, jaiVar)) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                final q630 q630Var4 = q630Var3;
                s.d = new wzs() { // from class: xsna.xj6
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yj6.a(j, f, gzsVar, q630Var4, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
