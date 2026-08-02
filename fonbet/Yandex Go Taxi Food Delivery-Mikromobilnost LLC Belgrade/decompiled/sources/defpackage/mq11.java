package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class mq11 implements Iterator, xfx {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ mq11(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((int[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.b < ((long[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.b < ((short[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i2 >= bArr.length) {
                    w511.i(String.valueOf(i2));
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            case 1:
                int i3 = this.b;
                int[] iArr = (int[]) obj;
                if (i3 >= iArr.length) {
                    w511.i(String.valueOf(i3));
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            case 2:
                int i4 = this.b;
                long[] jArr = (long[]) obj;
                if (i4 >= jArr.length) {
                    w511.i(String.valueOf(i4));
                    break;
                } else {
                    this.b = i4 + 1;
                    break;
                }
            default:
                int i5 = this.b;
                short[] sArr = (short[]) obj;
                if (i5 >= sArr.length) {
                    w511.i(String.valueOf(i5));
                    break;
                } else {
                    this.b = i5 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
