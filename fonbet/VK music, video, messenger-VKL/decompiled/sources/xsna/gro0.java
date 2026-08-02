package xsna;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import xsna.d0q;
import xsna.hro0;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes11.dex */
public class gro0<T extends hro0 & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(gro0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public T[] a;

    public final void a(d0q.c cVar) {
        cVar.b((d0q.d) this);
        T[] tArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (tArr == null) {
            tArr = (T[]) new hro0[4];
            this.a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            tArr = (T[]) ((hro0[]) Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2));
            this.a = tArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tArr[i] = cVar;
        cVar.setIndex(i);
        while (i > 0) {
            T[] tArr2 = this.a;
            int i2 = (i - 1) / 2;
            if (((Comparable) tArr2[i2]).compareTo(tArr2[i]) <= 0) {
                return;
            }
            c(i, i2);
            i = i2;
        }
    }

    public final T b(int i) {
        T[] tArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            c(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || ((Comparable) tArr[i]).compareTo(tArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    T[] tArr2 = this.a;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || ((Comparable) tArr2[i5]).compareTo(tArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (((Comparable) tArr2[i]).compareTo(tArr2[i5]) <= 0) {
                        break;
                    }
                    c(i, i5);
                    i = i5;
                }
            } else {
                c(i, i2);
                while (i2 > 0) {
                    T[] tArr3 = this.a;
                    int i6 = (i2 - 1) / 2;
                    if (((Comparable) tArr3[i6]).compareTo(tArr3[i2]) <= 0) {
                        break;
                    }
                    c(i2, i6);
                    i2 = i6;
                }
            }
        }
        T t = tArr[atomicIntegerFieldUpdater.get(this)];
        t.b(null);
        t.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t;
    }

    public final void c(int i, int i2) {
        T[] tArr = this.a;
        T t = tArr[i2];
        T t2 = tArr[i];
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
