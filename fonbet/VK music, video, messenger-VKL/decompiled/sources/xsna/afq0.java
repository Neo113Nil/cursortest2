package xsna;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.preference.Preference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: UrlHelper.kt */
/* loaded from: classes4.dex */
public final class afq0 {
    public static String a(String str) {
        String s;
        String s2;
        s = Preference.s("device_id_storage", "googleDeviceId", new String());
        if (s.length() <= 0) {
            s = null;
        }
        s2 = Preference.s("device_id_storage", "huaweiDeviceId", new String());
        String str2 = s2.length() > 0 ? s2 : null;
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("mt_gaid");
        boolean z = queryParameter != null && drm0.D(queryParameter, "{gaid}", false);
        String queryParameter2 = parse.getQueryParameter("mt_oaid");
        boolean z2 = queryParameter2 != null && drm0.D(queryParameter2, "{oaid}", false);
        if (!z && !z2) {
            return str;
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : parse.getQueryParameterNames()) {
            String queryParameter3 = parse.getQueryParameter(str3);
            if (queryParameter3 != null) {
                linkedHashMap.put(str3, queryParameter3);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            String str6 = "";
            if (drm0.D(str5, "{gaid}", false)) {
                if (s != null && s.length() != 0) {
                    str6 = s;
                }
                str5 = brm0.y(str5, "{gaid}", str6);
            } else if (drm0.D(str5, "{oaid}", false)) {
                if (str2 != null && str2.length() != 0) {
                    str6 = str2;
                }
                str5 = brm0.y(str5, "{oaid}", str6);
            }
            clearQuery.appendQueryParameter(str4, Uri.encode(str5, C.UTF8_NAME));
        }
        return clearQuery.build().toString();
    }
}
