package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
/* loaded from: classes11.dex */
public final class dd2 {
    public static final void a(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2064964257);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2064964257, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:67)");
            }
            b(q630Var, jaiVar, M, (i2 & 14) | 48 | ((i2 << 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yc2(q630Var, jaiVar, i);
        }
    }

    public static final void b(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(771959668);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(771959668, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:84)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.a(null, w65.e);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new zc2(0, wh50Var);
                M.R(x2);
            }
            rvi.a(hdo0.b.b(c((i2 & 112) | 6, 0, M, (gzs) x2)), kai.c(-291176396, new m2(q630Var, wh50Var, jaiVar), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ad2(q630Var, jaiVar, i, 0);
        }
    }

    public static final uc2 c(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(549805508, i, -1, "androidx.compose.foundation.text.contextmenu.internal.platformTextContextMenuToolbarProvider (AndroidTextContextMenuToolbarProvider.android.kt:111)");
        }
        View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
        boolean J = aVar.J(view);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            x = new uc2(view, gzsVar, null);
            aVar.R(x);
        }
        uc2 uc2Var = (uc2) x;
        boolean y = aVar.y(uc2Var);
        Object x2 = aVar.x();
        if (y || x2 == obj) {
            x2 = new t6(uc2Var, 5);
            aVar.R(x2);
        }
        bap.c(uc2Var, (izs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return uc2Var;
    }
}
