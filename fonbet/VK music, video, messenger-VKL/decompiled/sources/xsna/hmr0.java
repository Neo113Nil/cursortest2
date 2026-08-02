package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class hmr0<V extends wq2> implements wlr0<V> {
    public final int a;
    public final int b;
    public final huo c;
    public final ylr0<V> d;

    public hmr0(int i, int i2, huo huoVar) {
        this.a = i;
        this.b = i2;
        this.c = huoVar;
        this.d = new ylr0<>(new pqr(i, i2, huoVar));
    }

    @Override // xsna.wlr0
    public final int b() {
        return this.a;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        return this.d.d(j, v, v2, v3);
    }

    @Override // xsna.wlr0
    public final int f() {
        return this.b;
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        return this.d.g(j, v, v2, v3);
    }
}
