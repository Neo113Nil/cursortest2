package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: ExitConfirmDialog.kt */
/* loaded from: classes7.dex */
public final class a5q {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(331914710);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(331914710, i3, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.dialog.exitconfirm.ExitConfirmDialog (ExitConfirmDialog.kt:17)");
            }
            String N = d370.N(R.string.smart_crop_dialog_exit_confirm_title, 0, M);
            String N2 = d370.N(R.string.smart_crop_dialog_exit_confirm_description, 0, M);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new d8k(izsVar, 1);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N3 = d370.N(R.string.smart_crop_dialog_exit_confirm_button_exit, 0, M);
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new iz7(izsVar, 2);
                M.R(x2);
            }
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x2, style, null);
            String N4 = d370.N(R.string.smart_crop_dialog_exit_confirm_button_cancel, 0, M);
            boolean z3 = i4 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new u77(izsVar, 3);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N4, (gzs) x3, style, null);
            q630Var2 = q630.a.a;
            p7u0.c(57344 & (i3 << 9), 352, M, alert$Button, alert$Button2, null, null, N, N2, null, izsVar2, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqh(izsVar, q630Var2, i);
        }
    }
}
