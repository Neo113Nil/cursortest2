package xsna;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: SquircleUtils.kt */
/* loaded from: classes17.dex */
public final class hnk0 {
    public static final Matrix a = new Matrix();

    public static void a(Path path, double d, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        int min = Math.min(rect.width(), rect.height()) / 2;
        Path path2 = ink0.a.get(new lws(min, d));
        if (path2 == null) {
            path2 = ink0.a(d, min);
        }
        path.set(path2);
        float f = min;
        float width = rect.left + ((rect.width() / 2.0f) - f);
        float height = rect.top + ((rect.height() / 2.0f) - f);
        Matrix matrix = a;
        matrix.setTranslate(width, height);
        path.transform(matrix);
    }
}
