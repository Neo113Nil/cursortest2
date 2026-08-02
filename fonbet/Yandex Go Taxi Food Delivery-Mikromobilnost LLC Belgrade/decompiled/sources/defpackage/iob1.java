package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class iob1 {
    public static final boolean a(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:7|(3:19|20|(1:12)(2:14|15))|9|10|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r3 = defpackage.jgz.a;
        defpackage.jgz.d(r1, java.lang.String.format("Parsing color error, color = %s", java.util.Arrays.copyOf(new java.lang.Object[]{r5}, 1)), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer b(String str) {
        int i;
        if (str != null && str.length() != 0 && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.charAt(0) != '#') {
                try {
                    i = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
                if (i == Integer.MIN_VALUE) {
                    return null;
                }
                return Integer.valueOf(i);
            }
            i = Color.parseColor(upperCase);
            if (i == Integer.MIN_VALUE) {
            }
        }
        i = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
        }
    }

    public static final TypedValue c(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final boolean d(Resources.Theme theme, int i, boolean z) {
        TypedValue c = c(theme, i);
        return c != null ? c.data != 0 : z;
    }

    public static int e(Resources.Theme theme, int i) {
        TypedValue c = c(theme, i);
        if (c != null) {
            return c.resourceId;
        }
        return 0;
    }
}
