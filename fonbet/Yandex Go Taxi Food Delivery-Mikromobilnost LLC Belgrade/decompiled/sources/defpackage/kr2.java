package defpackage;

import android.os.PowerManager;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class kr2 {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
