package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DownloadMenuItem.kt */
/* loaded from: classes3.dex */
public final class f9o {
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        String a;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1096869337);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1096869337, i2, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.DownloadMenuItem (DownloadMenuItem.kt:30)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            q630 f = txj0.f(q630Var, 1.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new com.vk.im.video.f(obj, izsVar, rg50Var, 1);
                M.R(x2);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x2, 15);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f2 = 16;
            q630.a aVar3 = q630.a.a;
            f8o.a(wlb0.h(M).getIcon().b, obj, txj0.q(s200.E(aVar3, f2, 10), 28), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(rg50Var.getIntValue()), M, ((i2 << 6) & 896) | 3072);
            DownloadingState downloadingState = (DownloadingState) obj;
            if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.PartlyDownloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                i3 = -1496176809;
                i4 = R.string.music_track_menu_downloaded;
            } else {
                if (downloadingState instanceof DownloadingState.Downloading) {
                    i5 = -1496173576;
                } else if (epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                    i3 = -1496170502;
                    i4 = R.string.music_track_menu_download;
                } else {
                    i5 = -1496168072;
                }
                a = zq.a(M, i5, R.string.music_track_menu_downloading, M, 0);
                float f3 = 14;
                yqv0.c(a, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2, f3, 1), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).N, M, 100663296, 48, 5880);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            a = zq.a(M, i3, i4, M, 0);
            float f32 = 14;
            yqv0.c(a, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f32, f2, f32, 1), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).N, M, 100663296, 48, 5880);
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d9c(i, 1, obj, izsVar, q630Var);
        }
    }
}
