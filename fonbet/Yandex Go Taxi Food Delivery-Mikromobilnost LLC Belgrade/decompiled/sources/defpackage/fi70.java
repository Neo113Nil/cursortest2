package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes6.dex */
public abstract class fi70 implements nwy0 {
    public static Rect a(ah00 ah00Var, f4c0 f4c0Var) {
        Bitmap bitmap;
        Point point = (Point) f4c0Var.h;
        ImageProvider imageProvider = f4c0Var.k;
        float width = (imageProvider == null || (bitmap = imageProvider.get$image()) == null) ? 0 : bitmap.getWidth();
        float q = f4c0Var.q();
        ScreenPoint e = ((gh00) ah00Var).e.e(point);
        if (e == null) {
            return ((gh00) ah00Var).a.b();
        }
        float x = e.getX();
        float y = e.getY();
        float f = width / 2.0f;
        float f2 = q / 2.0f;
        return new Rect((int) (x - f), (int) (y - f2), (int) (x + f), (int) (y + f2));
    }
}
