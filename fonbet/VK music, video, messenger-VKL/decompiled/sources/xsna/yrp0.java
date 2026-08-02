package xsna;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes12.dex */
public final class yrp0 extends androidx.media3.common.audio.c {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long c(long j) {
        return Math.max(0L, j - y2r0.b0(this.b.a, this.j + this.i));
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (!y2r0.M(aVar.c)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? AudioProcessor.a.e : aVar;
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // androidx.media3.common.audio.c
    public final void f() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final void g() {
        this.m = y2r0.b;
    }

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            h(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer h = h(length);
        int j = y2r0.j(length, 0, this.n);
        h.put(this.m, 0, j);
        int j2 = y2r0.j(length - j, 0, i2);
        byteBuffer.limit(byteBuffer.position() + j2);
        h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - j2;
        int i4 = this.n - j;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, j, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        h.flip();
    }
}
