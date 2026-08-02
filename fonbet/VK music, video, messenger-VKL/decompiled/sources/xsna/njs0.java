package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: VideoEpisodesContentState.kt */
/* loaded from: classes2.dex */
public final class njs0 {
    public static final void a(hjs0 hjs0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-970362412);
        int i2 = (M.J(hjs0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-970362412, i2, -1, "com.vk.libvideo.bottomsheet.episode.VideoEpisodesContent (VideoEpisodesContentState.kt:30)");
            }
            xvy a = zvy.a(0, 3, M);
            List<atp> list = hjs0Var.a;
            int i3 = i2 & 14;
            boolean J = (i3 == 4) | M.J(a);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new ijs0(hjs0Var, a, null);
                M.R(x);
            }
            bap.g(list, (wzs) x, M, 0);
            q630 a2 = qri.a(q630Var, a5x.a, new ua30(a, 0));
            u890 m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1);
            boolean z = i3 == 4;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new fuc0(hjs0Var, 24);
                M.R(x2);
            }
            lqy.a(a2, a, m, null, null, null, false, null, (izs) x2, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud6(hjs0Var, q630Var, i, 14);
        }
    }
}
