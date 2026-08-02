package xsna;

import androidx.compose.runtime.a;
import com.vk.core.tool.compose.blur.GradientDirection;

/* compiled from: BackdropBlur.kt */
/* loaded from: classes17.dex */
public final class lv5 {
    public static q630 a(q630 q630Var, rv5 rv5Var, float f, GradientDirection gradientDirection, yk8 yk8Var, yk8 yk8Var2, int i) {
        if ((i & 8) != 0) {
            gradientDirection = null;
        }
        if ((i & 16) != 0) {
            yk8Var = null;
        }
        return q630Var.g(new kv5(rv5Var, f, gradientDirection, yk8Var, (i & 32) != 0 ? null : yk8Var2));
    }

    public static q630 b(q630 q630Var, rv5 rv5Var, long j, int i) {
        if ((i & 4) != 0) {
            j = l5g.j;
        }
        return q630Var.g(new pv5(rv5Var, j));
    }

    public static final rv5 c(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1571732456, 0, -1, "com.vk.core.tool.compose.blur.rememberBackdropState (BackdropBlur.kt:81)");
        }
        mdu a = udu.a(aVar);
        boolean J = aVar.J(a);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new rv5(a);
            aVar.R(x);
        }
        rv5 rv5Var = (rv5) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rv5Var;
    }
}
