package defpackage;

import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes7.dex */
public final class lhc0 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final byte[] f;

    public lhc0(byte[] bArr, int i, int i2, int i3, int i4) {
        this.b = i3;
        this.c = i4;
        if (i3 > i || i4 > i2) {
            ny61.g("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.f = bArr;
        this.d = i;
        this.e = i2;
    }

    public byte[] a() {
        byte[] bArr = this.f;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        if (i == i3 && i2 == this.e) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        if (i == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    public byte[] b(int i, byte[] bArr) {
        if (i < 0 || i >= this.c) {
            ny61.g(oyr.i(i, "Requested row is outside the image: "));
            return null;
        }
        int length = bArr.length;
        int i2 = this.b;
        if (length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.f, i * this.d, bArr, 0, i2);
        return bArr;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                byte[] bArr = new byte[i];
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i + 1) * i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr = b(i3, bArr);
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = bArr[i4] & 255;
                        sb.append(i5 < 64 ? '#' : i5 < 128 ? '+' : i5 < 192 ? '.' : HexString.CHAR_SPACE);
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public lhc0(int i, int i2, int i3, int i4, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bArr;
    }

    public lhc0(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }
}
