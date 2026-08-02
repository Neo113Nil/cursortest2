package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import xsna.q630;

/* compiled from: HitTestResult.kt */
/* loaded from: classes11.dex */
public final class z8v implements List<q630.c>, gcy {
    public final fh50<Object> b = new fh50<>(16);
    public final wg50 c = new wg50(16);
    public int d = -1;

    /* compiled from: HitTestResult.kt */
    public final class b implements List<q630.c>, gcy {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, q630.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends q630.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof q630.c) && indexOf((q630.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((q630.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final q630.c get(int i) {
            return (q630.c) z8v.this.b.d(i + this.b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof q630.c)) {
                return -1;
            }
            q630.c cVar = (q630.c) obj;
            int i = this.b;
            int i2 = this.c;
            if (i <= i2) {
                int i3 = i;
                while (!epx.f(z8v.this.b.d(i3), cVar)) {
                    if (i3 != i2) {
                        i3++;
                    }
                }
                return i3 - i;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<q630.c> iterator() {
            int i = this.b;
            return z8v.this.new a(i, i, this.c);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof q630.c)) {
                return -1;
            }
            q630.c cVar = (q630.c) obj;
            int i = this.c;
            int i2 = this.b;
            if (i2 <= i) {
                while (!epx.f(z8v.this.b.d(i), cVar)) {
                    if (i != i2) {
                        i--;
                    }
                }
                return i - i2;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<q630.c> listIterator() {
            int i = this.b;
            return z8v.this.new a(i, i, this.c);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ q630.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<q630.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ q630.c set(int i, q630.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super q630.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<q630.c> subList(int i, int i2) {
            int i3 = this.b;
            return z8v.this.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends q630.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<q630.c> listIterator(int i) {
            int i2 = this.b;
            int i3 = this.c;
            return z8v.this.new a(i + i2, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, q630.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends q630.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c() {
        long b2 = ad0.b(Float.POSITIVE_INFINITY, false, false);
        int i = this.d + 1;
        int h = e43.h(this);
        if (i > h) {
            return b2;
        }
        while (true) {
            wg50 wg50Var = this.c;
            if (i < 0) {
                wg50Var.getClass();
                break;
            }
            if (i >= wg50Var.b) {
                break;
            }
            long j = wg50Var.a[i];
            if (ahn.k(j, b2) < 0) {
                b2 = j;
            }
            if ((ahn.q(b2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !ahn.x(b2)) && i != h) {
                i++;
            }
        }
        alk.D("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d = -1;
        this.b.m();
        this.c.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof q630.c) && indexOf((q630.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((q630.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.b.p(i, i2);
        wg50 wg50Var = this.c;
        if (i >= 0) {
            int i3 = wg50Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    alk.B("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = wg50Var.a;
                        jw5.g(jArr, jArr, i, i2, i3);
                    }
                    wg50Var.b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            wg50Var.getClass();
        }
        alk.D("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final q630.c get(int i) {
        return (q630.c) this.b.d(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof q630.c)) {
            return -1;
        }
        q630.c cVar = (q630.c) obj;
        int h = e43.h(this);
        if (h >= 0) {
            int i = 0;
            while (!epx.f(this.b.d(i), cVar)) {
                if (i != h) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<q630.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof q630.c)) {
            return -1;
        }
        q630.c cVar = (q630.c) obj;
        for (int h = e43.h(this); -1 < h; h--) {
            if (epx.f(this.b.d(h), cVar)) {
                return h;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<q630.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ q630.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<q630.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ q630.c set(int i, q630.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super q630.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<q630.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends q630.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<q630.c> listIterator(int i) {
        return new a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }

    /* compiled from: HitTestResult.kt */
    public final class a implements ListIterator<q630.c>, gcy {
        public int b;
        public final int c;
        public final int d;

        public a(z8v z8vVar, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, z8vVar.b.b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(q630.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.d;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b > this.c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            fh50<Object> fh50Var = z8v.this.b;
            int i = this.b;
            this.b = i + 1;
            return (q630.c) fh50Var.d(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b - this.c;
        }

        @Override // java.util.ListIterator
        public final q630.c previous() {
            fh50<Object> fh50Var = z8v.this.b;
            int i = this.b - 1;
            this.b = i;
            return (q630.c) fh50Var.d(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.b - this.c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(q630.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }
}
