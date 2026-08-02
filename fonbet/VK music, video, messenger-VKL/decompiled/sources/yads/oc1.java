package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import xsna.go9;

/* loaded from: classes10.dex */
public abstract class oc1 {
    public static final cw1 a = bw1.a();
    public static final String b = "YandexAds";
    public static boolean c = true;

    public static String a(String str) {
        return go9.b("[Integration] ", str);
    }

    public static final void b(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (fv1.a) {
                z = fv1.b;
            }
            if (!z) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String a2 = a(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
        String str2 = b;
        if (fv1.b) {
            a.a(ev1.b, str2, a2);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (fv1.a) {
                z = fv1.b;
            }
            if (!z) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String a2 = a(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
        String str2 = b;
        if (fv1.b) {
            a.a(ev1.c, str2, a2);
        }
    }

    public static final void a(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (fv1.a) {
                z = fv1.b;
            }
            if (!z) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String a2 = a(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)));
        if (c) {
            Log.e(b, a2);
        }
        if (fv1.b) {
            a.a(ev1.d, b, a2);
        }
    }
}
