package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class if11 extends vx4 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = tw21.c;
    public int n;
    public long o;

    @Override // defpackage.og3
    public final void a(ByteBuffer byteBuffer) {
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
        ByteBuffer i3 = i(length);
        int i4 = tw21.i(length, 0, this.n);
        i3.put(this.m, 0, i4);
        int i5 = tw21.i(length - i4, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i5);
        i3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i2 - i5;
        int i7 = this.n - i4;
        this.n = i7;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i4, bArr, 0, i7);
        byteBuffer.get(this.m, this.n, i6);
        this.n += i6;
        i3.flip();
    }

    @Override // defpackage.vx4, defpackage.og3
    public final ByteBuffer c() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            i(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // defpackage.vx4
    public final ng3 e(ng3 ng3Var) {
        int i = ng3Var.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? ng3.e : ng3Var;
    }

    @Override // defpackage.vx4
    public final void f() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.vx4
    public final void g() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.vx4
    public final void h() {
        this.m = tw21.c;
    }

    @Override // defpackage.vx4, defpackage.og3
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }
}
