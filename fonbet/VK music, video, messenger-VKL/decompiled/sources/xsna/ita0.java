package xsna;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;

/* compiled from: PlatformDecoder.kt */
/* loaded from: classes.dex */
public interface ita0 {
    uvf<Bitmap> decodeFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace);

    uvf<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(rip ripVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace);
}
