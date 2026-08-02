package xsna;

import com.facebook.common.memory.MemoryTrimType;

/* compiled from: InstrumentedMemoryCache.java */
/* loaded from: classes.dex */
public final class r8x<K, V> implements n220<K, V> {
    public final n220<K, V> b;
    public final p220 c;

    public r8x(n220<K, V> n220Var, p220 p220Var) {
        this.b = n220Var;
        this.c = p220Var;
    }

    @Override // xsna.n220
    public final boolean b(yzt yztVar) {
        return this.b.b(yztVar);
    }

    @Override // xsna.n220
    public final uvf<V> c(K k, uvf<V> uvfVar) {
        this.c.c(k);
        return this.b.c(k, uvfVar);
    }

    @Override // xsna.n220
    public final int f(kxc0<K> kxc0Var) {
        return this.b.f(kxc0Var);
    }

    @Override // xsna.n220
    public final uvf<V> get(K k) {
        uvf<V> uvfVar = this.b.get(k);
        p220 p220Var = this.c;
        if (uvfVar == null) {
            p220Var.b(k);
            return uvfVar;
        }
        p220Var.a(k);
        return uvfVar;
    }

    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
        this.b.h(memoryTrimType);
    }
}
