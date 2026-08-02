package xsna;

import xsna.q630;

/* compiled from: CommonContextMenuArea.kt */
/* loaded from: classes11.dex */
public final class sig {
    public static final void a(bei0 bei0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-614342087);
        int i2 = (M.y(bei0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-614342087, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:131)");
            }
            M.K(-1009319487);
            kta0.b(gcd0.x(sa30.R(new udi0(bei0Var, null)), bei0Var.h, new vdi0(bei0Var, null), null, new gda0(bei0Var, 15)), jaiVar, M, 48);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rig(bei0Var, jaiVar, i, 0);
        }
    }

    public static final void b(gho0 gho0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1533506138);
        if ((i & 6) == 0) {
            i2 = (M.y(gho0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1533506138, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            M.K(-885604480);
            kta0.b(!gho0Var.m() ? q630.a.a : gcd0.x(sa30.R(new ygo0(gho0Var, null)), gho0Var.z, new zgo0(gho0Var, null), new aho0(gho0Var, null), new z8l0(gho0Var, 6)), jaiVar, M, i2 & 112);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qig(gho0Var, jaiVar, i, 0);
        }
    }
}
