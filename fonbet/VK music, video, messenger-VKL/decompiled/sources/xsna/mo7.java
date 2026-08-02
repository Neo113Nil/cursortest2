package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;

/* compiled from: BookingEditBottomBar.kt */
/* loaded from: classes18.dex */
public final class mo7 {
    public static final void a(mtk0<? extends BookingEditScreenState.a> mtk0Var, mtk0<Boolean> mtk0Var2, String str, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1607352705);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(mtk0Var2) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1607352705, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBar (BookingEditBottomBar.kt:53)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getImage().a;
            float f = 12;
            uog0 d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            y18 a = aqw.a(1, j2);
            boolean p = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256) | M.p(j) | M.J(d) | M.J(a);
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                izsVar2 = izsVar;
                ko7 ko7Var = new ko7(mtk0Var, mtk0Var2, str, izsVar2, j, d, a);
                M.R(ko7Var);
                x = ko7Var;
            } else {
                izsVar2 = izsVar;
            }
            ko7 ko7Var2 = (ko7) x;
            ((zak0) ko7Var2.d).setValue(izsVar2);
            ko7Var2.b(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lo7(mtk0Var, mtk0Var2, str, izsVar2, i, 0);
        }
    }
}
