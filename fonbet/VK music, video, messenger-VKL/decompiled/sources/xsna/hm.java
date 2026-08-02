package xsna;

import androidx.compose.runtime.a;

/* compiled from: AccessibilityServiceStateProvider.android.kt */
/* loaded from: classes11.dex */
public final class hm {
    public static final void a(f5z f5zVar, izs izsVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1868327245);
        int i2 = (M.y(f5zVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1868327245, i2, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean y = ((i2 & 112) == 32) | M.y(f5zVar) | ((i2 & 896) == 256);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new dm(f5zVar, izsVar, gzsVar, 0);
                M.R(x);
            }
            bap.c(f5zVar, (izs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new em(f5zVar, izsVar, gzsVar, i, 0);
        }
    }
}
