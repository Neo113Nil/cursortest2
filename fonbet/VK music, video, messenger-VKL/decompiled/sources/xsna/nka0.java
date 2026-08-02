package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.model.source.picture.ColorMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageBitmapMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import com.vk.media.pipeline.utils.exception.InvalidPictureSourceException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: PictureMediaSourceExt.kt */
/* loaded from: classes3.dex */
public final class nka0 {
    public static Size a(ImageMediaSource imageMediaSource) {
        if (imageMediaSource instanceof ColorMediaSource) {
            ColorMediaSource colorMediaSource = (ColorMediaSource) imageMediaSource;
            return new Size(colorMediaSource.c, colorMediaSource.d);
        }
        if (imageMediaSource instanceof ImageBitmapMediaSource) {
            Bitmap bitmap = ((ImageBitmapMediaSource) imageMediaSource).b;
            return new Size(bitmap.getWidth(), bitmap.getHeight());
        }
        if (!(imageMediaSource instanceof ImageFileMediaSource)) {
            throw new NoWhenBranchMatchedException();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ImageFileMediaSource imageFileMediaSource = (ImageFileMediaSource) imageMediaSource;
        Uri uri = imageFileMediaSource.b;
        BitmapFactory.decodeFile(uri.getPath(), options);
        if (options.outWidth > 0 && options.outHeight > 0) {
            int i = imageFileMediaSource.c;
            return (i == 90 || i == 270) ? new Size(options.outHeight, options.outWidth) : new Size(options.outWidth, options.outHeight);
        }
        BitmapFactory.decodeFile(uri.getEncodedPath(), options);
        Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        String path = uri.getPath();
        boolean d = path != null ? bd3.d(path) : false;
        StringBuilder sb = new StringBuilder("Unable to decode image. Found size is ");
        sb.append(options.outWidth);
        sb.append('x');
        cgn.a(options.outHeight, intValue, ", encoded size is ", " x ", sb);
        sb.append(intValue2);
        sb.append(", exists=");
        sb.append(d);
        sb.append(", path=");
        sb.append(path);
        throw new InvalidPictureSourceException(sb.toString());
    }

    public static Size b(ImageMediaSource imageMediaSource, int i) {
        Size a = a(imageMediaSource);
        int max = Math.max(a.getWidth(), a.getWidth());
        if (max <= i) {
            return a;
        }
        float f = i / max;
        return new Size((int) (a.getWidth() * f), (int) (a.getHeight() * f));
    }

    public static Bitmap c(Bitmap bitmap, Size size) {
        float min = Math.min(size.getWidth() / bitmap.getWidth(), size.getHeight() / bitmap.getHeight());
        if (min <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new InvalidPictureSourceException("scale <= 0, shouldn't happen");
        }
        int max = Math.max(1, (int) (bitmap.getWidth() * min));
        int max2 = Math.max(1, (int) (bitmap.getHeight() * min));
        return (bitmap.getWidth() == max && bitmap.getHeight() == max2) ? bitmap : Bitmap.createScaledBitmap(bitmap, max, max2, false);
    }
}
