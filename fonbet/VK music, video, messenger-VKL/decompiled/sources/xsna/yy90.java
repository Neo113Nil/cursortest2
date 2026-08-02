package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes11.dex */
public abstract class yy90<K, V, T> implements Iterator<T>, gcy {
    public final jqp0<K, V, T>[] b;
    public int c;
    public boolean d = true;

    public yy90(gqp0<K, V> gqp0Var, jqp0<K, V, T>[] jqp0VarArr) {
        this.b = jqp0VarArr;
        jqp0VarArr[0].a(Integer.bitCount(gqp0Var.a) * 2, 0, gqp0Var.d);
        this.c = 0;
        a();
    }

    public final void a() {
        int i = this.c;
        jqp0<K, V, T>[] jqp0VarArr = this.b;
        jqp0<K, V, T> jqp0Var = jqp0VarArr[i];
        if (jqp0Var.d < jqp0Var.c) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                jqp0<K, V, T> jqp0Var2 = jqp0VarArr[i];
                int i2 = jqp0Var2.d;
                Object[] objArr = jqp0Var2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    jqp0Var2.d = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.c = b;
                return;
            }
            if (i > 0) {
                jqp0<K, V, T> jqp0Var3 = jqp0VarArr[i - 1];
                int i3 = jqp0Var3.d;
                int length2 = jqp0Var3.b.length;
                jqp0Var3.d = i3 + 1;
            }
            jqp0VarArr[i].a(0, 0, gqp0.e.d);
            i--;
        }
        this.d = false;
    }

    public final int b(int i) {
        jqp0<K, V, T>[] jqp0VarArr = this.b;
        jqp0<K, V, T> jqp0Var = jqp0VarArr[i];
        int i2 = jqp0Var.d;
        if (i2 < jqp0Var.c) {
            return i;
        }
        Object[] objArr = jqp0Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        gqp0 gqp0Var = (gqp0) objArr[i2];
        if (i == 6) {
            jqp0<K, V, T> jqp0Var2 = jqp0VarArr[i + 1];
            Object[] objArr2 = gqp0Var.d;
            jqp0Var2.a(objArr2.length, 0, objArr2);
        } else {
            jqp0VarArr[i + 1].a(Integer.bitCount(gqp0Var.a) * 2, 0, gqp0Var.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.d) {
            throw new NoSuchElementException();
        }
        T next = this.b[this.c].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
