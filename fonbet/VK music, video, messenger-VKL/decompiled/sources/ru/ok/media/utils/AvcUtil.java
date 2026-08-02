package ru.ok.media.utils;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class AvcUtil {
    public static void startCodesToMP4(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position() + byteBuffer.arrayOffset();
        int remaining = byteBuffer.remaining() + position;
        while (remaining - position > 4) {
            int i = position + 4;
            int i2 = -1;
            while (true) {
                if (i >= remaining) {
                    break;
                }
                i2 = (i2 << 8) | (array[i] & 255);
                if (i2 == 1) {
                    i -= 3;
                    break;
                }
                i++;
            }
            int i3 = (i - 4) - position;
            array[position] = (byte) ((i3 >>> 24) & 255);
            array[position + 1] = (byte) ((i3 >>> 16) & 255);
            array[position + 2] = (byte) ((i3 >>> 8) & 255);
            array[position + 3] = (byte) (i3 & 255);
            position = i;
        }
    }

    private static native void startCodesToMP4(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3);

    public static void startCodesToMP4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.remaining() >= byteBuffer.remaining()) {
            startCodesToMP4(byteBuffer, byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer.remaining());
            return;
        }
        throw new IllegalArgumentException("dest buffer too small");
    }
}
