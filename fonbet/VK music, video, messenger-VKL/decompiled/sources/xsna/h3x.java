package xsna;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes12.dex */
public final class h3x implements mag0<InputStream, Bitmap> {
    public final ic7 a = new ic7();

    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return this.a.a(ImageDecoder.createSource(du8.b(inputStream)), i, i2, au80Var);
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull InputStream inputStream, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
