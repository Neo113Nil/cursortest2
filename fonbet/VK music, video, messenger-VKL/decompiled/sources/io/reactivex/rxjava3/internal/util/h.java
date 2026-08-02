package io.reactivex.rxjava3.internal.util;

/* compiled from: OpenHashSet.java */
/* loaded from: classes11.dex */
public final class h<T> {
    public int a;
    public int b;
    public int c;
    public T[] d;

    public h(int i, int i2) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.a = numberOfLeadingZeros - 1;
        this.c = (int) (0.75f * numberOfLeadingZeros);
        this.d = (T[]) new Object[numberOfLeadingZeros];
    }

    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        T t;
        Object obj;
        Object[] objArr = this.d;
        int i = this.a;
        int hashCode = cVar.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj2 = objArr[i2];
        if (obj2 != null) {
            if (obj2.equals(cVar)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj = objArr[i2];
                if (obj == null) {
                }
            } while (!obj.equals(cVar));
            return;
        }
        objArr[i2] = cVar;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 < this.c) {
            return;
        }
        T[] tArr = this.d;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.a = i5;
                this.c = (int) (i4 * 0.75f);
                this.d = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int hashCode2 = t.hashCode() * (-1640531527);
            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
            if (tArr2[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (tArr2[i7] != null);
            }
            tArr2[i7] = tArr[length];
            i3 = i6;
        }
    }

    public final void b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
