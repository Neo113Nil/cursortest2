package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VideoPlaylistCoverView.kt */
/* loaded from: classes16.dex */
public final class r4t0 extends rpo0 {
    public final wh50<q4t0> m;

    public r4t0(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(new q4t0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "", false, false, null, false, false, false, false, false, new o7j0(11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1012968001);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1012968001, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverView.ThemedContent (VideoPlaylistCoverView.kt:87)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = this.m;
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = Boolean.valueOf(fxc0.B().J().r());
                M.R(x2);
            }
            t4t0.a((q4t0) wh50Var.getValue(), null, ((Boolean) x2).booleanValue(), M, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bn7(this, i, 15);
        }
    }

    public final wh50<q4t0> getViewState() {
        return this.m;
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(233445061);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(233445061, i2, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverView.Theme (VideoPlaylistCoverView.kt:79)");
            }
            jaiVar2 = jaiVar;
            rrv0.e(true, null, null, null, null, null, jaiVar2, M, ((i2 << 18) & 3670016) | 6, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zre(this, jaiVar2, i, 2);
        }
    }
}
