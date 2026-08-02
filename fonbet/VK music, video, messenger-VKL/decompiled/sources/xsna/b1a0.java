package xsna;

import java.util.ListIterator;

/* compiled from: PersistentVector.kt */
/* loaded from: classes8.dex */
public final class b1a0<E> extends eg<E> {
    public final Object[] b;
    public final Object[] c;
    public final int d;
    public final int e;

    public b1a0(Object[] objArr, int i, int i2, Object[] objArr2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = i2;
        if (size() <= 32) {
            throw new IllegalArgumentException(epx.j(Integer.valueOf(size()), "Trie-based persistent vector should have at least 33 elements, got ").toString());
        }
        size();
        size();
    }

    @Override // xsna.ff, java.util.List
    public final E get(int i) {
        Object[] objArr;
        tci.a(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.c;
        } else {
            objArr = this.b;
            for (int i2 = this.e; i2 > 0; i2 -= 5) {
                Object obj = objArr[alk.q(i, i2)];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.d;
    }

    @Override // xsna.ff, java.util.List
    public final ListIterator<E> listIterator(int i) {
        tci.b(i, size());
        return new f1a0(this.b, i, this.c, size(), (this.e / 5) + 1);
    }
}
