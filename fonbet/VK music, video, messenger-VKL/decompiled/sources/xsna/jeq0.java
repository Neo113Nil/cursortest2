package xsna;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: UriExt.kt */
/* loaded from: classes.dex */
public final class jeq0 {
    public static final LinkedHashMap a(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        int e = on00.e(c5g.u(queryParameterNames, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : queryParameterNames) {
            String queryParameter = uri.getQueryParameter((String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(obj, queryParameter);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (myc0.f((String) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static final String b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int P = encodedPath != null ? drm0.P(encodedPath, File.separatorChar, 0, 6) : -1;
        return P < 0 ? "" : uri.getEncodedPath().substring(P + 1);
    }

    public static final String c(Uri uri) {
        String uri2 = uri.toString();
        return uri2.substring(drm0.K(0, 6, uri2, uri.getEncodedPath(), false));
    }

    public static final Uri d(Uri uri, List<String> list) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builder = new Uri.Builder();
        for (String str : queryParameterNames) {
            if (list.indexOf(str) < 0) {
                builder.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return uri.buildUpon().clearQuery().encodedQuery(builder.build().getQuery()).build();
    }

    public static final Uri e(Uri uri, String str) {
        String str2;
        String str3;
        try {
            str2 = uri.getQueryParameter(str);
        } catch (Exception unused) {
            str2 = null;
        }
        if (str2 == null) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str4 : queryParameterNames) {
            if (!str.equals(str4)) {
                try {
                    str3 = uri.getQueryParameter(str4);
                } catch (Exception unused2) {
                    str3 = null;
                }
                clearQuery.appendQueryParameter(str4, str3);
            }
        }
        return clearQuery.build();
    }

    public static final Intent f(Uri uri) {
        return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
    }

    public static final Uri g(String str) {
        return drm0.d0(str, '/') ? new Uri.Builder().scheme(X3.i.b).path(str).build() : Uri.parse(str);
    }
}
