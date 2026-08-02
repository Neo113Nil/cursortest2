package xsna;

import android.os.Build;

/* compiled from: HapticFeedbackConstantsCompat.java */
/* loaded from: classes11.dex */
public final class wtu {
    public static int a(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 < 30) {
            if (i != 12) {
                if (i == 13) {
                    return 6;
                }
                if (i != 16) {
                    if (i == 17) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return i;
    }
}
