package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: BookingCancelConfirmationDialog.kt */
/* loaded from: classes18.dex */
public final class xn7 {
    public final mtk0 a;
    public final wh50 b;

    public xn7(izs izsVar, mtk0 mtk0Var) {
        this.a = mtk0Var;
        this.b = androidx.compose.runtime.k.b(izsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1583455783);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1583455783, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingCancelConfirmationDialogImpl.Content (BookingCancelConfirmationDialog.kt:39)");
            }
            boolean booleanValue = ((Boolean) this.a.getValue()).booleanValue();
            q630Var2 = q630.a.a;
            if (booleanValue) {
                M.K(-1105300529);
                String N = d370.N(R.string.booking_cancel_confirmation_title, 0, M);
                String N2 = d370.N(R.string.booking_cancel_confirmation_description, 0, M);
                String N3 = d370.N(R.string.booking_cancel_confirmation_cancel, 0, M);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new yg(this, 9);
                    M.R(x);
                }
                Alert$Button.Style style = Alert$Button.Style.Neutral;
                Alert$Button alert$Button = new Alert$Button(N3, (gzs) x, style, null);
                String N4 = d370.N(R.string.booking_cancel_confirmation_keep, 0, M);
                boolean z2 = i3 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new zg(this, 9);
                    M.R(x2);
                }
                Alert$Button alert$Button2 = new Alert$Button(N4, (gzs) x2, style, null);
                boolean z3 = i3 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new com.vk.movika.sdk.base.observable.e(this, 11);
                    M.R(x3);
                }
                t7u0.d(384, 336, M, alert$Button, alert$Button2, null, null, N, N2, null, (izs) x3, q630Var2);
            } else {
                M.K(-1106633591);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(this, q630Var2, i, 0);
        }
    }
}
