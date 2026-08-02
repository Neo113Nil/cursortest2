package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class j63 implements Collection, Set, yfx, fgx {
    public int[] a;
    public Object[] b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j63(j63 j63Var) {
        this(0);
        if (j63Var != null) {
            int i = j63Var.c;
            a(this.c + i);
            if (this.c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(j63Var.b[i2]);
                }
            } else if (i > 0) {
                f73.h(0, i, 6, j63Var.a, this.a);
                f73.l(j63Var.b, 0, this.b, i, 6);
                if (this.c != 0) {
                    ny61.y();
                    throw null;
                }
                this.c = i;
            }
        }
    }

    public final void a(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                f73.h(0, i2, 6, iArr, iArr2);
                f73.l(objArr, 0, this.b, this.c, 6);
            }
        }
        if (this.c == i2) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int L;
        int i2 = this.c;
        if (obj == null) {
            L = cvw.L(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            L = cvw.L(this, obj, hashCode);
        }
        if (L >= 0) {
            return false;
        }
        int i3 = ~L;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                ny61.y();
                return false;
            }
            if (iArr2.length != 0) {
                f73.h(0, iArr.length, 6, iArr, iArr2);
                f73.l(objArr, 0, this.b, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            f73.d(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            f73.g(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        ny61.y();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        a(collection.size() + this.c);
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object b(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                f73.d(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                f73.g(objArr2, i, objArr2, i4, i2);
            }
            this.b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new Object[i5];
            if (i > 0) {
                f73.h(0, i, 6, iArr, iArr2);
                f73.l(objArr, 0, this.b, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                f73.d(i, i6, i2, iArr, this.a);
                f73.g(objArr, i, this.b, i6, i2);
            }
        }
        if (i2 == this.c) {
            this.c = i3;
            return obj;
        }
        ny61.y();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = cvw.a;
            this.b = cvw.c;
            this.c = 0;
        }
        if (this.c == 0) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? cvw.L(this, null, 0) : cvw.L(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new r53(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int L = obj == null ? cvw.L(this, null, 0) : cvw.L(this, obj, obj.hashCode());
        if (L < 0) {
            return false;
        }
        b(L);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!a.G(collection, this.b[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] b = mza1.b(this.c, objArr);
        f73.g(this.b, 0, b, 0, this.c);
        return b;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return f73.n(0, this.c, this.b);
    }

    public j63(int i) {
        this.a = cvw.a;
        this.b = cvw.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public j63() {
        this(0);
    }

    public j63(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
