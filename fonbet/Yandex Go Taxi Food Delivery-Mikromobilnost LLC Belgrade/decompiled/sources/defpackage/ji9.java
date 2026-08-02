package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ji9 extends vx4 {
    public int[] i;
    public int[] j;

    @Override // defpackage.og3
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = i(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr) {
                int t = (tw21.t(this.b.c) * i2) + position;
                int i3 = this.b.c;
                if (i3 == 2) {
                    i.putShort(byteBuffer.getShort(t));
                } else {
                    if (i3 != 4) {
                        w511.d(this.b.c, "Unexpected encoding: ");
                        return;
                    }
                    i.putFloat(byteBuffer.getFloat(t));
                }
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    @Override // defpackage.vx4
    public final ng3 e(ng3 ng3Var) {
        int i = ng3Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return ng3.e;
        }
        int i2 = ng3Var.b;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", ng3Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new ng3(ng3Var.a, iArr.length, i) : ng3.e;
    }

    @Override // defpackage.vx4
    public final void f() {
        this.j = this.i;
    }

    @Override // defpackage.vx4
    public final void h() {
        this.j = null;
        this.i = null;
    }
}
