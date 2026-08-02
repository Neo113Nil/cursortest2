package xsna;

import java.util.NoSuchElementException;

/* compiled from: TrieIterator.kt */
/* loaded from: classes8.dex */
public final class eqp0<E> extends gf<E> {
    public int d;
    public Object[] e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public eqp0(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.d = i3;
        Object[] objArr2 = new Object[i3];
        this.e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final E a() {
        int i = this.b & 31;
        Object obj = this.e[this.d - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    public final void b(int i, int i2) {
        int i3 = (this.d - i2) * 5;
        while (i2 < this.d) {
            Object[] objArr = this.e;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i2] = ((Object[]) obj)[alk.q(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (alk.q(this.b, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.b, ((this.d - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E a = a();
        int i = this.b + 1;
        this.b = i;
        if (i == this.c) {
            this.f = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b--;
        if (this.f) {
            this.f = false;
            return a();
        }
        c(31);
        return a();
    }
}
