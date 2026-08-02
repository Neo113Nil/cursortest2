package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: GameCatalogTabsRowLego.kt */
/* loaded from: classes17.dex */
public final class r6t {
    public static final void a(mc90 mc90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        mc90 mc90Var2;
        androidx.compose.runtime.a M = aVar.M(759107328);
        int i2 = (M.J(mc90Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(759107328, i2, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabsRowLego (GameCatalogTabsRowLego.kt:21)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            mc90Var2 = mc90Var;
            ziv0.c(mc90Var2, kai.c(1157258989, new o6t(mc90Var, view, (yvj) x, mc90Var), M), s200.G(txj0.f(aVar2, 1.0f), 6, 2, 10, 8), 0L, false, null, M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            mc90Var2 = mc90Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(mc90Var2, q630Var, i, 4);
        }
    }
}
