package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.tlo0;

/* compiled from: AbortConfirmDialog.kt */
/* loaded from: classes7.dex */
public final class t0 {
    public static final void a(vh8 vh8Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-901887680);
        int i2 = i | (M.J(vh8Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-901887680, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.dialog.abortconfirm.AbortConfirmDialog (AbortConfirmDialog.kt:20)");
            }
            String obj = tlo0.b.a((tlo0.f) vh8Var.b, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            String N = d370.N(R.string.smart_crop_dialog_abort_confirm_description, 0, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new p0(izsVar, 0);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N2 = d370.N(R.string.smart_crop_dialog_abort_confirm_button_abort, 0, M);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new q0(izsVar, 0);
                M.R(x2);
            }
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            boolean z3 = true;
            Alert$Button alert$Button = new Alert$Button(N2, (gzs) x2, style, null);
            String N3 = d370.N(R.string.smart_crop_dialog_abort_confirm_button_cancel, 0, M);
            if (i3 != 32) {
                z3 = false;
            }
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new r0(izsVar, 0);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N3, (gzs) x3, style, null);
            q630.a aVar2 = q630.a.a;
            p7u0.c(24576, 352, M, alert$Button, alert$Button2, null, null, obj, N, null, izsVar2, aVar2);
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
            s.d = new s0(i, 0, vh8Var, izsVar, q630Var2);
        }
    }
}
