package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class kpf extends b3 implements q3 {
    public static final p1 b = new p1(0, kpf.class);
    public final char[] a;

    public kpf(byte[] bArr) {
        if (bArr == null) {
            ny61.t("'string' cannot be null");
            throw null;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            ny61.g("malformed BMPString encoding encountered");
            throw null;
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.a = cArr;
    }

    @Override // defpackage.q3
    public final String f() {
        return new String(this.a);
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        char[] cArr = this.a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof kpf) {
            return Arrays.equals(this.a, ((kpf) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        char[] cArr = this.a;
        int length = cArr.length;
        ryhVar.M(30, z);
        ryhVar.G(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            ryhVar.F(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            ryhVar.F(bArr, 0, i3);
        }
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length * 2, z);
    }

    public final String toString() {
        return f();
    }

    public kpf(char[] cArr) {
        this.a = cArr;
    }
}
