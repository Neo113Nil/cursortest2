package sg.bigo.ads.common.utils;

/* loaded from: classes9.dex */
public final class u {
    private static boolean a = false;

    public static void a(String str) {
        if (a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b() {
        return a;
    }

    public static void a(boolean z) {
        a = z;
    }

    public static boolean a() {
        return false;
    }

    public static void c() {
    }
}
