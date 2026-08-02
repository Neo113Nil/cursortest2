package xsna;

import java.util.Arrays;

/* compiled from: IndirectPointerInputDragCycleDetector.kt */
/* loaded from: classes11.dex */
public final class ouw {
    public int a;
    public Object b;

    public ouw(int i) {
        this.b = new long[i];
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public void b(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = (long[]) this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.b, this.a, jArr.length);
        this.a = length;
    }

    public long c(int i) {
        if (i >= 0 && i < this.a) {
            return ((long[]) this.b)[i];
        }
        StringBuilder b = ji.b(i, "Invalid index ", ", size is ");
        b.append(this.a);
        throw new IndexOutOfBoundsException(b.toString());
    }

    public int d() {
        return this.a;
    }
}
