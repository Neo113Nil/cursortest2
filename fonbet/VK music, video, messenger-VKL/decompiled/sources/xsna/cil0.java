package xsna;

import java.util.Collection;
import java.util.Collections;

/* compiled from: StorageTrigger.kt */
@ozl
/* loaded from: classes2.dex */
public interface cil0<T> {
    default void a(hhl0<? extends T> hhl0Var) {
        c(Collections.singletonList(hhl0Var));
    }

    default void b(T t, T t2) {
        a(new hhl0<>(t, t2));
    }

    void c(Collection<? extends hhl0<? extends T>> collection);
}
