package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import com.vk.clipseditor.utility.exceptions.FileFormatException;
import java.io.FileNotFoundException;

/* compiled from: ClipsImageHelper.kt */
/* loaded from: classes16.dex */
public final class ige {
    public static Size a(Context context, Uri uri) {
        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException(i6n0.a(uri, "Cannot open uri: "));
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor.getFileDescriptor(), null, options) == null) {
                BitmapFactory.decodeFile(uri.getEncodedPath(), options);
            }
            if (options.outWidth >= 0 && options.outHeight >= 0) {
                Size size = new Size(options.outWidth, options.outHeight);
                openAssetFileDescriptor.close();
                return size;
            }
            throw new FileFormatException("Unable to decode image. Found size is " + options.outWidth + 'x' + options.outHeight);
        } finally {
        }
    }
}
