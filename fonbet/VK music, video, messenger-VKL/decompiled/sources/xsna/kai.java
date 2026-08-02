package xsna;

import androidx.compose.runtime.a;
import java.util.ArrayList;

/* compiled from: ComposableLambda.kt */
/* loaded from: classes11.dex */
public final class kai {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final jai b(int i, xzs xzsVar) {
        return new jai(i, xzsVar, true);
    }

    public static final jai c(int i, xzs xzsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1573003438, 54, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new jai(i, xzsVar, true);
            aVar.R(x);
        }
        jai jaiVar = (jai) x;
        if (!epx.f(jaiVar.d, xzsVar)) {
            boolean z = jaiVar.d == null;
            jaiVar.d = xzsVar;
            if (!z && jaiVar.c) {
                vef0 vef0Var = jaiVar.e;
                if (vef0Var != null) {
                    vef0Var.invalidate();
                    jaiVar.e = null;
                }
                ArrayList arrayList = jaiVar.f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((vef0) arrayList.get(i2)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return jaiVar;
    }

    public static final boolean d(vef0 vef0Var, vef0 vef0Var2) {
        if (vef0Var == null) {
            return true;
        }
        if (!(vef0Var instanceof androidx.compose.runtime.f) || !(vef0Var2 instanceof androidx.compose.runtime.f)) {
            return false;
        }
        androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) vef0Var;
        return !fVar.b() || vef0Var.equals(vef0Var2) || epx.f(fVar.c, ((androidx.compose.runtime.f) vef0Var2).c);
    }
}
