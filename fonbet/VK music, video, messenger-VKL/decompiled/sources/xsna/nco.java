package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.im.converters.ImJpegConverter;
import xsna.kjw;

/* compiled from: DownscalePhotoConverter.kt */
/* loaded from: classes6.dex */
public final class nco extends ImJpegConverter {
    @Override // com.vk.im.converters.ImJpegConverter
    public final Bitmap c(Context context, Uri uri) {
        kjw.a g = kjw.g(context, uri, false);
        if (g.a + g.b < 14000) {
            return kjw.b(context, uri);
        }
        kjw.a g2 = kjw.g(context, uri, false);
        double d = g2.a / g2.b;
        int i = ((int) (14000 / (1 + d))) - 1;
        return kjw.c(context, uri, (int) (d * i), i, true);
    }
}
