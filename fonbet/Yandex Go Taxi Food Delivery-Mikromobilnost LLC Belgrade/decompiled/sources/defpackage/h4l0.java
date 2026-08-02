package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes13.dex */
public final class h4l0 {
    public static final List b = scc.g("src_phone_number", "dest_phone_number");
    public final u8w a;

    public h4l0(u8w u8wVar) {
        this.a = u8wVar;
    }

    public static String a(String str) {
        if (str == null || evu0.J(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return str;
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if ((queryParameterNames instanceof Collection) && queryParameterNames.isEmpty()) {
            return str;
        }
        for (String str2 : queryParameterNames) {
            List list = b;
            if (list.contains(str2)) {
                Uri.Builder path = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getHost()).path(parse.getPath());
                for (String str3 : parse.getQueryParameterNames()) {
                    if (list.contains(str3)) {
                        path.appendQueryParameter(str3, "hidden");
                    } else {
                        path.appendQueryParameter(str3, parse.getQueryParameter(str3));
                    }
                }
                return path.toString();
            }
        }
        return str;
    }

    public final void b(String str, boolean z) {
        HashMap p = x4e.p(Constants.DEEPLINK, a(str));
        this.a.a.a("LaunchIntentGeo", p, 1, x4e.r(z, p, "isQuery"));
    }
}
