package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class bnu implements List, xfx {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final List w;

    public /* synthetic */ bnu(int i, int i2, int i3, List list) {
        this.a = i3;
        this.w = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void addFirst(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void addLast(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof e530) && indexOf((e530) obj) != -1) {
                    break;
                }
                break;
            default:
                for (int i = this.b; i < this.c; i++) {
                    if (jl40.l(this.w.get(i), obj)) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains((e530) it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        int i3 = this.b;
        List list = this.w;
        switch (i2) {
            case 0:
                return (e530) ((cnu) list).a.b(i + i3);
            default:
                int size = size();
                if (i >= 0 && i < size) {
                    return list.get(i + i3);
                }
                ny61.m(b64.d(i, size, "Index ", " is out of bounds. The list has ", " elements."));
                return null;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        List list = this.w;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof e530)) {
                    return -1;
                }
                e530 e530Var = (e530) obj;
                if (i3 > i2) {
                    return -1;
                }
                int i4 = i3;
                while (!jl40.l(((cnu) list).a.b(i4), e530Var)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4++;
                }
                return i4 - i3;
            default:
                for (int i5 = i3; i5 < i2; i5++) {
                    if (jl40.l(list.get(i5), obj)) {
                        return i5 - i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                }
                break;
            default:
                if (this.c == this.b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                cnu cnuVar = (cnu) this.w;
                int i = this.b;
                return new anu(cnuVar, i, i, this.c);
            default:
                return new sy40(this, 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.a;
        List list = this.w;
        int i2 = this.b;
        int i3 = this.c;
        switch (i) {
            case 0:
                if (obj instanceof e530) {
                    e530 e530Var = (e530) obj;
                    if (i2 <= i3) {
                        while (!jl40.l(((cnu) list).a.b(i3), e530Var)) {
                            if (i3 == i2) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (!jl40.l(list.get(i4), obj)) {
                        if (i4 == i2) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                cnu cnuVar = (cnu) this.w;
                int i = this.b;
                return new anu(cnuVar, i, i, this.c);
            default:
                return new sy40(this, 0);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final Object removeFirst() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final Object removeLast() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.c;
                i2 = this.b;
                break;
            default:
                i = this.c;
                i2 = this.b;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                cnu cnuVar = (cnu) this.w;
                int i3 = this.b;
                return new bnu(i + i3, i3 + i2, 0, cnuVar);
            default:
                int size = size();
                if (i > i2) {
                    ny61.g(b64.d(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
                    return null;
                }
                if (i < 0) {
                    ny61.m(oyr.j(i, "fromIndex (", ") is less than 0."));
                    return null;
                }
                if (i2 <= size) {
                    return new bnu(i, i2, 1, this);
                }
                ny61.m(b64.d(i2, size, "toIndex (", ") is more than than the list size (", Extension.C_BRAKE));
                return null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return vng.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
        }
        return vng.K(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                cnu cnuVar = (cnu) this.w;
                int i2 = this.b;
                return new anu(cnuVar, i + i2, i2, this.c);
            default:
                return new sy40(this, i);
        }
    }
}
