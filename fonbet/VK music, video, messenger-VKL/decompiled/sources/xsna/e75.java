package xsna;

import android.os.Build;

/* compiled from: AuthenticatorUtils.java */
/* loaded from: classes11.dex */
public final class e75 {
    public static boolean a(int i) {
        return (i & 32768) != 0;
    }

    public static boolean b(int i) {
        if (i != 15 && i != 255) {
            return i != 32768 ? i != 32783 ? i == 33023 || i == 0 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
        }
        return true;
    }
}
