package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;

/* compiled from: Video2ClipsModal.kt */
/* loaded from: classes7.dex */
public final class wvr0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-75754729);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-75754729, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.modal.video2clips.Video2ClipsModal (Video2ClipsModal.kt:19)");
            }
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new iz7(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            vy20 a = qy20.c.a.a(pg90.a(R.drawable.vk_icon_illustration_clips_player_120h, 0, M), 0L, null, M, 6);
            xy20 a2 = py20.a.a(384, 2, M, d370.N(R.string.modal_video2clips_title, 0, M), null);
            String N = d370.N(R.string.modal_video2clips_button_clip, 0, M);
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new t9d(izsVar, 7);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new mcl0(11);
                M.R(x3);
            }
            sy20 a3 = oy20.a.C3478a.a(N, gzsVar2, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 0, 4092);
            String N2 = d370.N(R.string.modal_video2clips_button_video, 0, M);
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new lwp0(4);
                M.R(x4);
            }
            com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
            boolean z3 = i4 == 4;
            Object x5 = M.x();
            if (z3 || x5 == c0012a) {
                x5 = new w77(izsVar, 6);
                M.R(x5);
            }
            ty20 a5 = oy20.b.a(a3, oy20.a.C3478a.a(N2, (gzs) x5, null, buttonStyle, null, a4, M, 3072, 4084), false, M, 4);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new hyu(27);
                M.R(x6);
            }
            q630Var2 = q630.a.a;
            b5v0.a(gzsVar, q630Var2, a, a2, null, a5, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, i3 & 112, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jr9(izsVar, q630Var2, i);
        }
    }
}
