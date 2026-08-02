package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: EncoderImpl.java */
/* loaded from: classes8.dex */
public final class kqy0 {
    public static final Charset b = Charset.forName(C.ASCII_NAME);
    public final pqy0 a = new pqy0();

    public kqy0() {
        new oqy0();
        new ArrayList();
    }

    public static void a(int i, byte b2, int i2, ByteBuffer byteBuffer) {
        int pow = (int) (Math.pow(2.0d, i) - 1.0d);
        if (i2 < pow) {
            byteBuffer.put((byte) (b2 | i2));
            return;
        }
        byteBuffer.put((byte) (b2 | pow));
        int i3 = i2 - pow;
        while (i3 > 128) {
            byteBuffer.put((byte) (128 | (i3 % 128)));
            i3 /= 128;
        }
        byteBuffer.put((byte) i3);
    }
}
