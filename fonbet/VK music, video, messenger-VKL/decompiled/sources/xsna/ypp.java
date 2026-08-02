package xsna;

import xsna.btx0;

/* compiled from: EntityWithId.kt */
/* loaded from: classes2.dex */
public final class ypp<V extends btx0> extends xpp<V> {
    public Number c;
    public V d;

    public ypp(Number number) {
        this.c = number;
    }

    @Override // xsna.xpp
    public final Object a() {
        return this.d;
    }

    @Override // xsna.xpp
    public final void e(Object obj) {
        V v = (V) obj;
        this.d = v;
        this.c = v != null ? v.getId() : this.c;
    }

    public ypp(Number number, V v, boolean z) {
        this(number);
        this.d = v;
        this.c = v != null ? v.getId() : this.c;
        this.a = z;
    }
}
