package xsna;

import xsna.q630;

/* compiled from: SilentModeBannerView.kt */
/* loaded from: classes5.dex */
public final class gnj0 {
    public static final uog0 a = vog0.b(10);

    public static final void a(fnj0 fnj0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-148597287);
        int i2 = (M.J(fnj0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-148597287, i2, -1, "com.vk.profile.design.view.silentmodebanner.SilentModeBannerContent (SilentModeBannerView.kt:63)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            uog0 uog0Var = a;
            q630 c = ojc.c(rte0.d(f, uog0Var), false, null, null, gzsVar, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phu0.a(c, uog0Var, ylu0Var.getWrite().b, 0L, null, 0, kai.c(-1706067759, new om9(fnj0Var, 15), M), aVar2, 1769520, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xf4(fnj0Var, gzsVar, i, 9);
        }
    }
}
