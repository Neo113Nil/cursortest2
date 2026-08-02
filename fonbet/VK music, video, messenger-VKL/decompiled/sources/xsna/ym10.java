package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MaterialTheme.kt */
/* loaded from: classes11.dex */
public final class ym10 {
    public static final iyk0 a;

    static {
        rvi.d(new daz(2));
        a = new iyk0(new d1(21));
    }

    public static final void a(t7g t7gVar, kb30 kb30Var, n6j0 n6j0Var, xup0 xup0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(904511636);
        if ((i & 6) == 0) {
            i2 = (M.J(t7gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(kb30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(n6j0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xup0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(904511636, i2, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:95)");
            }
            llg0 a2 = ilg0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7);
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1866455512, i3, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:217)");
            }
            long j = t7gVar.a;
            boolean p = M.p(j);
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                x = new qlo0(j, l5g.c(14, j, 0.4f));
                M.R(x);
            }
            qlo0 qlo0Var = (qlo0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rvi.b(new c9e0[]{u7g.a.b(t7gVar), a.b(kb30Var), cuw.a.b(a2), p6j0.a.b(n6j0Var), rlo0.a.b(qlo0Var), evp0.a.b(xup0Var)}, kai.c(-1750539308, new xm10(xup0Var, jaiVar), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wm10(t7gVar, kb30Var, n6j0Var, xup0Var, jaiVar, i);
        }
    }

    public static final void b(t7g t7gVar, n6j0 n6j0Var, xup0 xup0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        n6j0 n6j0Var2;
        xup0 xup0Var2;
        n6j0 n6j0Var3;
        xup0 xup0Var3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-449719819);
        int i3 = i | (M.J(t7gVar) ? 4 : 2) | 144;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(419509830, 6, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
                }
                n6j0Var3 = (n6j0) M.r(p6j0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-942794935, 6, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
                }
                xup0Var3 = (xup0) M.r(evp0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i3 & (-1009);
            } else {
                M.h();
                i2 = i3 & (-1009);
                n6j0Var3 = n6j0Var;
                xup0Var3 = xup0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-449719819, i2, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:59)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-506613891, 6, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
            }
            kb30 kb30Var = (kb30) M.r(a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xup0 xup0Var4 = xup0Var3;
            a(t7gVar, kb30Var, n6j0Var3, xup0Var4, jaiVar, M, (i2 & 14) | 24576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            n6j0Var2 = n6j0Var3;
            xup0Var2 = xup0Var4;
        } else {
            M.h();
            n6j0Var2 = n6j0Var;
            xup0Var2 = xup0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j3c(t7gVar, n6j0Var2, xup0Var2, jaiVar, i, 2);
        }
    }
}
