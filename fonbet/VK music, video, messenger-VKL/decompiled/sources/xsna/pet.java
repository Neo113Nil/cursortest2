package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: GamesCatalogTabsRow.kt */
/* loaded from: classes17.dex */
public final class pet {
    public static final void a(mc90 mc90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        mc90 mc90Var2;
        androidx.compose.runtime.a M = aVar.M(1117375635);
        int i2 = (M.J(mc90Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1117375635, i2, -1, "com.vk.games.presentation.components.tab.GamesCatalogTabsRow (GamesCatalogTabsRow.kt:19)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            mc90Var2 = mc90Var;
            ziv0.c(mc90Var2, kai.c(-461447866, new wx7(mc90Var, view, (yvj) x, mc90Var), M), txj0.f(aVar2, 1.0f), 0L, false, null, M, 48);
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
            s.d = new o21(mc90Var2, q630Var, i, 3);
        }
    }
}
