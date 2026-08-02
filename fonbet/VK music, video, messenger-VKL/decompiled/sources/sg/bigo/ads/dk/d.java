package sg.bigo.ads.dk;

import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;

/* loaded from: classes9.dex */
public final class d {
    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float b(String str) {
        if (TextUtils.isEmpty(str)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(String str) {
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
