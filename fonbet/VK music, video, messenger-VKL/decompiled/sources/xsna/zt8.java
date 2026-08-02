package xsna;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes12.dex */
public final class zt8 implements mag0<ByteBuffer, Bitmap> {
    public final ic7 a = new ic7();

    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return this.a.a(ImageDecoder.createSource(byteBuffer), i, i2, au80Var);
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull ByteBuffer byteBuffer, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
