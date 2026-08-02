package defpackage;

import android.net.Uri;
import java.util.Set;

/* loaded from: classes8.dex */
public final class dcw {
    public static egw a(Uri uri) {
        rnw rnwVar = new rnw((uri.getQueryParameterNames().contains("start_geo_area") && jl40.l(uri.getQueryParameter("start_geo_area"), "current_a")) ? bei.G : b("start_lat", "start_lon", "start_geo_area", uri), b("end_lat", "end_lon", "end_geo_area", uri));
        String queryParameter = uri.getQueryParameter("tariff_class");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = null;
        }
        return new egw("intercity", new agw(uri.toString()), rnwVar, queryParameter);
    }

    public static pnw b(String str, String str2, String str3, Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str) && queryParameterNames.contains(str2)) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                ny61.g("Required value was null.");
                return null;
            }
            Double i = avu0.i(queryParameter);
            String queryParameter2 = uri.getQueryParameter(str2);
            if (queryParameter2 == null) {
                ny61.g("Required value was null.");
                return null;
            }
            Double i2 = avu0.i(queryParameter2);
            if (i != null && i2 != null) {
                return new nnw(i.doubleValue(), i2.doubleValue());
            }
        } else if (queryParameterNames.contains(str3)) {
            String queryParameter3 = uri.getQueryParameter(str3);
            if (queryParameter3 != null) {
                return new onw(queryParameter3);
            }
            ny61.g("Required value was null.");
        }
        return null;
    }
}
