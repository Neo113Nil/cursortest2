package xsna;

import androidx.compose.runtime.a;

/* compiled from: BookingConsentPersonalDataCell.kt */
/* loaded from: classes18.dex */
public final class ho7 {
    public static final void a(mtk0 mtk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-679197726);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-679197726, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingConsentPersonalDataCell (BookingConsentPersonalDataCell.kt:33)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new go7(izsVar, mtk0Var);
                M.R(x);
            }
            ((go7) x).a(q630Var, M, (i2 >> 6) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og5(mtk0Var, izsVar, q630Var, i);
        }
    }
}
