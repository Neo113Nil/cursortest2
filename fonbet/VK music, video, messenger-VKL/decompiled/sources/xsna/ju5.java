package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.IDN;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: AwayUriUtils.kt */
/* loaded from: classes17.dex */
public final class ju5 {
    public static final HashSet<String> a = izi0.d(".рф", ".рус", ".дети", ".москва", ".онлайн", ".орг", ".сайт");
    public static final HashSet<String> b = izi0.d("to", "utf", "away_token");

    public static void a(Uri.Builder builder, Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (!b.contains(str)) {
                    builder.appendQueryParameter(str, bundle.getString(str));
                }
            }
        }
    }

    public static void b(Uri.Builder builder, Uri uri) {
        builder.appendQueryParameter("to", uri.toString());
    }

    public static void c(Uri.Builder builder, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static Uri.Builder d(String str) {
        return new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str).path("/away").appendQueryParameter("utf", "1");
    }

    public static Uri e(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        String U = authority != null ? drm0.U(authority, host) : "";
        String ascii = IDN.toASCII(host);
        return uri.buildUpon().authority(ascii + U).build();
    }

    public static String f() {
        return "m.".concat(a0a.d);
    }

    public static boolean g(String str) {
        String str2;
        if (str != null) {
            Iterator<String> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = it.next();
                if (brm0.v(str, str2, false)) {
                    break;
                }
            }
            if (str2 != null) {
                return true;
            }
        }
        return false;
    }
}
