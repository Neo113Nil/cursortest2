package xsna;

import androidx.compose.runtime.a;

/* compiled from: VkDatePickerCalendar.kt */
/* loaded from: classes17.dex */
public final class you0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(936351425);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(936351425, i, -1, "com.vk.core.compose.component.datetime.FixPickerTheme (VkDatePickerCalendar.kt:116)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-561618718, 0, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
            }
            t7g t7gVar = (t7g) M.r(u7g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J = M.J(t7gVar) | M.J(ylu0Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                long j = ylu0Var.getBackground().d;
                long j2 = ylu0Var.getText().e;
                long j3 = ylu0Var.getBackground().e;
                long j4 = ylu0Var.getText().c;
                long j5 = ylu0Var.getBackground().e;
                long j6 = ylu0Var.getText().m;
                long j7 = ylu0Var.getBackground().e;
                long j8 = ylu0Var.getText().m;
                long j9 = ylu0Var.getBackground().t;
                long j10 = ylu0Var.getText().d;
                long j11 = ylu0Var.getBackground().g;
                t7g t7gVar2 = new t7g(j, j2, j3, j4, t7gVar.e, t7gVar.f, t7gVar.g, j5, j6, t7gVar.j, t7gVar.k, j7, j8, t7gVar.n, ylu0Var.getText().m, j11, ylu0Var.getText().m, ylu0Var.getBackground().x, ylu0Var.getText().j, t7gVar.t, t7gVar.u, t7gVar.v, j9, j10, t7gVar.y, t7gVar.z, ylu0Var.p().a, ylu0Var.p().e, t7gVar.C, t7gVar.D, t7gVar.E, t7gVar.F, ylu0Var.getBackground().r, ylu0Var.getBackground().x, t7gVar.I, t7gVar.J, t7gVar.K, t7gVar.L, t7gVar.M, t7gVar.N, t7gVar.O, t7gVar.P, t7gVar.Q, t7gVar.R, t7gVar.S, t7gVar.T, t7gVar.U, t7gVar.V);
                M.R(t7gVar2);
                x = t7gVar2;
            }
            ym10.b((t7g) x, null, null, kai.c(418372245, new lmu0(1, jaiVar), M), M, 3072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yde(jaiVar, i, 9);
        }
    }
}
