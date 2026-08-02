package yads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class gm2 {
    public static final cw1 a = bw1.a();

    public static void a(String str, Object... objArr) {
        boolean z;
        if (!dd1.a) {
            synchronized (fv1.a) {
                z = fv1.b;
            }
            if (!z) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        if (fv1.b) {
            a.a(ev1.c, "Yandex Mobile Ads", format);
        }
    }
}
