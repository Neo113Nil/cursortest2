package xsna;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes12.dex */
public final class ic7 implements mag0<ImageDecoder.Source, Bitmap> {
    public final uc7 a = new uc7();

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull ImageDecoder.Source source, @NonNull au80 au80Var) throws IOException {
        return true;
    }

    @Override // xsna.mag0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final wc7 a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull au80 au80Var) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new tjl(i, i2, au80Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new wc7(decodeBitmap, this.a);
    }
}
