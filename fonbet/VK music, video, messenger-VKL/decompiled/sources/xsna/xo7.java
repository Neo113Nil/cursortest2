package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vkontakte.android.R;

/* compiled from: BookingEditInfoCell.kt */
/* loaded from: classes18.dex */
public final class xo7 {
    public static final void a(mtk0<BookingEditScreenState.InfoBlock> mtk0Var, mtk0<Boolean> mtk0Var2, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1439326814);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(mtk0Var2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439326814, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditInfoCell (BookingEditInfoCell.kt:43)");
            }
            yzo yzoVar = new yzo(d370.N(R.string.booking_edit_info_comment_too_long, 0, M), d370.O(R.string.booking_edit_info_phone_too_long, new Object[]{14}, M), d370.N(R.string.booking_edit_info_phone_not_valid, 0, M), d370.N(R.string.booking_edit_info_phone_format_error, 0, M), d370.N(R.string.booking_edit_info_fill_data_from_profile, 0, M), d370.N(R.string.booking_edit_info_empty_name, 0, M));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new vo7(mtk0Var, mtk0Var2, yzoVar, izsVar);
                M.R(x);
            }
            vo7 vo7Var = (vo7) x;
            ((zak0) vo7Var.b).setValue(izsVar);
            ((zak0) vo7Var.c).setValue(yzoVar);
            vo7Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wo7(mtk0Var, mtk0Var2, izsVar, i, 0);
        }
    }
}
