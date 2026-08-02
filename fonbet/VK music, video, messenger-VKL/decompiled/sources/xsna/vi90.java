package xsna;

/* compiled from: ParsableBitArray.java */
/* loaded from: classes8.dex */
public final class vi90 {
    public final byte[] a;
    public int b;
    public int c;

    public vi90(byte[] bArr) {
        this.a = bArr;
    }

    public final int a(int i) {
        int i2;
        long j = 0;
        if (i != 0) {
            while (i >= 8) {
                i -= 8;
                int i3 = this.c;
                byte[] bArr = this.a;
                if (i3 != 0) {
                    int i4 = this.b;
                    i2 = ((bArr[i4 + 1] & 255) >>> (8 - i3)) | ((bArr[i4] & 255) << i3);
                } else {
                    i2 = bArr[this.b];
                }
                this.b++;
                j |= (255 & i2) << i;
            }
            if (i > 0) {
                int i5 = this.c + i;
                byte b = (byte) (255 >> (8 - i));
                if (i5 > 8) {
                    int i6 = this.b;
                    byte[] bArr2 = this.a;
                    j |= b & (((255 & bArr2[i6 + 1]) >> (16 - i5)) | ((bArr2[i6] & 255) << (i5 - 8)));
                    this.b = i6 + 1;
                } else {
                    int i7 = this.b;
                    j |= b & ((255 & this.a[i7]) >> (8 - i5));
                    if (i5 == 8) {
                        this.b = i7 + 1;
                    }
                }
                this.c = i5 % 8;
            }
        }
        return (int) j;
    }

    public final int b() {
        int i = 0;
        while (a(1) != 1) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final int c() {
        int b = b();
        return ((b + 1) / 2) * (b % 2 == 0 ? -1 : 1);
    }

    public final void d(int i) {
        int i2 = (i / 8) + this.b;
        this.b = i2;
        int i3 = (i % 8) + this.c;
        this.c = i3;
        if (i3 > 7) {
            this.b = i2 + 1;
            this.c = i3 - 8;
        }
    }
}
