package xsna;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public final class y1x implements cc00 {

    @Nullable
    public volatile Bitmap a;

    @Nullable
    public volatile ByteBuffer b;

    @Nullable
    public volatile d201 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public y1x(@NonNull Bitmap bitmap) {
        exc0.i(bitmap);
        this.a = bitmap;
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        b(0);
        this.f = 0;
        this.g = -1;
    }

    public static void b(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        exc0.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    @Nullable
    public final Image.Plane[] a() {
        if (this.c == null) {
            return null;
        }
        return this.c.a.getPlanes();
    }

    public y1x(@NonNull Image image, int i, int i2, int i3) {
        exc0.i(image);
        this.c = new d201(image);
        this.d = i;
        this.e = i2;
        b(i3);
        this.f = i3;
        this.g = 35;
    }

    public y1x(int i, int i2, int i3, @NonNull ByteBuffer byteBuffer) {
        exc0.i(byteBuffer);
        this.b = byteBuffer;
        exc0.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.d = i;
        this.e = i2;
        b(i3);
        this.f = i3;
        this.g = 17;
    }
}
