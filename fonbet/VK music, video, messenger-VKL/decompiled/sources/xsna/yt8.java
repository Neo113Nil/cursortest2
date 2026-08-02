package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes12.dex */
public final class yt8 implements mag0<ByteBuffer, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;

    public yt8(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull au80 au80Var) throws IOException {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.a;
        return aVar.a(new b.a(byteBuffer, aVar.d, aVar.c), i, i2, au80Var, com.bumptech.glide.load.resource.bitmap.a.k);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
