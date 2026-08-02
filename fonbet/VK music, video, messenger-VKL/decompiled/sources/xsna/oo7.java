package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;

/* compiled from: BookingEditDateCell.kt */
/* loaded from: classes18.dex */
public final class oo7 {
    public static final void a(mtk0<BookingEditScreenState.c> mtk0Var, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1442760515);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1442760515, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDateCell (BookingEditDateCell.kt:33)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new no7(izsVar, mtk0Var);
                M.R(x);
            }
            no7 no7Var = (no7) x;
            ((zak0) no7Var.b).setValue(izsVar);
            no7Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n85(mtk0Var, izsVar, i, 1);
        }
    }
}
