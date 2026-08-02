package okio;

import java.security.MessageDigest;
import xsna.e;
import xsna.efz;
import xsna.ji;
import xsna.jw5;
import xsna.m4i0;
import xsna.tgw;
import xsna.vl8;
import xsna.x1o0;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes8.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] e;
    public final transient int[] f;

    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.d.m());
        this.e = bArr;
        this.f = iArr;
    }

    private final Object writeReplace() {
        return C();
    }

    @Override // okio.ByteString
    public final void B(vl8 vl8Var, int i) {
        int p = x1o0.p(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = p == 0 ? 0 : iArr[p - 1];
            int i4 = iArr[p] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + p];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            m4i0 m4i0Var = new m4i0(bArr[p], i6, i6 + min, true, false);
            m4i0 m4i0Var2 = vl8Var.b;
            if (m4i0Var2 == null) {
                m4i0Var.g = m4i0Var;
                m4i0Var.f = m4i0Var;
                vl8Var.b = m4i0Var;
            } else {
                m4i0Var2.g.b(m4i0Var);
            }
            i2 += min;
            p++;
        }
        vl8Var.c += i;
    }

    public final ByteString C() {
        return new ByteString(z());
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.n() == n() && v(0, byteString, n())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final String h() {
        return C().h();
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // okio.ByteString
    public final String i() {
        return C().i();
    }

    @Override // okio.ByteString
    public final void k(int i, int i2, int i3, byte[] bArr) {
        long j = i3;
        e.b(n(), i, j);
        e.b(bArr.length, i2, j);
        int i4 = i3 + i;
        int p = x1o0.p(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = p == 0 ? 0 : iArr[p - 1];
            int i6 = iArr[p] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + p];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            jw5.f(bArr2[p], i2, i8, bArr, i8 + min);
            i2 += min;
            i += min;
            p++;
        }
    }

    @Override // okio.ByteString
    public final ByteString l(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(messageDigest.digest());
    }

    @Override // okio.ByteString
    public final int n() {
        return this.f[this.e.length - 1];
    }

    @Override // okio.ByteString
    public final String o() {
        return C().o();
    }

    @Override // okio.ByteString
    public final int p(int i, byte[] bArr) {
        return C().p(i, bArr);
    }

    @Override // okio.ByteString
    public final byte[] r() {
        return z();
    }

    @Override // okio.ByteString
    public final byte s(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        e.b(iArr[length], i, 1L);
        int p = x1o0.p(this, i);
        return bArr[p][(i - (p == 0 ? 0 : iArr[p - 1])) + iArr[bArr.length + p]];
    }

    @Override // okio.ByteString
    public final int t(int i, byte[] bArr) {
        return C().t(i, bArr);
    }

    @Override // okio.ByteString
    public final String toString() {
        return C().toString();
    }

    @Override // okio.ByteString
    public final boolean u(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > n() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int p = x1o0.p(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = p == 0 ? 0 : iArr[p - 1];
            int i6 = iArr[p] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + p];
            int min = Math.min(i4, i6 + i5) - i;
            if (!e.a(bArr2[p], (i - i5) + i7, i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            p++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean v(int i, ByteString byteString, int i2) {
        if (i >= 0 && i <= n() - i2) {
            int i3 = i2 + i;
            int p = x1o0.p(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = p == 0 ? 0 : iArr[p - 1];
                int i6 = iArr[p] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + p];
                int min = Math.min(i3, i6 + i5) - i;
                if (byteString.u(i4, (i - i5) + i7, min, bArr[p])) {
                    i4 += min;
                    i += min;
                    p++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public final ByteString w(int i, int i2) {
        if (i2 == e.b) {
            i2 = n();
        }
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > n()) {
            StringBuilder b = ji.b(i2, "endIndex=", " > length(");
            b.append(n());
            b.append(')');
            throw new IllegalArgumentException(b.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(efz.a(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == n()) {
            return this;
        }
        if (i == i2) {
            return ByteString.d;
        }
        int p = x1o0.p(this, i);
        int p2 = x1o0.p(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) jw5.m(p, p2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (p <= p2) {
            int i4 = p;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == p2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = p != 0 ? iArr2[p - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final ByteString y() {
        return C().y();
    }

    @Override // okio.ByteString
    public final byte[] z() {
        byte[] bArr = new byte[n()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            jw5.f(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
