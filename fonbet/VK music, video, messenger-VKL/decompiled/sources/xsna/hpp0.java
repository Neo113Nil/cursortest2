package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import xsna.q630;

/* compiled from: TrapBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class hpp0 {
    public static final void a(AboutVideoItem.a0 a0Var, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1538839164);
        int i2 = (M.J(a0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1538839164, i3, -1, "com.vk.video.ui.discovery.minimizable.banner_trap.TrapBannerContent (TrapBannerDelegate.kt:89)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1010552899, new cqg(a0Var, gzsVar2, gzsVar), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o88(a0Var, gzsVar, gzsVar2, q630Var2, i);
        }
    }
}
