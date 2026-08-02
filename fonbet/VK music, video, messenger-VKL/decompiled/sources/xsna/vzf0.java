package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReorderableItem.kt */
/* loaded from: classes17.dex */
public final class vzf0 {
    public static final void a(final ksy ksyVar, final d0g0 d0g0Var, final int i, q630 q630Var, boolean z, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(593538712);
        if ((i2 & 6) == 0) {
            i3 = (M.J(ksyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(d0g0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        int i4 = i3 | 27648;
        if ((196608 & i2) == 0) {
            i4 |= M.y(jaiVar) ? 131072 : 65536;
        }
        final boolean z2 = true;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(593538712, i4, -1, "com.vk.core.compose.reorder.ReorderableItem (ReorderableItem.kt:26)");
            }
            q630.a aVar2 = q630.a.a;
            b(d0g0Var, i, aVar2, ksy.c(ksyVar, aVar2, 2), jaiVar, M, ((i4 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (57344 & i4) | (i4 & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            z2 = z;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tzf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vzf0.a(ksy.this, d0g0Var, i, q630Var2, z2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final d0g0 d0g0Var, final int i, final q630 q630Var, q630 q630Var2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        q630 q630Var3;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(632105664);
        if ((i2 & 6) == 0) {
            i3 = (M.J(d0g0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            q630Var3 = q630Var2;
            i3 |= M.J(q630Var3) ? 2048 : 1024;
        } else {
            q630Var3 = q630Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.l(true) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(632105664, i3, -1, "com.vk.core.compose.reorder.ReorderableItem (ReorderableItem.kt:44)");
            }
            Integer f = d0g0Var.f();
            boolean z = f != null && i == f.intValue();
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(1923609563);
                q630 P = f370.P(aVar2, 1.0f);
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new ece0(d0g0Var, 2);
                    M.R(x);
                }
                q630Var4 = rdu.a(P, (izs) x);
                M.j();
            } else {
                M.K(1924010920);
                zux zuxVar = (zux) ((zak0) d0g0Var.f.b).getValue();
                if (zuxVar == null || i != zuxVar.a) {
                    M.K(1924557419);
                    M.j();
                    q630Var4 = q630Var3;
                } else {
                    M.K(1924109624);
                    q630 P2 = f370.P(aVar2, 1.0f);
                    boolean z3 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
                    Object x2 = M.x();
                    if (z3 || x2 == c0012a) {
                        x2 = new k170(d0g0Var, 20);
                        M.R(x2);
                    }
                    q630Var4 = rdu.a(P2, (izs) x2);
                    M.j();
                }
                M.j();
            }
            q630 g = q630Var.g(q630Var4);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            jaiVar.invoke(ra8.a, Boolean.valueOf(z), M, Integer.valueOf(((i3 >> 9) & 896) | 6));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var5 = q630Var3;
            s.d = new wzs() { // from class: xsna.uzf0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vzf0.b(d0g0.this, i, q630Var, q630Var5, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
