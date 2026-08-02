package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class goe0 {
    public static final foe0 a;

    static {
        String str = Build.FINGERPRINT;
        a = (str == null || !str.toLowerCase(Locale.ROOT).equals("robolectric")) ? null : new foe0();
    }
}
