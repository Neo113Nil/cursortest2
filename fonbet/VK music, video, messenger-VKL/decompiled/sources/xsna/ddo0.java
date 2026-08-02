package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import xsna.q630;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
/* loaded from: classes11.dex */
public final class ddo0 {
    public static final ddo0 a = new ddo0();

    public final void a(Drawable drawable, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(257732500);
        int i2 = (M.y(drawable) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(257732500, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            q630 q = txj0.q(q630.a.a, woj.j);
            boolean y = M.y(drawable);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new jan0(drawable, 2);
                M.R(x);
            }
            ja8.a(bu00.c(q, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0k(this, drawable, i, 7);
        }
    }

    public final void b(Icon icon, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> g06Var;
        androidx.compose.runtime.a M = aVar.M(2116504409);
        int i2 = (M.y(icon) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2116504409, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = M.J(icon) | M.J(context);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = icon.loadDrawable(context);
                M.R(x);
            }
            Drawable drawable = (Drawable) x;
            if (drawable == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    g06Var = new ljf(this, icon, i, 7);
                    s.d = g06Var;
                }
                return;
            }
            a(drawable, M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            g06Var = new g06(this, icon, i, 15);
            s.d = g06Var;
        }
    }
}
