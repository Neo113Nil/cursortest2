package xsna;

import android.os.Build;

/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes12.dex */
public final class kgs implements rjk {
    public static final boolean a;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                a = z;
            }
        }
        z = false;
        a = z;
    }
}
