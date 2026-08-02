package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class r73 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public r73() {
        this(0);
    }

    public static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j) {
        try {
            if (this.d > 0) {
                if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                    a();
                }
            }
            int length = this.b.length;
            if (this.d >= length) {
                int i = length * 2;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i2 = this.c;
                int i3 = length - i2;
                System.arraycopy(this.a, i2, jArr, 0, i3);
                System.arraycopy(this.b, this.c, objArr, 0, i3);
                int i4 = this.c;
                if (i4 > 0) {
                    System.arraycopy(this.a, 0, jArr, i3, i4);
                    System.arraycopy(this.b, 0, objArr, i3, this.c);
                }
                this.a = jArr;
                this.b = objArr;
                this.c = 0;
            }
            int i5 = this.c;
            int i6 = this.d;
            Object[] objArr2 = this.b;
            int length2 = (i5 + i6) % objArr2.length;
            this.a[length2] = j;
            objArr2[length2] = obj;
            this.d = i6 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object c() {
        Object obj;
        int i = this.d;
        obj = null;
        if (i != 0) {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            Object[] objArr = this.b;
            int i2 = this.c;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.c = (i2 + 1) % objArr.length;
            this.d = i - 1;
            obj = obj2;
        }
        return obj;
    }

    public r73(int i) {
        this.a = new long[10];
        this.b = b();
    }

    public final synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final Object a(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        Object obj = null;
        while (true) {
            int i = this.d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.a;
            int i2 = this.c;
            long j3 = j - jArr[i2];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            if (i > 0) {
                Object[] objArr = this.b;
                obj = objArr[i2];
                objArr[i2] = null;
                this.c = (i2 + 1) % objArr.length;
                this.d = i - 1;
                j2 = j3;
            } else {
                throw new IllegalStateException();
            }
        }
        return obj;
    }
}
