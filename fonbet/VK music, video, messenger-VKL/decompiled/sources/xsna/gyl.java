package xsna;

import xsna.kyl;

/* compiled from: DeliveryPointsMapSheetContent.kt */
/* loaded from: classes18.dex */
public final class gyl {
    public static final void a(izs izsVar, kyl.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1257426649);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(eVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1257426649, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsMapSheetContent (DeliveryPointsMapSheetContent.kt:16)");
            }
            ijk.a(eVar, null, null, "", kai.c(331982051, new v9a(1, q630Var, izsVar), M), M, ((i2 >> 3) & 14) | 27648, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fyl(i, 0, izsVar, eVar, q630Var);
        }
    }
}
