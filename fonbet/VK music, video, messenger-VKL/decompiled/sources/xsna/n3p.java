package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vk.photo.editor.domain.LowMemoryException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: EditorBitmapFactory.kt */
/* loaded from: classes4.dex */
public final class n3p {
    public static void a(int i, int i2) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        if (i * i2 * 4 <= maxMemory - (j - runtime.freeMemory())) {
            return;
        }
        StringBuilder a = odj.a(i, i2, "Not enough memory to allocate Bitmap(", StringUtils.COMMA, "). totalMemory=");
        a.append(j);
        throw new LowMemoryException(xy6.a(maxMemory, ", maxMemory=", a), 2);
    }

    public static Bitmap b(int i, int i2) {
        a(i, i2);
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap c(Resources resources, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        a(options.outWidth, options.outHeight);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inScaled = false;
        return BitmapFactory.decodeResource(resources, i, options2);
    }
}
