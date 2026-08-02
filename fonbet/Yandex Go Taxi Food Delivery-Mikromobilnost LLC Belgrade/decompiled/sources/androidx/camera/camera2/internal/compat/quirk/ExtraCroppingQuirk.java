package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import com.adjust.sdk.Constants;
import defpackage.glg0;
import defpackage.q4p;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes10.dex */
public class ExtraCroppingQuirk implements glg0 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size e(SurfaceConfig$ConfigType surfaceConfig$ConfigType) {
        if (!f()) {
            return null;
        }
        int i = q4p.a[surfaceConfig$ConfigType.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean f() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap hashMap = a;
        if (!hashMap.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) hashMap.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
