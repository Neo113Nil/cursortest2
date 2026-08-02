package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes12.dex */
public final class ob7 implements bbg0<Bitmap, byte[]> {
    public final Bitmap.CompressFormat b = Bitmap.CompressFormat.JPEG;
    public final int c = 100;

    @Override // xsna.bbg0
    @Nullable
    public final hag0<byte[]> c(@NonNull hag0<Bitmap> hag0Var, @NonNull au80 au80Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        hag0Var.get().compress(this.b, this.c, byteArrayOutputStream);
        hag0Var.a();
        return new qu8(byteArrayOutputStream.toByteArray());
    }
}
