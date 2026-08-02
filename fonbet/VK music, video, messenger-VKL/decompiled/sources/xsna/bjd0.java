package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;

/* compiled from: ProductButtonsBinderImpl.kt */
/* loaded from: classes18.dex */
public final class bjd0 {
    public static final void a(String str, ButtonAppearance buttonAppearance, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(822251822);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(822251822, i2, -1, "com.vk.ecomm.market.good.ui.CartButtonContent (ProductButtonsBinderImpl.kt:438)");
            }
            rrv0.d(null, null, null, null, kai.c(1512946131, new nn7(str, gzsVar, buttonAppearance, 4), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new heo(i, 1, str, buttonAppearance, gzsVar);
        }
    }

    public static final void b(String str, String str2, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(406408175);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(406408175, i2, -1, "com.vk.ecomm.market.good.ui.OzonPrimaryCallButtonContent (ProductButtonsBinderImpl.kt:464)");
            }
            rrv0.d(null, null, null, null, kai.c(343095274, new mt(str, str2, gzsVar, 8), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqc(i, 3, str, str2, gzsVar);
        }
    }
}
