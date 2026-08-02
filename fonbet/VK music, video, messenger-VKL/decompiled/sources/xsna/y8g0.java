package xsna;

import androidx.annotation.NonNull;

/* compiled from: ResUtils.java */
/* loaded from: classes.dex */
public final class y8g0 {
    public static int a(int i) {
        return e43.a.getResources().getDimensionPixelSize(i);
    }

    public static float b(int i) {
        return e43.a.getResources().getDimension(i);
    }

    @NonNull
    public static String c(int i, int i2) {
        return e43.a.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    @NonNull
    public static String d(int i, int i2, Object... objArr) {
        return e43.a.getResources().getQuantityString(i, i2, objArr);
    }

    @NonNull
    public static String e(int i) {
        return e43.a.getResources().getString(i);
    }

    @NonNull
    public static String f(int i, Object... objArr) {
        return e43.a.getResources().getString(i, objArr);
    }
}
