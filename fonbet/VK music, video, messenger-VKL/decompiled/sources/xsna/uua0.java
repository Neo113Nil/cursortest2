package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;

/* compiled from: PlatformTypefaces.android.kt */
/* loaded from: classes11.dex */
public final class uua0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface a(Typeface typeface, a6s a6sVar, Context context) {
        int i;
        String str;
        boolean z;
        float c;
        int i2;
        List<x5s> list = a6sVar.a;
        int i3 = Build.VERSION.SDK_INT;
        ThreadLocal<Paint> threadLocal = cup0.a;
        if (typeface == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal2 = cup0.a;
        Paint paint = threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        ezl d = hpt0.d(context);
        int i4 = 0;
        if (i3 >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    str = hgz.b(list, null, new xgv(d, 23), 31);
                } else {
                    List<x5s> list2 = list;
                    int size = list2.size();
                    String str2 = "";
                    boolean z2 = false;
                    while (i4 < size) {
                        x5s x5sVar = list.get(i4);
                        if (epx.f(x5sVar.b(), "wght")) {
                            c = swe0.f(x5sVar.c(d) + i, 1.0f, 1000.0f);
                            z = true;
                        } else {
                            z = z2;
                            c = x5sVar.c(d);
                        }
                        if (i4 != 0) {
                            str2 = str2 + ',';
                        }
                        StringBuilder b = v1v.b(str2, '\'');
                        b.append(x5sVar.b());
                        b.append("' ");
                        b.append(c);
                        str2 = b.toString();
                        i4++;
                        z2 = z;
                    }
                    if (z2) {
                        str = str2;
                    } else {
                        float f = swe0.f(i + 400.0f, 1.0f, 1000.0f);
                        if (!list2.isEmpty()) {
                            str2 = str2 + ',';
                        }
                        str = str2 + "'wght' " + f;
                    }
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
