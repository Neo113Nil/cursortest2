package xsna;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes12.dex */
public final class omj0 extends androidx.media3.common.audio.c {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public omj0() {
        byte[] bArr = y2r0.b;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.c == 2) {
            return aVar.a == -1 ? AudioProcessor.a.e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        if (isActive()) {
            int i = this.b.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * r0.a) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // androidx.media3.common.audio.c
    public final void f() {
        if (this.u > 0) {
            j(true);
            this.r = 0;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final void g() {
        this.o = false;
        byte[] bArr = y2r0.b;
        this.s = bArr;
        this.v = bArr;
    }

    public final int i(int i) {
        int length = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        fxc0.z(length >= 0);
        int min = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (min / i2) * i2;
    }

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    public final void j(boolean z) {
        int length;
        int i;
        int i2 = this.u;
        byte[] bArr = this.s;
        if (i2 == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    k(i2, 3);
                    length = i2;
                } else {
                    fxc0.z(i2 >= bArr.length / 2);
                    length = this.s.length / 2;
                    k(length, 0);
                }
                i = length;
            } else if (z) {
                int length2 = i2 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int i3 = i(length2) + (this.s.length / 2);
                k(i3, 2);
                i = i3;
                length = length3;
            } else {
                length = i2 - (bArr.length / 2);
                i = i(length);
                k(i, 1);
            }
            fxc0.x(length, "bytesConsumed is not aligned to frame size: %s", length % this.n == 0);
            fxc0.z(i2 >= i);
            this.u -= length;
            int i4 = this.t + length;
            this.t = i4;
            this.t = i4 % this.s.length;
            this.r = (i / this.n) + this.r;
            this.q += (length - i) / r2;
        }
    }

    public final void k(int i, int i2) {
        if (i == 0) {
            return;
        }
        fxc0.p(this.u >= i);
        if (i2 == 2) {
            int i3 = this.t;
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.v, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = this.t;
            int i8 = i7 + i;
            byte[] bArr2 = this.s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i - length2);
            }
        }
        fxc0.l(i, "sizeToOutput is not aligned to frame size: %s", i % this.n == 0);
        fxc0.z(this.t < this.s.length);
        byte[] bArr3 = this.v;
        fxc0.l(i, "byteOutput size is not aligned to frame size %s", i % this.n == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.k;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = Byte.MAX_VALUE;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = Byte.MIN_VALUE;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        h(i).put(bArr3, 0, i).flip();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i2 = this.n;
                        position = fb20.a(limit3, i2, i2, i2);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    h(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                fxc0.z(this.t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i3 = this.n;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.t;
                int i5 = this.u;
                int i6 = i4 + i5;
                byte[] bArr = this.s;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i6, min);
                int i8 = this.u + min;
                this.u = i8;
                fxc0.z(i8 <= this.s.length);
                boolean z2 = z && position3 < i7;
                j(z2);
                if (z2) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }
}
