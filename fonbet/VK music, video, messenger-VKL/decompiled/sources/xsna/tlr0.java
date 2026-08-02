package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public interface tlr0<V extends wq2> {
    boolean a();

    long c(V v, V v2, V v3);

    V d(long j, V v, V v2, V v3);

    default V e(V v, V v2, V v3) {
        return d(c(v, v2, v3), v, v2, v3);
    }

    V g(long j, V v, V v2, V v3);
}
