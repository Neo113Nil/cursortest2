package xsna;

import xsna.wq2;

/* compiled from: Animation.kt */
/* loaded from: classes11.dex */
public interface rm2<T, V extends wq2> {
    boolean a();

    long b();

    default boolean c(long j) {
        return j >= b();
    }

    itp0<T, V> d();

    T e(long j);

    T f();

    V g(long j);
}
