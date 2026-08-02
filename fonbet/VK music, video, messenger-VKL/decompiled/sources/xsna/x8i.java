package xsna;

import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes.dex */
public interface x8i {
    default <T> T a(Class<T> cls) {
        return (T) c(toe0.a(cls));
    }

    <T> f9e0<Set<T>> b(toe0<T> toe0Var);

    default <T> T c(toe0<T> toe0Var) {
        f9e0<T> d = d(toe0Var);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    <T> f9e0<T> d(toe0<T> toe0Var);

    default <T> f9e0<T> e(Class<T> cls) {
        return d(toe0.a(cls));
    }

    <T> yrl<T> f(toe0<T> toe0Var);

    default <T> Set<T> g(toe0<T> toe0Var) {
        return b(toe0Var).get();
    }
}
