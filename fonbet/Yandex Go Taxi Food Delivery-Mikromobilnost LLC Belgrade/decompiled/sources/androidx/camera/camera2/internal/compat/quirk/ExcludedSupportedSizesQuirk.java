package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.glg0;

/* loaded from: classes10.dex */
public class ExcludedSupportedSizesQuirk implements glg0 {
    public static boolean e() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean f() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }
}
