package xsna;

/* compiled from: RtmpPublisherChunkStreamInfo.java */
/* loaded from: classes3.dex */
public final class rqg0 {
    public final byte e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;
    public int f = 0;

    public rqg0(byte b) {
        this.e = b;
    }

    public final int a(int i, int i2, byte[] bArr) {
        if (this.d == -1) {
            this.d = 0;
            this.b = i2;
            this.a = i2;
            this.c = i;
        } else {
            int i3 = this.a;
            if (i2 < i3) {
                this.d = 0;
                this.b = i2;
                this.a = i2;
                this.c = i;
            } else if (this.c != i) {
                this.d = 1;
                this.b = i2 - i3;
                this.a = i2;
                this.c = i;
            } else {
                int i4 = i2 - i3;
                if (i4 == this.b) {
                    this.d = 3;
                    this.a = i2;
                } else {
                    this.d = 2;
                    this.b = i4;
                    this.a = i2;
                }
            }
        }
        byte b = this.e;
        int i5 = b == 8 ? 6 : b == 9 ? 5 : b == 18 ? 4 : 0;
        int i6 = this.d;
        bArr[0] = (byte) (i5 | (i6 << 6));
        if (i6 == 0) {
            int i7 = this.a;
            if (i7 >= 16777215) {
                hqg0.h(1, 16777215, bArr);
            } else {
                hqg0.h(1, i7, bArr);
            }
            hqg0.h(4, this.c, bArr);
            bArr[7] = b;
            int i8 = this.f;
            bArr[8] = (byte) i8;
            bArr[9] = (byte) (i8 >> 8);
            bArr[10] = (byte) (i8 >> 16);
            bArr[11] = (byte) (i8 >> 24);
            int i9 = this.a;
            if (i9 < 16777215) {
                return 12;
            }
            hqg0.i(12, i9, bArr);
            return 16;
        }
        if (i6 == 1) {
            int i10 = this.b;
            if (i10 >= 16777215) {
                hqg0.h(1, 16777215, bArr);
            } else {
                hqg0.h(1, i10, bArr);
            }
            hqg0.h(4, this.c, bArr);
            bArr[7] = b;
            int i11 = this.b;
            if (i11 < 16777215) {
                return 8;
            }
            hqg0.i(8, i11, bArr);
            return 12;
        }
        if (i6 != 2) {
            if (this.b < 16777215) {
                return 1;
            }
            hqg0.i(4, this.a, bArr);
            return 5;
        }
        int i12 = this.b;
        if (i12 >= 16777215) {
            hqg0.h(1, 16777215, bArr);
        } else {
            hqg0.h(1, i12, bArr);
        }
        if (this.b < 16777215) {
            return 4;
        }
        hqg0.i(4, this.a, bArr);
        return 8;
    }
}
