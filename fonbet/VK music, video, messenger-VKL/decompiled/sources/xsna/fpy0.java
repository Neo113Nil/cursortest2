package xsna;

import android.os.Build;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class fpy0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public fpy0() {
        this.a = Build.VERSION.RELEASE;
        this.b = a();
        this.c = Build.DEVICE;
        this.d = Build.MODEL;
        this.e = Build.MANUFACTURER;
        this.i = "default-empty";
        this.f = "default-empty";
        this.g = "default-empty";
        this.h = "default-empty";
    }

    public static int a() {
        String[] split;
        int i;
        int i2;
        int i3 = 0;
        try {
            split = Build.VERSION.RELEASE.split("\\.");
        } catch (Throwable unused) {
        }
        if (split.length == 0) {
            return 0;
        }
        int length = split.length;
        if (length != 1) {
            if (length == 2) {
                i = 0;
            } else {
                if (length != 3) {
                    i = 0;
                    i2 = 0;
                    return rqi.a(i2, 1000, i3 * 1000000, i);
                }
                i = Integer.parseInt(split[2]);
            }
            i2 = Integer.parseInt(split[1]);
        } else {
            i = 0;
            i2 = 0;
        }
        i3 = Integer.parseInt(split[0]);
        return rqi.a(i2, 1000, i3 * 1000000, i);
    }

    public fpy0(String str, String str2, String str3, String str4) {
        this.a = Build.VERSION.RELEASE;
        this.b = a();
        this.c = Build.DEVICE;
        this.d = Build.MODEL;
        this.e = Build.MANUFACTURER;
        this.i = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }
}
