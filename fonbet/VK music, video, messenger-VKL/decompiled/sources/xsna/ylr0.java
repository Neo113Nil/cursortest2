package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class ylr0<V extends wq2> implements xlr0<V> {
    public final xq2 a;
    public V b;
    public V c;
    public V d;

    /* compiled from: VectorizedAnimationSpec.kt */
    public static final class a implements xq2 {
        public final /* synthetic */ aqr b;

        public a(aqr aqrVar) {
            this.b = aqrVar;
        }

        @Override // xsna.xq2
        public final aqr get(int i) {
            return this.b;
        }
    }

    public ylr0(xq2 xq2Var) {
        this.a = xq2Var;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        int b = v.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, this.a.get(i).c(v.a(i), v2.a(i), v3.a(i)));
        }
        return j;
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        if (this.c == null) {
            this.c = (V) v3.c();
        }
        V v4 = this.c;
        if (v4 == null) {
            v4 = null;
        }
        int b = v4.b();
        for (int i = 0; i < b; i++) {
            V v5 = this.c;
            if (v5 == null) {
                v5 = null;
            }
            v5.e(this.a.get(i).b(j, v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.c;
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // xsna.tlr0
    public final V e(V v, V v2, V v3) {
        if (this.d == null) {
            this.d = (V) v3.c();
        }
        V v4 = this.d;
        if (v4 == null) {
            v4 = null;
        }
        int b = v4.b();
        for (int i = 0; i < b; i++) {
            V v5 = this.d;
            if (v5 == null) {
                v5 = null;
            }
            v5.e(this.a.get(i).d(v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.d;
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        if (this.b == null) {
            this.b = (V) v.c();
        }
        V v4 = this.b;
        if (v4 == null) {
            v4 = null;
        }
        int b = v4.b();
        for (int i = 0; i < b; i++) {
            V v5 = this.b;
            if (v5 == null) {
                v5 = null;
            }
            v5.e(this.a.get(i).e(j, v.a(i), v2.a(i), v3.a(i)), i);
        }
        V v6 = this.b;
        if (v6 == null) {
            return null;
        }
        return v6;
    }

    public ylr0(aqr aqrVar) {
        this(new a(aqrVar));
    }
}
