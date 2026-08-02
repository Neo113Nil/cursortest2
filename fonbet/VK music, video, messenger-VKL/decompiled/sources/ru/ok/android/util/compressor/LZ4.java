package ru.ok.android.util.compressor;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class LZ4 {
    public static int compress(byte[] bArr, byte[] bArr2, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        try {
            allocateDirect.put(bArr, 0, bArr.length);
            int nativeCompress = nativeCompress(allocateDirect, 0, allocateDirect.limit(), allocateDirect2, 0, allocateDirect2.limit(), i);
            if (nativeCompress > 0 && nativeCompress <= bArr2.length && nativeCompress <= allocateDirect2.capacity()) {
                allocateDirect2.get(bArr2, 0, nativeCompress);
            }
            return nativeCompress;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int decompress(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        try {
            allocateDirect.put(bArr, 0, bArr.length);
            int nativeDecompress = nativeDecompress(allocateDirect, 0, allocateDirect.capacity(), allocateDirect2, 0, allocateDirect2.capacity());
            if (nativeDecompress > 0 && nativeDecompress <= bArr2.length && nativeDecompress <= allocateDirect2.limit()) {
                allocateDirect2.get(bArr2, 0, nativeDecompress);
            }
            return nativeDecompress;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int decompressPartial(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        try {
            allocateDirect.put(bArr, 0, bArr.length);
            int nativeDecompressPartial = nativeDecompressPartial(allocateDirect, 0, allocateDirect.capacity(), allocateDirect2, 0, allocateDirect2.capacity());
            if (nativeDecompressPartial > 0 && nativeDecompressPartial <= bArr2.length && nativeDecompressPartial <= allocateDirect2.limit()) {
                allocateDirect2.get(bArr2, 0, nativeDecompressPartial);
            }
            return nativeDecompressPartial;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static native int nativeCompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    private static native int nativeDecompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native int nativeDecompressPartial(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);
}
