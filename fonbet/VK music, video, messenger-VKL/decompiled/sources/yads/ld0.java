package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ld0 implements oq0 {
    public final l30 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        io0.a("goog.exo.extractor");
    }

    public ld0(p30 p30Var, long j, long j2) {
        this.b = p30Var;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(boolean z, int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            int i3 = mc3.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int i4 = this.g - this.f;
        while (i4 < i) {
            boolean z2 = z;
            int i5 = i;
            i4 = a(this.e, this.f, i5, i4, z2);
            if (i4 == -1) {
                return false;
            }
            this.g = this.f + i4;
            i = i5;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // yads.oq0
    public final void b(int i) {
        a(false, i);
    }

    @Override // yads.oq0
    public final long c() {
        return this.d + this.f;
    }

    public final void d(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // yads.oq0
    public final long getLength() {
        return this.c;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        ld0 ld0Var;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            d(min);
            i4 = min;
        }
        if (i4 == 0) {
            ld0Var = this;
            i4 = ld0Var.a(bArr, i, i2, 0, true);
        } else {
            ld0Var = this;
        }
        if (i4 != -1) {
            ld0Var.d += i4;
        }
        return i4;
    }

    @Override // yads.oq0
    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public final int b(byte[] bArr, int i, int i2) {
        ld0 ld0Var;
        int min;
        int i3 = this.f + i2;
        byte[] bArr2 = this.e;
        if (i3 > bArr2.length) {
            int i4 = mc3.a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i3, Math.min(bArr2.length * 2, i3 + 524288)));
        }
        int i5 = this.g;
        int i6 = this.f;
        int i7 = i5 - i6;
        if (i7 == 0) {
            ld0Var = this;
            min = ld0Var.a(this.e, i6, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            ld0Var.g += min;
        } else {
            ld0Var = this;
            min = Math.min(i2, i7);
        }
        System.arraycopy(ld0Var.e, ld0Var.f, bArr, i, min);
        ld0Var.f += min;
        return min;
    }

    public final int c(int i) {
        ld0 ld0Var;
        int min = Math.min(this.g, i);
        d(min);
        if (min == 0) {
            byte[] bArr = this.a;
            ld0Var = this;
            min = ld0Var.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            ld0Var = this;
        }
        if (min != -1) {
            ld0Var.d += min;
        }
        return min;
    }

    @Override // yads.oq0
    public final long a() {
        return this.d;
    }

    @Override // yads.oq0
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    @Override // yads.oq0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.d += i3;
        }
        return i3 != -1;
    }

    @Override // yads.oq0
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(z, i2)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // yads.oq0
    public final void b() {
        this.f = 0;
    }

    @Override // yads.oq0
    public final void a(int i) {
        int min = Math.min(this.g, i);
        d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = a(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
