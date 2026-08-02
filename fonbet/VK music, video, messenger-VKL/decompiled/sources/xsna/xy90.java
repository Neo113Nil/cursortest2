package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes8.dex */
public abstract class xy90<K, V, T> implements Iterator<T>, gcy {
    public final iqp0<K, V, T>[] b;
    public int c;
    public boolean d = true;

    public xy90(hqp0<K, V> hqp0Var, iqp0<K, V, T>[] iqp0VarArr) {
        this.b = iqp0VarArr;
        iqp0VarArr[0].a(Integer.bitCount(hqp0Var.a) * 2, 0, hqp0Var.d);
        this.c = 0;
        a();
    }

    public final void a() {
        int i = this.c;
        iqp0<K, V, T>[] iqp0VarArr = this.b;
        iqp0<K, V, T> iqp0Var = iqp0VarArr[i];
        if (iqp0Var.d < iqp0Var.c) {
            return;
        }
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                int b = b(i);
                if (b == -1) {
                    iqp0<K, V, T> iqp0Var2 = iqp0VarArr[i];
                    int i3 = iqp0Var2.d;
                    Object[] objArr = iqp0Var2.b;
                    if (i3 < objArr.length) {
                        int length = objArr.length;
                        iqp0Var2.d = i3 + 1;
                        b = b(i);
                    }
                }
                if (b != -1) {
                    this.c = b;
                    return;
                }
                if (i > 0) {
                    iqp0<K, V, T> iqp0Var3 = iqp0VarArr[i - 1];
                    int i4 = iqp0Var3.d;
                    int length2 = iqp0Var3.b.length;
                    iqp0Var3.d = i4 + 1;
                }
                iqp0VarArr[i].a(0, 0, hqp0.e.d);
                if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.d = false;
    }

    public final int b(int i) {
        iqp0<K, V, T>[] iqp0VarArr = this.b;
        iqp0<K, V, T> iqp0Var = iqp0VarArr[i];
        int i2 = iqp0Var.d;
        if (i2 < iqp0Var.c) {
            return i;
        }
        Object[] objArr = iqp0Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        hqp0 hqp0Var = (hqp0) obj;
        if (i == 6) {
            iqp0<K, V, T> iqp0Var2 = iqp0VarArr[i + 1];
            Object[] objArr2 = hqp0Var.d;
            iqp0Var2.a(objArr2.length, 0, objArr2);
        } else {
            iqp0VarArr[i + 1].a(Integer.bitCount(hqp0Var.a) * 2, 0, hqp0Var.d);
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
