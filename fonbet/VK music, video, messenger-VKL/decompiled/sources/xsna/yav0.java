package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.utils.VkPassportPage;

/* compiled from: VkPassportHelper.kt */
/* loaded from: classes15.dex */
public final class yav0 {
    public static final VkPassportPage a(Uri uri) {
        String uri2 = uri.toString();
        String j0 = drm0.j0(uri2, "#/", uri2);
        for (VkPassportPage vkPassportPage : VkPassportPage.values()) {
            if (epx.f(vkPassportPage.i(), j0)) {
                return vkPassportPage;
            }
        }
        return null;
    }

    public static final String b(String str, String str2, String str3) {
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str).appendEncodedPath("account/");
        if (str2 != null) {
            appendEncodedPath.appendQueryParameter("only_page", str2);
        }
        if (str3 != null) {
            Uri parse = Uri.parse(str3);
            for (String str4 : parse.getQueryParameterNames()) {
                if (!epx.f(str4, "act")) {
                    appendEncodedPath.appendQueryParameter(str4, parse.getQueryParameter(str4));
                }
            }
        }
        return appendEncodedPath.build().toString();
    }

    public static /* synthetic */ String c(int i, String str, String str2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return b(str, str2, null);
    }

    public static final boolean d(Uri uri) {
        return a(uri) != null;
    }
}
