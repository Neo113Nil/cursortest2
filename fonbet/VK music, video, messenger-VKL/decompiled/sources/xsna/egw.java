package xsna;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: ImageBytesExtractionUtils.kt */
/* loaded from: classes3.dex */
public final class egw {
    public static final void a(Image image, int i, byte[] bArr) {
        Image.Plane plane = image.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        int width = image.getWidth();
        int height = image.getHeight();
        byte[] bArr2 = new byte[width * height];
        if (rowStride == width && pixelStride == 1) {
            buffer.position(0);
            buffer.get(bArr2);
        } else if (pixelStride == 1) {
            for (int i2 = 0; i2 < height; i2++) {
                buffer.position(i2 * rowStride);
                buffer.get(bArr2, i2 * width, width);
            }
        } else {
            byte[] bArr3 = new byte[rowStride];
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                buffer.position(i4 * rowStride);
                buffer.get(bArr3, 0, rowStride);
                int i5 = 0;
                while (i5 < width) {
                    bArr2[i3] = bArr3[i5 * pixelStride];
                    i5++;
                    i3++;
                }
            }
        }
        int i6 = i % 360;
        int i7 = i6 + ((((i6 ^ 360) & ((-i6) | i6)) >> 31) & 360);
        if (i7 == 0) {
            jw5.j(bArr2, 0, 0, bArr, 14);
            return;
        }
        if (i7 == 90) {
            for (int i8 = 0; i8 < height; i8++) {
                for (int i9 = 0; i9 < width; i9++) {
                    bArr[((height - i8) - 1) + (i9 * height)] = bArr2[(i8 * width) + i9];
                }
            }
            return;
        }
        if (i7 == 180) {
            for (int i10 = 0; i10 < height; i10++) {
                for (int i11 = 0; i11 < width; i11++) {
                    bArr[((width - i11) - 1) + (((height - i10) - 1) * width)] = bArr2[(i10 * width) + i11];
                }
            }
            return;
        }
        if (i7 != 270) {
            throw new IllegalArgumentException(lhg.a(i, "Unsupported rotation: "));
        }
        for (int i12 = 0; i12 < height; i12++) {
            for (int i13 = 0; i13 < width; i13++) {
                bArr[(((width - i13) - 1) * height) + i12] = bArr2[(i12 * width) + i13];
            }
        }
    }
}
