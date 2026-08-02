package xsna;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes11.dex */
public class cz90<K, V, T> extends yy90<K, V, T> {
    public final az90<K, V> e;
    public K f;
    public boolean g;
    public int h;

    public cz90(az90<K, V> az90Var, jqp0<K, V, T>[] jqp0VarArr) {
        super(az90Var.d, jqp0VarArr);
        this.e = az90Var;
        this.h = az90Var.f;
    }

    public final void c(int i, gqp0<?, ?> gqp0Var, K k, int i2) {
        int i3 = i2 * 5;
        jqp0<K, V, T>[] jqp0VarArr = this.b;
        if (i3 <= 30) {
            int j = 1 << sdi.j(i, i3);
            if (gqp0Var.h(j)) {
                jqp0VarArr[i2].a(Integer.bitCount(gqp0Var.a) * 2, gqp0Var.f(j), gqp0Var.d);
                this.c = i2;
                return;
            }
            int t = gqp0Var.t(j);
            gqp0<?, ?> s = gqp0Var.s(t);
            jqp0VarArr[i2].a(Integer.bitCount(gqp0Var.a) * 2, t, gqp0Var.d);
            c(i, s, k, i2 + 1);
            return;
        }
        jqp0<K, V, T> jqp0Var = jqp0VarArr[i2];
        Object[] objArr = gqp0Var.d;
        jqp0Var.a(objArr.length, 0, objArr);
        while (true) {
            jqp0<K, V, T> jqp0Var2 = jqp0VarArr[i2];
            if (epx.f(jqp0Var2.b[jqp0Var2.d], k)) {
                this.c = i2;
                return;
            } else {
                jqp0VarArr[i2].d += 2;
            }
        }
    }

    @Override // xsna.yy90, java.util.Iterator
    public final T next() {
        if (this.e.f != this.h) {
            throw new ConcurrentModificationException();
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        jqp0<K, V, T> jqp0Var = this.b[this.c];
        this.f = (K) jqp0Var.b[jqp0Var.d];
        this.g = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yy90, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        boolean z = this.d;
        az90<K, V> az90Var = this.e;
        if (!z) {
            ttp0.c(az90Var).remove(this.f);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            jqp0<K, V, T> jqp0Var = this.b[this.c];
            Object obj = jqp0Var.b[jqp0Var.d];
            ttp0.c(az90Var).remove(this.f);
            c(obj != null ? obj.hashCode() : 0, az90Var.d, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = az90Var.f;
    }
}
