package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public interface wlr0<V extends wq2> extends xlr0<V> {
    int b();

    @Override // xsna.tlr0
    default long c(V v, V v2, V v3) {
        return (b() + f()) * 1000000;
    }

    int f();
}
