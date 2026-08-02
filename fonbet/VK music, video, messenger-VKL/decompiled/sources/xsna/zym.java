package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DimensionConverter.kt */
/* loaded from: classes6.dex */
public final class zym {
    public static final HashMap a;
    public static final Pattern b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("px", 0);
        hashMap.put("dip", 1);
        vq.f(hashMap, "dp", 1, 2, "sp");
        a7g.a(3, hashMap, "pt", 4, "in");
        hashMap.put("mm", 5);
        a = hashMap;
        b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    }

    public static float a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float floatValue = Float.valueOf(matcher.group(1)).floatValue();
        Integer num = (Integer) a.get(matcher.group(3).toLowerCase(Locale.ROOT));
        if (num != null) {
            return TypedValue.applyDimension(num.intValue(), floatValue, displayMetrics);
        }
        throw new NumberFormatException();
    }
}
