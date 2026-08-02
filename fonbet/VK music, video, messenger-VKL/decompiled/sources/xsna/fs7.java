package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: BookingNotificationCell.kt */
/* loaded from: classes18.dex */
public final class fs7 {
    public static final void a(mtk0 mtk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(516778294);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(516778294, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingNotificationCell (BookingNotificationCell.kt:47)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new es7(izsVar, mtk0Var);
                M.R(x);
            }
            ((es7) x).a(6, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v17(i, 1, mtk0Var, izsVar, q630Var2);
        }
    }
}
