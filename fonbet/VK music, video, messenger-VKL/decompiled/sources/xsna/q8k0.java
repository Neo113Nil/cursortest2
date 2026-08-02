package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.e9k0;
import xsna.f7k0;
import xsna.q630;

/* compiled from: Snackbar.kt */
/* loaded from: classes7.dex */
public final class q8k0 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e9k0 e9k0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        wl20 wl20Var;
        mqv mqvVar;
        mqv z;
        wl20 m;
        boolean z2;
        Object x;
        androidx.compose.runtime.a M = aVar.M(1787662221);
        int i2 = i | (M.J(e9k0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1787662221, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.snackbar.Snackbar (Snackbar.kt:21)");
            }
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x2;
            if (e9k0Var instanceof e9k0.a) {
                M.K(-1348874478);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-752754654, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ErrorOutline28> (VkIcons.kt:2458)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_error_outline_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(a, ylu0Var.getIcon().p, M);
                m = wlb0.m(d370.N(R.string.attached_clips_snackbar_limit_title, 0, M), null, null, M, 6);
                M.j();
            } else if (e9k0Var instanceof e9k0.d) {
                M.K(-1348510321);
                qzu0.a.getClass();
                lg90 Z = qzu0.Z(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(Z, ylu0Var2.getIcon().b, M);
                m = wlb0.m(d370.N(R.string.snackbar_network_error_title, 0, M), null, null, M, 6);
                M.j();
            } else if (e9k0Var instanceof e9k0.b) {
                M.K(-1348129455);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
                }
                lg90 b = or.b(M, 66431199, R.drawable.vk_icon_error_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(b, ylu0Var3.getIcon().h, M);
                String N = d370.N(R.string.attached_clips_snackbar_clips_load_error_title, 0, M);
                String N2 = d370.N(R.string.attached_clips_snackbar_clips_load_error_button, 0, M);
                boolean z3 = (i2 & 112) == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new tq0(izsVar, 8);
                    M.R(x3);
                }
                m = wlb0.m(N, null, f7k0.a.a(N2, (gzs) x3, M, 0), M, 2);
                M.j();
            } else if (e9k0Var instanceof e9k0.f) {
                M.K(-1347476905);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
                }
                lg90 b2 = or.b(M, 66431199, R.drawable.vk_icon_error_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(b2, ylu0Var4.getIcon().h, M);
                m = wlb0.m(d370.N(R.string.attached_clips_snackbar_save_single_clip_error_title, 0, M), null, null, M, 6);
                M.j();
            } else if (e9k0Var instanceof e9k0.e) {
                M.K(-1347073068);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
                }
                lg90 b3 = or.b(M, 66431199, R.drawable.vk_icon_error_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(b3, ylu0Var5.getIcon().h, M);
                m = wlb0.m(d370.N(R.string.attached_clips_snackbar_save_multiple_clips_error_title, 0, M), null, null, M, 6);
                M.j();
            } else if (e9k0Var instanceof e9k0.c) {
                M.K(-1346672517);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
                }
                lg90 b4 = or.b(M, 66431199, R.drawable.vk_icon_error_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(b4, ylu0Var6.getIcon().h, M);
                m = wlb0.m(d370.N(R.string.attached_clips_snackbar_detach_clips_error_title, 0, M), null, null, M, 6);
                M.j();
            } else {
                if (e9k0Var != null) {
                    throw alb0.c(-43511706, M);
                }
                M.K(-1346320264);
                M.j();
                wl20Var = null;
                mqvVar = null;
                int i3 = i2 & 14;
                z2 = (i3 != 4) | ((i2 & 112) == 32);
                x = M.x();
                if (!z2 || x == c0012a) {
                    x = new o8k0(e9k0Var, dlv0Var, izsVar, null);
                    M.R(x);
                }
                bap.g(e9k0Var, (wzs) x, M, i3);
                q630.a aVar2 = q630.a.a;
                if (wl20Var == null) {
                    M.K(-1345986518);
                    zkv0.c(dlv0Var, wl20Var, aVar2, mqvVar, null, null, M, 390, 112);
                } else {
                    M.K(-1349983627);
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
            }
            wl20 wl20Var2 = m;
            mqvVar = z;
            wl20Var = wl20Var2;
            int i32 = i2 & 14;
            z2 = (i32 != 4) | ((i2 & 112) == 32);
            x = M.x();
            if (!z2) {
            }
            x = new o8k0(e9k0Var, dlv0Var, izsVar, null);
            M.R(x);
            bap.g(e9k0Var, (wzs) x, M, i32);
            q630.a aVar22 = q630.a.a;
            if (wl20Var == null) {
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
            }
            q630Var2 = aVar22;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r67(i, 4, e9k0Var, izsVar, q630Var2);
        }
    }
}
