package xsna;

import android.graphics.Bitmap;
import com.vk.photo.editor.chronicle.ChronicleLowMemoryException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: ChronicleBitmapFactory.kt */
/* loaded from: classes4.dex */
public final class zbc {
    public static Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        if (width * height * 4 <= maxMemory - (j - runtime.freeMemory())) {
            return bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        StringBuilder a = odj.a(width, height, "Not enough memory to allocate Bitmap(", StringUtils.COMMA, "). totalMemory=");
        a.append(j);
        throw new ChronicleLowMemoryException(xy6.a(maxMemory, ", maxMemory=", a), 2);
    }
}
