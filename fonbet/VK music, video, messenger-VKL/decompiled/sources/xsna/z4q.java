package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: ExitConfirmDialog.kt */
/* loaded from: classes7.dex */
public final class z4q {
    public static final void a(ExitConfirmDialogViewState exitConfirmDialogViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1699985004);
        int i2 = i | (M.J(exitConfirmDialogViewState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1699985004, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialog (ExitConfirmDialog.kt:19)");
            }
            String N = d370.N(R.string.video_upload_cancel_dialog_title, 0, M);
            String str = exitConfirmDialogViewState.b;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new uw(izsVar, 3);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N2 = d370.N(R.string.video_upload_cancel_dialog_exit, 0, M);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new se1(izsVar, 5);
                M.R(x2);
            }
            boolean z3 = true;
            Alert$Button alert$Button = new Alert$Button(N2, (gzs) x2, Alert$Button.Style.Negative, null);
            String N3 = d370.N(R.string.video_upload_cancel_dialog_back, 0, M);
            if (i3 != 32) {
                z3 = false;
            }
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new t9d(izsVar, 1);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N3, (gzs) x3, Alert$Button.Style.Neutral, null);
            xim ximVar = new xim(false, 5);
            q630.a aVar2 = q630.a.a;
            p7u0.c(100687872, 96, M, alert$Button, alert$Button2, null, null, N, str, ximVar, izsVar2, aVar2);
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
            s.d = new uff(i, 2, exitConfirmDialogViewState, izsVar, q630Var2);
        }
    }
}
