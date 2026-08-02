package xsna;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public final class whw {
    @NonNull
    public static ByteBuffer a(@NonNull y1x y1xVar) throws MlKitException {
        int i;
        int i2 = y1xVar.g;
        int i3 = 0;
        if (i2 == -1) {
            Bitmap bitmap = y1xVar.a;
            exc0.i(bitmap);
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
            Bitmap bitmap2 = bitmap;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i4 = width * height;
            int[] iArr = new int[i4];
            bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(height / 2.0d);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i4);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < height) {
                int i8 = i3;
                while (i8 < width) {
                    int i9 = iArr[i7];
                    int i10 = i9 >> 16;
                    int i11 = i9 >> 8;
                    int i12 = i9 & 255;
                    int i13 = i6 + 1;
                    int i14 = i10 & 255;
                    int i15 = i11 & 255;
                    allocateDirect.put(i6, (byte) Math.min(255, (rqi.a(i12, 25, (i15 * 129) + (i14 * 66), 128) >> 8) + 16));
                    if (i5 % 2 == 0 && i7 % 2 == 0) {
                        int i16 = ((((i14 * 112) - (i15 * 94)) - (i12 * 18)) + 128) >> 8;
                        int i17 = (((((i14 * (-38)) - (i15 * 74)) + (i12 * 112)) + 128) >> 8) + 128;
                        int i18 = i4 + 1;
                        allocateDirect.put(i4, (byte) Math.min(255, i16 + 128));
                        i4 += 2;
                        allocateDirect.put(i18, (byte) Math.min(255, i17));
                    }
                    i7++;
                    i8++;
                    i6 = i13;
                }
                i5++;
                i3 = 0;
            }
            return allocateDirect;
        }
        if (i2 == 17) {
            ByteBuffer byteBuffer = y1xVar.b;
            exc0.i(byteBuffer);
            return byteBuffer;
        }
        if (i2 != 35) {
            if (i2 != 842094169) {
                throw new MlKitException("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = y1xVar.b;
            exc0.i(byteBuffer2);
            byteBuffer2.rewind();
            int limit = byteBuffer2.limit();
            int i19 = limit / 6;
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(limit);
            int i20 = 0;
            while (true) {
                i = i19 * 4;
                if (i20 >= i) {
                    break;
                }
                allocateDirect2.put(i20, byteBuffer2.get(i20));
                i20++;
            }
            while (i3 < i19 + i19) {
                allocateDirect2.put(i + i3, byteBuffer2.get((i3 / 2) + ((i3 % 2) * i19) + i));
                i3++;
            }
            return allocateDirect2;
        }
        Image.Plane[] a = y1xVar.a();
        exc0.i(a);
        int i21 = y1xVar.d;
        int i22 = y1xVar.e;
        int i23 = i21 * i22;
        int i24 = i23 / 4;
        byte[] bArr = new byte[i24 + i24 + i23];
        ByteBuffer buffer = a[1].getBuffer();
        ByteBuffer buffer2 = a[2].getBuffer();
        int position = buffer2.position();
        int limit2 = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit2 - 1);
        int i25 = (i23 + i23) / 4;
        boolean z = buffer2.remaining() == i25 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit2);
        if (z) {
            a[0].getBuffer().get(bArr, 0, i23);
            ByteBuffer buffer3 = a[1].getBuffer();
            a[2].getBuffer().get(bArr, i23, 1);
            buffer3.get(bArr, i23 + 1, i25 - 1);
        } else {
            b(a[0], i21, i22, bArr, 0, 1);
            b(a[1], i21, i22, bArr, i23 + 1, 2);
            b(a[2], i21, i22, bArr, i23, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    public static final void b(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int i6 = 0;
        for (int i7 = 0; i7 < rowStride; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }
}
