package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterators.kt */
/* loaded from: classes8.dex */
public final class vk3 implements Iterator, gcy {
    public final float[] b;
    public int c;

    public vk3(float[] fArr) {
        this.b = fArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            float[] fArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return Float.valueOf(fArr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            this.c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
