package xsna;

import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes8.dex */
public final class j9x extends z8x {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public j9x(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // xsna.z8x
    public final int nextInt() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
            return i;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i;
    }
}
