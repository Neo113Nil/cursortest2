package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class pjz0 extends vx4 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void j(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.og3
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.b.c;
        if (i4 == 21) {
            i2 = i((i3 / 3) * 4);
            while (position < limit) {
                j(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), i2);
                position += 3;
            }
        } else if (i4 == 22) {
            i2 = i(i3);
            while (position < limit) {
                j((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), i2);
                position += 4;
            }
        } else if (i4 == 1342177280) {
            i2 = i((i3 / 3) * 4);
            while (position < limit) {
                j(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), i2);
                position += 3;
            }
        } else {
            if (i4 != 1610612736) {
                ny61.k();
                return;
            }
            i2 = i(i3);
            while (position < limit) {
                j((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), i2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        i2.flip();
    }

    @Override // defpackage.vx4
    public final ng3 e(ng3 ng3Var) {
        int i2 = ng3Var.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new ng3(ng3Var.a, ng3Var.b, 4) : ng3.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
    }
}
