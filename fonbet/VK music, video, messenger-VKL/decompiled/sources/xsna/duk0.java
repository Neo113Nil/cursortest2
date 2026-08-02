package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes11.dex */
public final class duk0<T> implements ListIterator<T>, gcy {
    public final SnapshotStateList<T> b;
    public int c;
    public int d = -1;
    public int e;

    public duk0(SnapshotStateList<T> snapshotStateList, int i) {
        this.b = snapshotStateList;
        this.c = i - 1;
        this.e = ((euk0) qak0.h(snapshotStateList.b)).e;
    }

    public final void a() {
        if (m200.t(this.b) != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.c + 1;
        SnapshotStateList<T> snapshotStateList = this.b;
        snapshotStateList.add(i, t);
        this.d = -1;
        this.c++;
        this.e = m200.t(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i = this.c + 1;
        this.d = i;
        SnapshotStateList<T> snapshotStateList = this.b;
        m200.c(i, snapshotStateList.size());
        T t = snapshotStateList.get(i);
        this.c = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i = this.c;
        SnapshotStateList<T> snapshotStateList = this.b;
        m200.c(i, snapshotStateList.size());
        int i2 = this.c;
        this.d = i2;
        this.c--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.d;
        SnapshotStateList<T> snapshotStateList = this.b;
        snapshotStateList.remove(i);
        this.c--;
        this.d = -1;
        this.e = m200.t(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.d;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList<T> snapshotStateList = this.b;
        snapshotStateList.set(i, t);
        this.e = m200.t(snapshotStateList);
    }
}
