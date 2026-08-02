package xsna;

import java.nio.ByteBuffer;
import one.video.player.audio.PcmEncoding;

/* compiled from: GainAudioProcessor.kt */
/* loaded from: classes8.dex */
public final class s2t extends n56 {
    public float a;

    /* compiled from: GainAudioProcessor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PcmEncoding.values().length];
            try {
                iArr[PcmEncoding.ENCODING_PCM_8BIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PcmEncoding.ENCODING_PCM_16BIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PcmEncoding.ENCODING_PCM_16BIT_BIG_ENDIAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PcmEncoding.ENCODING_PCM_24BIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PcmEncoding.ENCODING_PCM_32BIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PcmEncoding.ENCODING_PCM_FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.rt4
    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, PcmEncoding pcmEncoding) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        switch (a.$EnumSwitchMapping$0[pcmEncoding.ordinal()]) {
            case 1:
                while (position < limit) {
                    byteBuffer2.put((byte) (byteBuffer.get() * this.a));
                    position++;
                }
                break;
            case 2:
            case 3:
                while (position < limit) {
                    byteBuffer2.putShort((short) (byteBuffer.getShort() * this.a));
                    position += 2;
                }
                break;
            case 4:
                while (position < limit) {
                    int i = (int) ((((byteBuffer.get() + byteBuffer.get()) << (byteBuffer.get() + 8)) << 16) * this.a);
                    byteBuffer2.put((byte) (i & 255));
                    byteBuffer2.put((byte) ((i >> 8) & 255));
                    byteBuffer2.put((byte) ((i >> 16) & 255));
                    position += 3;
                }
                break;
            case 5:
                while (position < limit) {
                    byteBuffer2.putInt((int) (byteBuffer.getInt() * this.a));
                    position += 4;
                }
                break;
            case 6:
                byteBuffer2.putFloat(byteBuffer.getFloat() * this.a);
                break;
        }
    }

    @Override // xsna.rt4
    public final boolean getEnabled() {
        return !(this.a == 1.0f);
    }
}
