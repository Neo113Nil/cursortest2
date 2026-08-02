package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: MyGamesSectionHolder.kt */
/* loaded from: classes17.dex */
public final class lo50 implements znj {
    public final /* synthetic */ izs<mat, s3q0> b;
    public final /* synthetic */ ko50 c;
    public final /* synthetic */ wh50<Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public lo50(izs<? super mat, s3q0> izsVar, ko50 ko50Var, wh50<Boolean> wh50Var) {
        this.b = izsVar;
        this.c = ko50Var;
        this.d = wh50Var;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(1279669111);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1279669111, i2, -1, "com.vk.games.presentation.components.sections.MyGamesSectionHolder.<anonymous>.<anonymous>.<no name provided>.Content (MyGamesSectionHolder.kt:73)");
            }
            lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.vk_games_remove_from_list, 0, M), false);
            qzu0.a.getClass();
            lg90 n = qzu0.n(M);
            float f = 24;
            long b = byc0.b(f, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lqv B = znk0.B(n, ylu0Var.getIcon().h, b, M, 197000, 24);
            izs<mat, s3q0> izsVar = this.b;
            boolean J = M.J(izsVar);
            ko50 ko50Var = this.c;
            boolean J2 = J | M.J(ko50Var);
            Object x = M.x();
            if (J2 || x == a.C0011a.a) {
                x = new wj9(izsVar, ko50Var, this.d, 2);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, null, null, false, B, d, null, M, i2 & 14, 78);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p9(this, znjVar2, i, 5);
        }
    }
}
