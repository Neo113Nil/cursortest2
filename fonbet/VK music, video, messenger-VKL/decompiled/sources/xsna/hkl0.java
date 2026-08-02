package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import xsna.dt1;
import xsna.q630;

/* compiled from: StorefrontAlbumsLoading.kt */
/* loaded from: classes18.dex */
public final class hkl0 {
    public static final void a(qa8 qa8Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1033854546);
        if ((i & 6) == 0) {
            i2 = (M.J(qa8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1033854546, i2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontLoading (StorefrontAlbumsLoading.kt:10)");
            }
            dt1.a.getClass();
            zfr0.f(SpinnerState.Loading, qa8Var.b(q630.a.a, dt1.a.f), null, 0L, null, null, M, 6, 60);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ly5(qa8Var, i, 3);
        }
    }
}
