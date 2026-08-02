package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* compiled from: Device.java */
/* loaded from: classes.dex */
public final class t5m {
    public static final bpn0 a = new bpn0(new b55(3));

    public static boolean a(Context context) {
        if (gz80.a(29)) {
            Resources resources = context.getResources();
            try {
                if (resources.getInteger(resources.getIdentifier("config_navBarInteractionMode", "integer", "android")) == 2) {
                    return true;
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean b() {
        return "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean c() {
        return "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }
}
