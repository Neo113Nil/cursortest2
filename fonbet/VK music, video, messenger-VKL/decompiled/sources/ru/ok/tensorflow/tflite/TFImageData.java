package ru.ok.tensorflow.tflite;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes9.dex */
public class TFImageData {
    public final byte[] backedBuffer;
    public final ByteBuffer buffer;
    public final int height;
    public final int[] intValues;
    public final boolean isQuantized;
    private final int startingPos;
    public final int width;
    private boolean zeroMean;

    public TFImageData(int i, int i2, boolean z, boolean z2) {
        this.height = i;
        this.width = i2;
        this.isQuantized = z;
        this.zeroMean = z2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 3 * (z ? 1 : 4));
        this.buffer = allocateDirect;
        this.backedBuffer = allocateDirect.array();
        this.startingPos = allocateDirect.arrayOffset();
        allocateDirect.order(ByteOrder.nativeOrder());
        this.intValues = new int[i * i2];
    }

    public void fromBitmap(Bitmap bitmap) {
        bitmap.getPixels(this.intValues, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.buffer.rewind();
        int i = this.startingPos;
        int i2 = 0;
        if (this.isQuantized) {
            int[] iArr = this.intValues;
            int length = iArr.length;
            while (i2 < length) {
                int i3 = iArr[i2];
                byte[] bArr = this.backedBuffer;
                bArr[i] = (byte) ((i3 >> 16) & 255);
                int i4 = i + 2;
                bArr[i + 1] = (byte) ((i3 >> 8) & 255);
                i += 3;
                bArr[i4] = (byte) (i3 & 255);
                i2++;
            }
            return;
        }
        if (this.zeroMean) {
            int[] iArr2 = this.intValues;
            int length2 = iArr2.length;
            while (i2 < length2) {
                int i5 = iArr2[i2];
                int floatToIntBits = Float.floatToIntBits((((i5 >> 16) & 255) / 127.5f) - 1.0f);
                byte[] bArr2 = this.backedBuffer;
                bArr2[i] = (byte) (floatToIntBits & 255);
                bArr2[i + 1] = (byte) ((floatToIntBits >> 8) & 255);
                bArr2[i + 2] = (byte) ((floatToIntBits >> 16) & 255);
                bArr2[i + 3] = (byte) ((floatToIntBits >> 24) & 255);
                int floatToIntBits2 = Float.floatToIntBits((((i5 >> 8) & 255) / 127.5f) - 1.0f);
                byte[] bArr3 = this.backedBuffer;
                bArr3[i + 4] = (byte) (floatToIntBits2 & 255);
                bArr3[i + 5] = (byte) ((floatToIntBits2 >> 8) & 255);
                bArr3[i + 6] = (byte) ((floatToIntBits2 >> 16) & 255);
                bArr3[i + 7] = (byte) ((floatToIntBits2 >> 24) & 255);
                int floatToIntBits3 = Float.floatToIntBits(((i5 & 255) / 127.5f) - 1.0f);
                byte[] bArr4 = this.backedBuffer;
                bArr4[i + 8] = (byte) (floatToIntBits3 & 255);
                bArr4[i + 9] = (byte) ((floatToIntBits3 >> 8) & 255);
                int i6 = i + 11;
                bArr4[i + 10] = (byte) ((floatToIntBits3 >> 16) & 255);
                i += 12;
                bArr4[i6] = (byte) ((floatToIntBits3 >> 24) & 255);
                i2++;
            }
            return;
        }
        int[] iArr3 = this.intValues;
        int length3 = iArr3.length;
        while (i2 < length3) {
            int i7 = iArr3[i2];
            int floatToIntBits4 = Float.floatToIntBits(((i7 >> 16) & 255) / 255.0f);
            byte[] bArr5 = this.backedBuffer;
            bArr5[i] = (byte) (floatToIntBits4 & 255);
            bArr5[i + 1] = (byte) ((floatToIntBits4 >> 8) & 255);
            bArr5[i + 2] = (byte) ((floatToIntBits4 >> 16) & 255);
            bArr5[i + 3] = (byte) ((floatToIntBits4 >> 24) & 255);
            int floatToIntBits5 = Float.floatToIntBits(((i7 >> 8) & 255) / 255.0f);
            byte[] bArr6 = this.backedBuffer;
            bArr6[i + 4] = (byte) (floatToIntBits5 & 255);
            bArr6[i + 5] = (byte) ((floatToIntBits5 >> 8) & 255);
            bArr6[i + 6] = (byte) ((floatToIntBits5 >> 16) & 255);
            bArr6[i + 7] = (byte) ((floatToIntBits5 >> 24) & 255);
            int floatToIntBits6 = Float.floatToIntBits((i7 & 255) / 255.0f);
            byte[] bArr7 = this.backedBuffer;
            bArr7[i + 8] = (byte) (floatToIntBits6 & 255);
            bArr7[i + 9] = (byte) ((floatToIntBits6 >> 8) & 255);
            int i8 = i + 11;
            bArr7[i + 10] = (byte) ((floatToIntBits6 >> 16) & 255);
            i += 12;
            bArr7[i8] = (byte) ((floatToIntBits6 >> 24) & 255);
            i2++;
        }
    }
}
