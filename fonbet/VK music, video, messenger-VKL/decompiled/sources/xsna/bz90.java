package xsna;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes8.dex */
public class bz90<K, V, T> extends xy90<K, V, T> {
    public final zy90<K, V> e;
    public K f;
    public boolean g;
    public int h;

    public bz90(zy90<K, V> zy90Var, iqp0<K, V, T>[] iqp0VarArr) {
        super(zy90Var.d, iqp0VarArr);
        this.e = zy90Var;
        this.h = zy90Var.f;
    }

    public final void c(int i, hqp0<?, ?> hqp0Var, K k, int i2) {
        int i3 = i2 * 5;
        iqp0<K, V, T>[] iqp0VarArr = this.b;
        if (i3 <= 30) {
            int z = 1 << zq70.z(i, i3);
            if (hqp0Var.i(z)) {
                iqp0VarArr[i2].a(Integer.bitCount(hqp0Var.a) * 2, hqp0Var.f(z), hqp0Var.d);
                this.c = i2;
                return;
            }
            int u = hqp0Var.u(z);
            hqp0<?, ?> t = hqp0Var.t(u);
            iqp0VarArr[i2].a(Integer.bitCount(hqp0Var.a) * 2, u, hqp0Var.d);
            c(i, t, k, i2 + 1);
            return;
        }
        iqp0<K, V, T> iqp0Var = iqp0VarArr[i2];
        Object[] objArr = hqp0Var.d;
        iqp0Var.a(objArr.length, 0, objArr);
        while (true) {
            iqp0<K, V, T> iqp0Var2 = iqp0VarArr[i2];
            if (epx.f(iqp0Var2.b[iqp0Var2.d], k)) {
                this.c = i2;
                return;
            } else {
                iqp0VarArr[i2].d += 2;
            }
        }
    }

    @Override // xsna.xy90, java.util.Iterator
    public final T next() {
        if (this.e.f != this.h) {
            throw new ConcurrentModificationException();
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        iqp0<K, V, T> iqp0Var = this.b[this.c];
        this.f = (K) iqp0Var.b[iqp0Var.d];
        this.g = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xy90, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        boolean z = this.d;
        zy90<K, V> zy90Var = this.e;
        if (!z) {
            zy90Var.remove(this.f);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            iqp0<K, V, T> iqp0Var = this.b[this.c];
            Object obj = iqp0Var.b[iqp0Var.d];
            zy90Var.remove(this.f);
            c(obj == null ? 0 : obj.hashCode(), zy90Var.d, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = zy90Var.f;
    }
}
