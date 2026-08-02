package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes12.dex */
public final class h1b extends androidx.media3.common.audio.c {

    @Nullable
    public int[] i;

    @Nullable
    public int[] j;

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.a.e;
        }
        int i2 = aVar.b;
        if (!y2r0.M(i)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new AudioProcessor.a(aVar.a, iArr.length, i) : AudioProcessor.a.e;
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        this.j = this.i;
    }

    @Override // androidx.media3.common.audio.c
    public final void g() {
        this.j = null;
        this.i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h = h(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                int u = (y2r0.u(this.b.c) * i) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 == 3) {
                        h.put(byteBuffer.get(u));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                                        }
                                    }
                                }
                            }
                            h.putInt(byteBuffer.getInt(u));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? u : u + 2);
                        byte b2 = byteBuffer.get(u + 1);
                        if (byteBuffer.order() == byteOrder) {
                            u += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << AmfConstants.TYPE_TYPED_OBJECT_MARKER) & 16711680)) | ((byteBuffer.get(u) << 8) & 65280)) >> 8;
                        fxc0.o(Integer.toHexString(i3), "Value out of range of 24-bit integer: %s", (i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608);
                        fxc0.p(h.remaining() >= 3);
                        h.put((byte) (h.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (h.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        h.putFloat(byteBuffer.getFloat(u));
                    }
                }
                h.putShort(byteBuffer.getShort(u));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        h.flip();
    }
}
