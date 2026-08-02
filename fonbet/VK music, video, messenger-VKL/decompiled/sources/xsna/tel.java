package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes12.dex */
public final class tel implements qgq {
    public final suk b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        nr10.a("media3.extractor");
    }

    public tel(suk sukVar, long j, long j2) {
        this.b = sukVar;
        this.d = j;
        this.c = j2;
    }

    @Override // xsna.qgq
    public final int a(int i, int i2, byte[] bArr) throws IOException {
        tel telVar;
        int min;
        c(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            telVar = this;
            min = telVar.d(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            telVar.g += min;
        } else {
            telVar = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(telVar.e, telVar.f, bArr, i, min);
        telVar.f += min;
        return min;
    }

    @Override // xsna.qgq
    public final void advancePeekPosition(int i) throws IOException {
        b(i, false);
    }

    public final boolean b(int i, boolean z) throws IOException {
        c(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = d(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, y2r0.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int d(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
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
        throw new EOFException();
    }

    public final void e(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // xsna.qgq
    public final long getLength() {
        return this.c;
    }

    @Override // xsna.qgq
    public final long getPeekPosition() {
        return this.d + this.f;
    }

    @Override // xsna.qgq
    public final long getPosition() {
        return this.d;
    }

    @Override // xsna.qgq
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        tel telVar;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            e(min);
            i4 = min;
        }
        if (i4 == 0) {
            telVar = this;
            i4 = telVar.d(bArr, i, i2, 0, true);
        } else {
            telVar = this;
        }
        if (i4 != -1) {
            telVar.d += i4;
        }
        return i4;
    }

    @Override // xsna.qgq
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        readFully(bArr, i, i2, false);
    }

    @Override // xsna.qgq
    public final void resetPeekPosition() {
        this.f = 0;
    }

    @Override // xsna.qgq
    public final int skip(int i) throws IOException {
        tel telVar;
        int min = Math.min(this.g, i);
        e(min);
        if (min == 0) {
            byte[] bArr = this.a;
            telVar = this;
            min = telVar.d(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            telVar = this;
        }
        if (min != -1) {
            telVar.d += min;
        }
        return min;
    }

    @Override // xsna.qgq
    public final void skipFully(int i) throws IOException {
        skipFully(i, false);
    }

    @Override // xsna.qgq
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            e(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = d(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4 != -1;
    }

    @Override // xsna.qgq
    public final boolean skipFully(int i, boolean z) throws IOException {
        int min = Math.min(this.g, i);
        e(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = d(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        return i2 != -1;
    }

    @Override // xsna.qgq
    public final void peekFully(byte[] bArr, int i, int i2) throws IOException {
        peekFully(bArr, i, i2, false);
    }
}
