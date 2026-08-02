package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.f9k0;
import xsna.q630;

/* compiled from: Snackbar.kt */
/* loaded from: classes7.dex */
public final class r8k0 {
    public static final void a(f9k0 f9k0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        mqv mqvVar;
        wl20 wl20Var;
        androidx.compose.runtime.a M = aVar.M(-728326242);
        int i2 = i | (M.J(f9k0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-728326242, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.snackbar.Snackbar (Snackbar.kt:20)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            if (f9k0Var instanceof f9k0.c) {
                M.K(608068222);
                qzu0.a.getClass();
                lg90 Z = qzu0.Z(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                mqvVar = s200.z(Z, ylu0Var.getIcon().b, M);
                wl20Var = wlb0.m(d370.N(R.string.snackbar_network_error_title, 0, M), null, null, M, 6);
                M.j();
            } else if (f9k0Var instanceof f9k0.b) {
                M.K(608439044);
                mqvVar = jvi.g(M);
                wl20Var = wlb0.m(d370.N(R.string.snackbar_cover_error_load_title, 0, M), d370.N(R.string.snackbar_cover_error_load_subtitle, 0, M), null, M, 4);
                M.j();
            } else if (f9k0Var instanceof f9k0.a) {
                M.K(608778618);
                mqvVar = jvi.g(M);
                wl20Var = wlb0.m(d370.N(R.string.snackbar_cover_error_corrupted_title, 0, M), d370.N(R.string.snackbar_cover_error_corrupted_subtitle, 0, M), null, M, 4);
                M.j();
            } else if (f9k0Var instanceof f9k0.e) {
                M.K(609122873);
                mqvVar = jvi.g(M);
                wl20Var = wlb0.m(d370.N(R.string.snackbar_video_publish_error_title, 0, M), null, null, M, 6);
                M.j();
            } else if (f9k0Var instanceof f9k0.d) {
                M.K(609372764);
                mqvVar = jvi.g(M);
                wl20Var = wlb0.m(d370.N(R.string.snackbar_video_edit_error_title, 0, M), null, null, M, 6);
                M.j();
            } else {
                if (f9k0Var != null) {
                    throw alb0.c(158162040, M);
                }
                M.K(609584711);
                M.j();
                mqvVar = null;
                wl20Var = null;
            }
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new n8k0(f9k0Var, dlv0Var, izsVar, null);
                M.R(x2);
            }
            bap.g(f9k0Var, (wzs) x2, M, i3);
            mqv mqvVar2 = mqvVar;
            q630.a aVar2 = q630.a.a;
            if (wl20Var != null) {
                M.K(609911513);
                zkv0.c(dlv0Var, wl20Var, aVar2, mqvVar2, null, null, M, 390, 112);
            } else {
                M.K(607020484);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w6h(i, 2, (Object) f9k0Var, izsVar, q630Var2);
        }
    }
}
