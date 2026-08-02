package defpackage;

import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.Locale;

/* loaded from: classes2.dex */
public class khc {
    /* JADX WARN: Can't wrap try/catch for region: R(5:5|(3:17|18|(1:10)(2:12|13))|7|8|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        defpackage.skd0.c(com.yandex.plus.core.analytics.logging.PlusLogTag.SDK, "Parsing color error, color = ".concat(r4), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer a(String str) {
        int i;
        if (str != null && !str.toString().trim().isEmpty()) {
            String upperCase = str.toUpperCase(Locale.US);
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

    public static int b(int i) {
        return lhc.f(i, Math.abs(25));
    }
}
