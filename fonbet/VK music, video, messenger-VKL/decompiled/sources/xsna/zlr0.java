package xsna;

import xsna.wq2;

/* compiled from: DecayAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class zlr0<V extends wq2> {
    public final eqr a;
    public V b;
    public V c;
    public V d;
    public final float e;

    public zlr0(eqr eqrVar) {
        this.a = eqrVar;
        this.e = eqrVar.e();
    }

    public final float a() {
        return this.e;
    }

    public final V b(V v, V v2) {
        if (this.d == null) {
            this.d = (V) v.c();
        }
        V v3 = this.d;
        if (v3 == null) {
            v3 = null;
        }
        int b = v3.b();
        for (int i = 0; i < b; i++) {
            V v4 = this.d;
            if (v4 == null) {
                v4 = null;
            }
            v4.e(this.a.b(v.a(i), v2.a(i)), i);
        }
        V v5 = this.d;
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    public final V c(long j, V v, V v2) {
        if (this.c == null) {
            this.c = (V) v.c();
        }
        V v3 = this.c;
        if (v3 == null) {
            v3 = null;
        }
        int b = v3.b();
        for (int i = 0; i < b; i++) {
            V v4 = this.c;
            if (v4 == null) {
                v4 = null;
            }
            v.getClass();
            v4.e(this.a.c(v2.a(i), j), i);
        }
        V v5 = this.c;
        if (v5 == null) {
            return null;
        }
        return v5;
    }
}
