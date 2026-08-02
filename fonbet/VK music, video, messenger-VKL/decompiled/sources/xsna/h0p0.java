package xsna;

import androidx.media3.common.audio.AudioProcessor;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: ToFloatPcmAudioProcessor.java */
/* loaded from: classes12.dex */
public final class h0p0 extends androidx.media3.common.audio.c {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void i(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = aVar.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 2) {
            return i2 != 4 ? new AudioProcessor.a(aVar.a, aVar.b, 4) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer h;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 2) {
            h = h(i2 * 2);
            while (position < limit) {
                i(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), h);
                position += 2;
            }
        } else if (i3 == 1342177280) {
            h = h((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h);
                position += 3;
            }
        } else if (i3 == 1610612736) {
            h = h(i2);
            while (position < limit) {
                i((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h);
                position += 4;
            }
        } else if (i3 == 21) {
            h = h((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), h);
                position += 3;
            }
        } else {
            if (i3 != 22) {
                throw new IllegalStateException();
            }
            h = h(i2);
            while (position < limit) {
                i((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), h);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        h.flip();
    }
}
