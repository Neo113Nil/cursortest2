package defpackage;

import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class kbh implements c5p {
    public final apg b;
    public final long c;
    public long w;
    public int y;
    public int z;
    public byte[] x = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        ge10.a("media3.extractor");
    }

    public kbh(apg apgVar, long j, long j2) {
        this.b = apgVar;
        this.w = j;
        this.c = j2;
    }

    @Override // defpackage.c5p
    public final boolean H(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.x, this.y - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.c5p
    public final void J() {
        this.y = 0;
    }

    @Override // defpackage.c5p
    public final long L() {
        return this.w + this.y;
    }

    @Override // defpackage.c5p
    public final void N(int i) {
        a(i, false);
    }

    @Override // defpackage.c5p
    public final void O(int i) {
        int min = Math.min(this.z, i);
        d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = c(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.w += i2;
        }
    }

    public final boolean a(int i, boolean z) {
        b(i);
        int i2 = this.z - this.y;
        while (i2 < i) {
            kbh kbhVar = this;
            int i3 = i;
            boolean z2 = z;
            i2 = kbhVar.c(this.x, this.y, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            kbhVar.z = kbhVar.y + i2;
            this = kbhVar;
            i = i3;
            z = z2;
        }
        this.y += i;
        return true;
    }

    public final void b(int i) {
        int i2 = this.y + i;
        byte[] bArr = this.x;
        if (i2 > bArr.length) {
            this.x = Arrays.copyOf(this.x, tw21.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int c(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    public final void d(int i) {
        int i2 = this.z - i;
        this.z = i2;
        this.y = 0;
        byte[] bArr = this.x;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.x = bArr2;
    }

    @Override // defpackage.c5p
    public final void g(int i, int i2, byte[] bArr) {
        H(bArr, i, i2, false);
    }

    @Override // defpackage.c5p
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.c5p
    public final long getPosition() {
        return this.w;
    }

    @Override // defpackage.c5p
    public final int p(int i, int i2, byte[] bArr) {
        kbh kbhVar;
        int min;
        b(i2);
        int i3 = this.z;
        int i4 = this.y;
        int i5 = i3 - i4;
        if (i5 == 0) {
            kbhVar = this;
            min = kbhVar.c(this.x, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            kbhVar.z += min;
        } else {
            kbhVar = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(kbhVar.x, kbhVar.y, bArr, i, min);
        kbhVar.y += min;
        return min;
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        kbh kbhVar;
        int i3 = this.z;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.x, 0, bArr, i, min);
            d(min);
            i4 = min;
        }
        if (i4 == 0) {
            kbhVar = this;
            i4 = kbhVar.c(bArr, i, i2, 0, true);
        } else {
            kbhVar = this;
        }
        if (i4 != -1) {
            kbhVar.w += i4;
        }
        return i4;
    }

    @Override // defpackage.c5p
    public final void readFully(byte[] bArr, int i, int i2) {
        y(bArr, i, i2, false);
    }

    @Override // defpackage.c5p
    public final boolean y(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.z;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.x, 0, bArr, i, min);
            d(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = c(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.w += i4;
        }
        return i4 != -1;
    }

    @Override // defpackage.c5p
    public final int z(int i) {
        kbh kbhVar;
        int min = Math.min(this.z, i);
        d(min);
        if (min == 0) {
            byte[] bArr = this.a;
            kbhVar = this;
            min = kbhVar.c(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            kbhVar = this;
        }
        if (min != -1) {
            kbhVar.w += min;
        }
        return min;
    }
}
