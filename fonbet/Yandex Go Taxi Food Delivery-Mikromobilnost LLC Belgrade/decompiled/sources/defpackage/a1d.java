package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface a1d {
    default Object a(Class cls) {
        return c(jgg0.a(cls));
    }

    zvf0 b(jgg0 jgg0Var);

    default Object c(jgg0 jgg0Var) {
        zvf0 f = f(jgg0Var);
        if (f == null) {
            return null;
        }
        return f.get();
    }

    default zvf0 d(Class cls) {
        return f(jgg0.a(cls));
    }

    cg70 e(jgg0 jgg0Var);

    zvf0 f(jgg0 jgg0Var);

    default Set g(jgg0 jgg0Var) {
        return (Set) b(jgg0Var).get();
    }
}
