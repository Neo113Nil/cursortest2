package xsna;

import kotlin.collections.EmptyList;

/* compiled from: TaskDispatcher.kt */
/* loaded from: classes.dex */
public interface h5o0 {

    /* compiled from: TaskDispatcher.kt */
    public interface a {
        void a();
    }

    static a b(h5o0 h5o0Var, String str, Runnable runnable) {
        return h5o0Var.c(str, EmptyList.b, runnable);
    }

    np10 a();

    a c(String str, Iterable<? extends a> iterable, Runnable runnable);
}
