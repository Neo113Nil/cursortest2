package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import xsna.rco0;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class uoj implements znj {
    public static final uoj b = new uoj();

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(145805851);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(145805851, i2, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1192)");
            }
            lzo0 d = nzo.d(3078, 6, M, "Picture", false);
            float f = xcv0.a;
            long j = l5g.h;
            rco0 b2 = rco0.a.b(new y7z(e43.l(new l5g(j), new l5g(l5g.c(13, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), null, 0L, 9187343241974906880L, 0), "VK", M, 3126);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new dhx0();
                M.R(x);
            }
            dhx0 dhx0Var = (dhx0) x;
            ((zak0) dhx0Var.a).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            sja0 n = x1o0.n(b2, f, dhx0Var, PictureRadius.Medium, M, 12585984);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new se0(16);
                M.R(x2);
            }
            aou0.d(znjVar, (gzs) x2, null, null, false, n, d, null, M, 48 | (i2 & 14), 78);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(this, znjVar, i, 5);
        }
    }
}
