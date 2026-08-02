package xsna;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.vk.log.L;
import java.lang.reflect.Field;

/* compiled from: TypefaceHacks.kt */
/* loaded from: classes17.dex */
public final class mup0 {
    public static boolean a(Throwable th) {
        int i = gz80.a;
        return (i == 26 || i == 27) && (th instanceof ArrayIndexOutOfBoundsException);
    }

    public static void b() {
        try {
            Field declaredField = Typeface.class.getDeclaredField("sTypefaceCache");
            declaredField.setAccessible(true);
            LongSparseArray longSparseArray = (LongSparseArray) declaredField.get(null);
            if (longSparseArray.size() < 4) {
                SparseArray sparseArray = new SparseArray(4);
                sparseArray.put(0, Typeface.defaultFromStyle(0));
                sparseArray.put(1, Typeface.defaultFromStyle(1));
                sparseArray.put(2, Typeface.defaultFromStyle(2));
                sparseArray.put(3, Typeface.defaultFromStyle(3));
                longSparseArray.append(3L, sparseArray);
            }
        } catch (Throwable th) {
            L.j(th, "Failed to hook typeface cache");
        }
    }
}
