package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes11.dex */
public final class zfi0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsConfiguration.kt */
    public static final class a<T> extends Lambda implements gzs<T> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(xfi0 xfi0Var, sgi0<T> sgi0Var) {
        T t = (T) xfi0Var.b.d(sgi0Var);
        return t == null ? a.i.invoke() : t;
    }
}
