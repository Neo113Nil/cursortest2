package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.utils.CircularFifoQueue;

/* loaded from: classes7.dex */
public final class bvb implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean w;
    public final /* synthetic */ Iterable x;

    public bvb(ar60 ar60Var) {
        this.a = 1;
        this.x = ar60Var;
        ar60Var.b++;
        this.b = ar60Var.a.size();
    }

    public void a() {
        if (this.w) {
            return;
        }
        this.w = true;
        ar60 ar60Var = (ar60) this.x;
        int i = ar60Var.b - 1;
        ar60Var.b = i;
        if (i <= 0 && ar60Var.c) {
            ar60Var.c = false;
            ArrayList arrayList = ar60Var.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterable iterable = this.x;
        switch (i) {
            case 0:
                return this.w || this.b != ((CircularFifoQueue) iterable).c;
            default:
                int i2 = this.c;
                while (i2 < this.b && ((ar60) iterable).a.get(i2) == null) {
                    i2++;
                }
                if (i2 < this.b) {
                    return true;
                }
                a();
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterable iterable = this.x;
        switch (i) {
            case 0:
                CircularFifoQueue circularFifoQueue = (CircularFifoQueue) iterable;
                if (!hasNext()) {
                    ny61.p();
                    break;
                } else {
                    this.w = false;
                    int i2 = this.b;
                    this.c = i2;
                    this.b = CircularFifoQueue.f(circularFifoQueue, i2);
                    break;
                }
            default:
                ArrayList arrayList = ((ar60) iterable).a;
                while (true) {
                    int i3 = this.c;
                    if (i3 < this.b && arrayList.get(i3) == null) {
                        this.c++;
                    }
                }
                int i4 = this.c;
                if (i4 >= this.b) {
                    a();
                    ny61.p();
                    break;
                } else {
                    this.c = i4 + 1;
                    break;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                CircularFifoQueue circularFifoQueue = (CircularFifoQueue) this.x;
                int i3 = this.c;
                if (i3 == -1) {
                    ny61.k();
                    return;
                }
                int i4 = circularFifoQueue.b;
                if (i3 == i4) {
                    circularFifoQueue.remove();
                    this.c = -1;
                    return;
                }
                int i5 = i3 + 1;
                if (i4 >= i3 || i5 >= (i2 = circularFifoQueue.c)) {
                    while (i5 != circularFifoQueue.c) {
                        i = circularFifoQueue.maxElements;
                        Object[] objArr = circularFifoQueue.a;
                        if (i5 >= i) {
                            objArr[i5 - 1] = objArr[0];
                            i5 = 0;
                        } else {
                            objArr[CircularFifoQueue.b(circularFifoQueue, i5)] = circularFifoQueue.a[i5];
                            i5 = CircularFifoQueue.f(circularFifoQueue, i5);
                        }
                    }
                } else {
                    Object[] objArr2 = circularFifoQueue.a;
                    System.arraycopy(objArr2, i5, objArr2, i3, i2 - i5);
                }
                this.c = -1;
                int b = CircularFifoQueue.b(circularFifoQueue, circularFifoQueue.c);
                circularFifoQueue.c = b;
                circularFifoQueue.a[b] = null;
                circularFifoQueue.w = false;
                this.b = CircularFifoQueue.b(circularFifoQueue, this.b);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public bvb(CircularFifoQueue circularFifoQueue) {
        this.a = 0;
        this.x = circularFifoQueue;
        this.b = circularFifoQueue.b;
        this.c = -1;
        this.w = circularFifoQueue.w;
    }
}
