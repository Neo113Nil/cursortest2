package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class b73 implements Iterator {
    public final /* synthetic */ int a;
    public final Object[] b;
    public int c = 0;

    public /* synthetic */ b73(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c < this.b.length) {
                }
                break;
            default:
                if (this.c < this.b.length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object[] objArr = this.b;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != objArr.length) {
                    this.c = i2 + 1;
                    return objArr[i2];
                }
                throw new NoSuchElementException("Out of elements: " + this.c);
            default:
                int i3 = this.c;
                if (i3 != objArr.length) {
                    this.c = i3 + 1;
                    return objArr[i3];
                }
                throw new NoSuchElementException("Out of elements: " + this.c);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            default:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }
}
