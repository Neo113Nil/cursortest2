package xsna;

import com.vk.core.compose.component.defaults.SpinnerSize;
import xsna.q630;

/* compiled from: LeftLoadingImpl.kt */
/* loaded from: classes17.dex */
public final class vzy implements e7k0 {
    @Override // xsna.e7k0, xsna.g7k0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1421750463);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1421750463, i2, -1, "com.vk.core.compose.component.snackbar.LeftLoadingImpl.Content (LeftLoadingImpl.kt:11)");
            }
            zfr0.e(aVar2, 0L, SpinnerSize.Size24, M, (i2 & 14) | 384, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v26(this, i);
        }
    }
}
