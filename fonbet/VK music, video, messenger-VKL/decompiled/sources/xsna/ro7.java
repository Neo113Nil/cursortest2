package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;

/* compiled from: BookingEditDeleteConfirmationModal.kt */
/* loaded from: classes18.dex */
public final class ro7 {
    public static final void a(mtk0<BookingEditScreenState.g> mtk0Var, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-921787551);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-921787551, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDeleteConfirmationModal (BookingEditDeleteConfirmationModal.kt:36)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qo7(izsVar, mtk0Var);
                M.R(x);
            }
            qo7 qo7Var = (qo7) x;
            ((zak0) qo7Var.b).setValue(izsVar);
            qo7Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s70(mtk0Var, izsVar, i, 1);
        }
    }
}
