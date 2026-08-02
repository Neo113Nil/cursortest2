package ru.ok.tensorflow.tflite;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class TFImageWithMaskData {
    public final byte[] backedBuffer;
    public final ByteBuffer buffer;
    public final int height;
    public final int[] imageIntValues;
    public final boolean isQuantized;
    public final int[] maskIntValues;
    public final int width;
    private boolean zeroMean;

    public TFImageWithMaskData(int i, int i2, boolean z, boolean z2) {
        this.height = i;
        this.width = i2;
        this.isQuantized = z;
        this.zeroMean = z2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4 * (z ? 1 : 4));
        this.buffer = allocateDirect;
        this.backedBuffer = allocateDirect.array();
        allocateDirect.order(ByteOrder.nativeOrder());
        int i3 = i * i2;
        this.imageIntValues = new int[i3];
        this.maskIntValues = new int[i3];
    }

    public void fromBitmap(Bitmap bitmap, ByteBuffer byteBuffer) {
        if (bitmap == null) {
            return;
        }
        bitmap.getPixels(this.imageIntValues, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.buffer.rewind();
        int i = 0;
        if (this.isQuantized) {
            byte[] array = byteBuffer.array();
            while (true) {
                int[] iArr = this.imageIntValues;
                if (i >= iArr.length) {
                    return;
                }
                int i2 = iArr[i];
                this.buffer.put((byte) ((i2 >> 16) & 255));
                this.buffer.put((byte) ((i2 >> 8) & 255));
                this.buffer.put((byte) (i2 & 255));
                this.buffer.put(array[i]);
                i++;
            }
        } else {
            int arrayOffset = this.buffer.arrayOffset();
            byte[] array2 = byteBuffer.array();
            int arrayOffset2 = byteBuffer.arrayOffset();
            if (this.zeroMean) {
                while (true) {
                    int[] iArr2 = this.imageIntValues;
                    if (i >= iArr2.length) {
                        return;
                    }
                    int i3 = iArr2[i];
                    int floatToIntBits = Float.floatToIntBits((((i3 >> 16) & 255) / 127.5f) - 1.0f);
                    byte[] bArr = this.backedBuffer;
                    bArr[arrayOffset] = (byte) (floatToIntBits & 255);
                    bArr[arrayOffset + 1] = (byte) ((floatToIntBits >> 8) & 255);
                    bArr[arrayOffset + 2] = (byte) ((floatToIntBits >> 16) & 255);
                    bArr[arrayOffset + 3] = (byte) ((floatToIntBits >> 24) & 255);
                    int floatToIntBits2 = Float.floatToIntBits((((i3 >> 8) & 255) / 127.5f) - 1.0f);
                    byte[] bArr2 = this.backedBuffer;
                    bArr2[arrayOffset + 4] = (byte) (floatToIntBits2 & 255);
                    bArr2[arrayOffset + 5] = (byte) ((floatToIntBits2 >> 8) & 255);
                    bArr2[arrayOffset + 6] = (byte) ((floatToIntBits2 >> 16) & 255);
                    bArr2[arrayOffset + 7] = (byte) ((floatToIntBits2 >> 24) & 255);
                    int floatToIntBits3 = Float.floatToIntBits(((i3 & 255) / 127.5f) - 1.0f);
                    byte[] bArr3 = this.backedBuffer;
                    bArr3[arrayOffset + 8] = (byte) (floatToIntBits3 & 255);
                    bArr3[arrayOffset + 9] = (byte) ((floatToIntBits3 >> 8) & 255);
                    bArr3[arrayOffset + 10] = (byte) ((floatToIntBits3 >> 16) & 255);
                    bArr3[arrayOffset + 11] = (byte) ((floatToIntBits3 >> 24) & 255);
                    int i4 = (i * 4) + arrayOffset2;
                    bArr3[arrayOffset + 12] = array2[i4];
                    bArr3[arrayOffset + 13] = array2[i4 + 1];
                    int i5 = arrayOffset + 15;
                    bArr3[arrayOffset + 14] = array2[i4 + 2];
                    arrayOffset += 16;
                    bArr3[i5] = array2[i4 + 3];
                    i++;
                }
            } else {
                while (true) {
                    int[] iArr3 = this.imageIntValues;
                    if (i >= iArr3.length) {
                        return;
                    }
                    int i6 = iArr3[i];
                    int floatToIntBits4 = Float.floatToIntBits(((i6 >> 16) & 255) / 255.0f);
                    byte[] bArr4 = this.backedBuffer;
                    bArr4[arrayOffset] = (byte) (floatToIntBits4 & 255);
                    bArr4[arrayOffset + 1] = (byte) ((floatToIntBits4 >> 8) & 255);
                    bArr4[arrayOffset + 2] = (byte) ((floatToIntBits4 >> 16) & 255);
                    bArr4[arrayOffset + 3] = (byte) ((floatToIntBits4 >> 24) & 255);
                    int floatToIntBits5 = Float.floatToIntBits(((i6 >> 8) & 255) / 255.0f);
                    byte[] bArr5 = this.backedBuffer;
                    bArr5[arrayOffset + 4] = (byte) (floatToIntBits5 & 255);
                    bArr5[arrayOffset + 5] = (byte) ((floatToIntBits5 >> 8) & 255);
                    bArr5[arrayOffset + 6] = (byte) ((floatToIntBits5 >> 16) & 255);
                    bArr5[arrayOffset + 7] = (byte) ((floatToIntBits5 >> 24) & 255);
                    int floatToIntBits6 = Float.floatToIntBits((i6 & 255) / 255.0f);
                    byte[] bArr6 = this.backedBuffer;
                    bArr6[arrayOffset + 8] = (byte) (floatToIntBits6 & 255);
                    bArr6[arrayOffset + 9] = (byte) ((floatToIntBits6 >> 8) & 255);
                    bArr6[arrayOffset + 10] = (byte) ((floatToIntBits6 >> 16) & 255);
                    bArr6[arrayOffset + 11] = (byte) ((floatToIntBits6 >> 24) & 255);
                    int i7 = (i * 4) + arrayOffset2;
                    bArr6[arrayOffset + 12] = array2[i7];
                    bArr6[arrayOffset + 13] = array2[i7 + 1];
                    int i8 = arrayOffset + 15;
                    bArr6[arrayOffset + 14] = array2[i7 + 2];
                    arrayOffset += 16;
                    bArr6[i8] = array2[i7 + 3];
                    i++;
                }
            }
        }
    }
}
