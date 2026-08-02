package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class og61 {
    public static boolean a(cu81 cu81Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(cu81Var.c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !cu81Var.f;
    }
}
