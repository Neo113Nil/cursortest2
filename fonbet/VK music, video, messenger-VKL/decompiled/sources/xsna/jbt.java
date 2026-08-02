package xsna;

import com.vungle.ads.internal.protos.Sdk;
import xsna.kbt;

/* compiled from: GamesCatalogErrorScreen.kt */
/* loaded from: classes17.dex */
public final class jbt {
    public static final void a(kbt kbtVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-801838728);
        int i2 = (M.J(kbtVar) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-801838728, i2, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogErrorScreen (GamesCatalogErrorScreen.kt:20)");
            }
            if (kbtVar.equals(kbt.a.a)) {
                M.K(-1767864466);
                fct.a((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, gzsVar, q630Var);
                M.j();
            } else {
                if (!kbtVar.equals(kbt.b.a)) {
                    throw alb0.c(-1767866429, M);
                }
                M.K(-1767859987);
                gct.a((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, gzsVar, q630Var);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f4o(i, 2, kbtVar, gzsVar, q630Var);
        }
    }
}
