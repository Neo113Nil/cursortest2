package xsna;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes12.dex */
public final class hy8<K, V> extends zk3<K, V> {
    public int h;

    @Override // xsna.dpj0, java.util.Map
    public final void clear() {
        this.h = 0;
        super.clear();
    }

    @Override // xsna.dpj0
    public final void g(dpj0<? extends K, ? extends V> dpj0Var) {
        this.h = 0;
        super.g(dpj0Var);
    }

    @Override // xsna.dpj0
    public final V h(int i) {
        this.h = 0;
        return (V) super.h(i);
    }

    @Override // xsna.dpj0, java.util.Map
    public final int hashCode() {
        if (this.h == 0) {
            this.h = super.hashCode();
        }
        return this.h;
    }

    @Override // xsna.dpj0
    public final V i(int i, V v) {
        this.h = 0;
        return (V) super.i(i, v);
    }

    @Override // xsna.dpj0, java.util.Map
    public final V put(K k, V v) {
        this.h = 0;
        return (V) super.put(k, v);
    }
}
