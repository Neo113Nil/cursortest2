package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: DeviceUtils.java */
/* loaded from: classes12.dex */
public final class y6m {

    @Nullable
    public static Boolean a;

    @Nullable
    public static Boolean b;

    @Nullable
    public static Boolean c;

    @Nullable
    public static Boolean d;

    @Nullable
    public static Boolean e;

    @Nullable
    public static Boolean f;

    @Nullable
    public static Boolean g;

    public static boolean a(@NonNull Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b(@NonNull Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (b == null) {
            b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || a(resources));
        }
        return b.booleanValue();
    }

    public static boolean c(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (g == null) {
            g = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return g.booleanValue();
    }
}
