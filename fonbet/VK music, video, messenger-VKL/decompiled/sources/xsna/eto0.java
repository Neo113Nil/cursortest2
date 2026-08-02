package xsna;

import androidx.compose.ui.node.LayoutNode;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TileGvozdiScope.kt */
/* loaded from: classes17.dex */
public final class eto0 {
    public final qa8 a;

    public eto0(qa8 qa8Var) {
        this.a = qa8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final dt1 dt1Var, q630 q630Var, float f, long j, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final float f2;
        long j2;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-968230130);
        if ((i & 6) == 0) {
            i3 = (M.J(dt1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 = i3 | Tensorflow.FRAME_WIDTH;
        } else if ((i & 384) == 0) {
            f2 = f;
            i5 |= M.n(f2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (M.p(j2)) {
                        i4 = 2048;
                        i5 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i5 |= i4;
            } else {
                j2 = j;
            }
            if ((i & 24576) == 0) {
                i5 |= M.y(jaiVar) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i5 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                M.h();
                q630Var2 = q630Var;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    if (i6 != 0) {
                        f2 = Float.NaN;
                    }
                    int i7 = i2 & 8;
                    q630Var2 = q630.a.a;
                    if (i7 != 0) {
                        i5 &= -7169;
                        j2 = 0;
                    }
                } else {
                    M.h();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    q630Var2 = q630Var;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-968230130, i5, -1, "com.vk.core.compose.component.tile.TileGvozdiScope.Gvozd (TileGvozdiScope.kt:20)");
                }
                q630 l = kci.l(this.a.b(txj0.q(q630Var2, f2), dt1Var), rco.a(j2), rco.b(j2));
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, l);
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
                if (er.f((i5 >> 12) & 14, M, jaiVar)) {
                    androidx.compose.runtime.b.e();
                }
            }
            final long j3 = j2;
            s = M.s();
            if (s == null) {
                final q630 q630Var3 = q630Var2;
                s.d = new wzs() { // from class: xsna.dto0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        eto0.this.a(dt1Var, q630Var3, f2, j3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        final long j32 = j2;
        s = M.s();
        if (s == null) {
        }
    }
}
