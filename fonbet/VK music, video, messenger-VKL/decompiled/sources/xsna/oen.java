package xsna;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: DisplayCutoutHelper.kt */
/* loaded from: classes.dex */
public final class oen {
    public static final bpn0 a = new bpn0(new wa3(4));

    public static boolean a() {
        return ((SharedPreferences) a.getValue()).getBoolean("has_display_cutout", false);
    }

    public static final boolean b(Context context) {
        return iah0.o(context) || a();
    }
}
