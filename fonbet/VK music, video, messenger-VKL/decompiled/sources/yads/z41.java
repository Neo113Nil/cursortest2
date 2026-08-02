package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class z41 {
    public static boolean a(x41 x41Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(x41Var.c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !x41Var.f;
    }
}
