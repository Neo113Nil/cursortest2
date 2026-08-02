package xsna;

import androidx.compose.runtime.a;
import com.vk.design.demo.presentation.nav.ScreenKey;

/* compiled from: MainContent.kt */
/* loaded from: classes18.dex */
public final class ee00 {
    public static final void a(String str, ScreenKey screenKey, izs<? super ScreenKey, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1665142530);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.o(screenKey.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1665142530, i2, -1, "com.vk.design.demo.presentation.screens.CategoryItem (MainContent.kt:168)");
            }
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nh3(16, izsVar, screenKey);
                M.R(x);
            }
            mpj0.a(i2 & 14, 2, M, str, (gzs) x, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv7(str, screenKey, izsVar, i, 3);
        }
    }
}
