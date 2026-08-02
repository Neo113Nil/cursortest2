package xsna;

import xsna.dt1;
import xsna.ty6;

/* compiled from: UserProfileOnBoardingBannerView.kt */
/* loaded from: classes5.dex */
public final class ftq0 {
    public static final void a(a280 a280Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(739566473);
        int i2 = (M.J(a280Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(739566473, i2, -1, "com.vk.profile.design.view.onboarding.InternalContent (UserProfileOnBoardingBannerView.kt:49)");
            }
            boolean z = a280Var != null;
            rpp e = anp.e(null, 3);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            mm2.f(z, null, e.b(anp.d(null, bVar, null, 13)), anp.f(null, 3).b(anp.k(null, bVar, 13)), null, kai.c(-490381727, new he30(a280Var, 3), M), M, 200064, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b47(a280Var, i, 10);
        }
    }
}
