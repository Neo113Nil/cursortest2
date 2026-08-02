package defpackage;

import android.os.Build;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;
import com.adjust.sdk.Constants;

/* loaded from: classes10.dex */
public class fyo {
    public final ExtensionDisabledQuirk a = (ExtensionDisabledQuirk) ubj.a.b(ExtensionDisabledQuirk.class);

    public final boolean a(String str) {
        if (this.a != null) {
            String str2 = Build.BRAND;
            if (((Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(str2) && "redfin".equalsIgnoreCase(Build.DEVICE) && (!azo.f(c94.z) || !azo.a().d())) || ("motorola".equalsIgnoreCase(str2) && azo.e(c94.y)) || ("realme".equalsIgnoreCase(str2) && azo.e(c94.y))) ? true : (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str2) && "a52sxq".equalsIgnoreCase(Build.DEVICE)) ? str.equals("0") : false) {
                return true;
            }
        }
        return false;
    }
}
