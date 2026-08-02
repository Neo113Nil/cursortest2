package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BitmapRecycler.kt */
/* loaded from: classes2.dex */
public final class vc7 {
    public static final ConcurrentHashMap<Integer, RuntimeException> a = new ConcurrentHashMap<>();

    public static void a(Bitmap bitmap) {
        RuntimeException runtimeException = a.get(Integer.valueOf(bitmap.hashCode()));
        if (runtimeException != null) {
            L.i(runtimeException);
        }
    }
}
