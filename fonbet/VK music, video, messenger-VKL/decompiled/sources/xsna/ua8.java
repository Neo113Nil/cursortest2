package xsna;

import androidx.compose.runtime.a;
import xsna.dt1;
import xsna.q630;

/* compiled from: BoxWithConstraints.kt */
/* loaded from: classes11.dex */
public final class ua8 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, dt1 dt1Var, boolean z, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        dt1 dt1Var2;
        int i4;
        boolean z2;
        q630 q630Var3;
        dt1 dt1Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(380139498);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dt1Var2 = dt1Var;
            i3 |= M.J(dt1Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= M.l(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= M.y(jaiVar) ? 2048 : 1024;
                }
                if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                    q630Var3 = i5 != 0 ? q630.a.a : q630Var2;
                    if (i6 != 0) {
                        dt1.a.getClass();
                        dt1Var3 = dt1.a.b;
                    } else {
                        dt1Var3 = dt1Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    cp10 d = ja8.d(dt1Var3, z2);
                    boolean J = M.J(d) | ((i3 & 7168) == 2048);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        x = new yb1(1, d, jaiVar);
                        M.R(x);
                    }
                    xtm0.a(q630Var3, (wzs) x, M, i3 & 14, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    dt1Var3 = dt1Var2;
                }
                s = M.s();
                if (s != null) {
                    final q630 q630Var4 = q630Var3;
                    final dt1 dt1Var4 = dt1Var3;
                    final boolean z3 = z2;
                    s.d = new wzs() { // from class: xsna.sa8
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ua8.a(q630.this, dt1Var4, z3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        dt1Var2 = dt1Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
