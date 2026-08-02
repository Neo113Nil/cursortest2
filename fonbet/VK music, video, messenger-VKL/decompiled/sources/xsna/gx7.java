package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import xsna.q630;

/* compiled from: BookingServicesBottomBar.kt */
/* loaded from: classes18.dex */
public final class gx7 {
    public static final void a(BookingServicesScreenState.e eVar, q630 q630Var, String str, gzs gzsVar, boolean z, int i, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-667057748);
        int i3 = i2 | (M.J(eVar) ? 4 : 2) | 48 | (M.J(str) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                q630Var = q630.a.a;
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-667057748, i3, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesBottomBar (BookingServicesBottomBar.kt:50)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                ex7 ex7Var = new ex7(eVar, str, gzsVar, z, i);
                M.R(ex7Var);
                x = ex7Var;
            }
            ex7 ex7Var2 = (ex7) x;
            ((zak0) ex7Var2.a).setValue(eVar);
            ((zak0) ex7Var2.b).setValue(str);
            ((zak0) ex7Var2.c).setValue(gzsVar);
            ex7Var2.a(q630Var, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fx7(eVar, q630Var, str, gzsVar, z, i, i2);
        }
    }
}
