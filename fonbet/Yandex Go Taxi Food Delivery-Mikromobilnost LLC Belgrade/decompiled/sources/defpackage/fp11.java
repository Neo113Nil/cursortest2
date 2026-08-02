package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class fp11 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Typeface typeface, kzr kzrVar, Context context) {
        int i;
        String str;
        int i2;
        List list = kzrVar.a;
        if (typeface == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        jwi c = gwk0.c(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    str = rty.a(31, new fnb0(17, c), null, list);
                } else {
                    if (list.size() > 0) {
                        list.get(0).getClass();
                        ny61.u();
                        return null;
                    }
                    float c2 = y6i0.c(i + 400.0f, 1.0f, 1000.0f);
                    str = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + c2;
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        i = 0;
        if (i != 0) {
        }
        paint.setFontVariationSettings(str);
        return paint.getTypeface();
    }
}
