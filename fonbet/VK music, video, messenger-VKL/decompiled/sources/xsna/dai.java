package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ComposableFunction.kt */
/* loaded from: classes17.dex */
public abstract class dai<T> implements mtk0<T> {
    public wh50 b;

    /* compiled from: ComposableFunction.kt */
    public static final class a {
        public static Lazy a() {
            return at.c(LazyThreadSafetyMode.NONE);
        }

        public static Lazy b() {
            return msy.a(LazyThreadSafetyMode.NONE, new te0(12));
        }
    }

    /* compiled from: ComposableFunction.kt */
    public static final class b extends dai<yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0>> {
        @Override // xsna.mtk0
        public final Object getValue() {
            yzs yzsVar;
            wh50 wh50Var = this.b;
            return (wh50Var == null || (yzsVar = (yzs) wh50Var.getValue()) == null) ? w65.c : yzsVar;
        }
    }

    /* compiled from: ComposableFunction.kt */
    public static final class c extends dai<gzs<? extends s3q0>> {
        public final kbe c = new kbe(this, 10);

        @Override // xsna.mtk0
        public final Object getValue() {
            return this.c;
        }

        public final kbe j() {
            return this.c;
        }
    }

    /* compiled from: ComposableFunction.kt */
    public static final class d<T> extends dai<izs<? super T, ? extends s3q0>> {
        public final iie c = new iie(this, 5);

        @Override // xsna.mtk0
        public final Object getValue() {
            return this.c;
        }
    }

    /* compiled from: ComposableFunction.kt */
    public static final class e<T1, T2> extends dai<wzs<? super T1, ? super T2, ? extends s3q0>> {
        public final yde c = new yde(this, 2);

        @Override // xsna.mtk0
        public final Object getValue() {
            return this.c;
        }
    }

    public final void c(T t, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1419527152);
        if ((i & 6) == 0) {
            i2 = (M.J(t) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1419527152, i3, -1, "com.vk.core.compose.utils.ComposableFunction.RememberValue (ComposableFunction.kt:23)");
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
            s.d = new wi1(this, t, i, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dai) {
            return epx.f(getValue(), ((dai) obj).getValue());
        }
        return false;
    }

    public final T h() {
        if (this.b != null) {
            return getValue();
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
