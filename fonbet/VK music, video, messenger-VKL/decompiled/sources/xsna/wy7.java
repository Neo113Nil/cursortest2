package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;

/* compiled from: BookingServicesSearchView.kt */
/* loaded from: classes18.dex */
public final class wy7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-201083526);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-201083526, i2, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesSearchView (BookingServicesSearchView.kt:24)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new rwr();
                M.R(x2);
            }
            rwr rwrVar = (rwr) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new Object();
                M.R(x3);
            }
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new uy7(izsVar, 0);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            String string = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getString(R.string.bookings_services_search_hint);
            q630 E = ahn.E(jvi.d(q630Var, rwrVar), "services_search");
            boolean z2 = i3 == 256;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new fg1(3, izsVar, wh50Var);
                M.R(x5);
            }
            gzs gzsVar = (gzs) x5;
            boolean y = M.y(x3) | M.J(izsVar2);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                x6 = new nn4(x3, wh50Var, izsVar2, 1);
                M.R(x6);
            }
            aVar2 = M;
            jiv0.d(tho0Var, string, E, false, false, null, null, null, null, null, gzsVar, false, (izs) x6, aVar2, 0, 0, 3064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vy7(i, 0, str, q630Var, izsVar);
        }
    }
}
