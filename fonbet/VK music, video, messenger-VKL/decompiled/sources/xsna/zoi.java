package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ComposableValue.kt */
/* loaded from: classes17.dex */
public final class zoi<T> implements mtk0<T> {
    public wh50 b;

    /* compiled from: ComposableValue.kt */
    public static final class a {
        public static Lazy a() {
            return msy.a(LazyThreadSafetyMode.NONE, new h13(10));
        }
    }

    public final void c(T t, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(361105058);
        if ((i & 6) == 0) {
            i2 = (M.J(t) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(361105058, i3, -1, "com.vk.core.compose.utils.ComposableValue.RememberValue (ComposableValue.kt:20)");
            }
            this.b = androidx.compose.runtime.k.c(t, M, i3 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y78(this, t, i, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zoi) {
            return epx.f(getValue(), ((zoi) obj).getValue());
        }
        return false;
    }

    @Override // xsna.mtk0
    public final T getValue() {
        wh50 wh50Var = this.b;
        if (wh50Var != null) {
            return wh50Var.getValue();
        }
        return null;
    }

    public final int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }
}
