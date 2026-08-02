package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;

/* loaded from: classes8.dex */
public final class kap {
    public static String a(String str, String str2, boolean z) {
        if (evu0.J(str)) {
            return "";
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(Constants.DEEPLINK, str2).appendQueryParameter("type", z ? "internal_deeplink" : "external_deeplink").build().toString();
    }
}
