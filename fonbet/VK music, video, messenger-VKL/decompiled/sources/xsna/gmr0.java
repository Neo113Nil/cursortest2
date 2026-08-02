package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class gmr0<V extends wq2> implements xlr0<V> {
    public final /* synthetic */ ylr0<V> a;

    public gmr0(float f, float f2, V v) {
        int[] iArr = ulr0.a;
        this.a = new ylr0<>(v != null ? new t98(f, f2, v) : new om3(f, f2));
    }

    @Override // xsna.xlr0, xsna.tlr0
    public final boolean a() {
        this.a.getClass();
        return false;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        return this.a.c(v, v2, v3);
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        return this.a.d(j, v, v2, v3);
    }

    @Override // xsna.tlr0
    public final V e(V v, V v2, V v3) {
        return this.a.e(v, v2, v3);
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        return this.a.g(j, v, v2, v3);
    }
}
