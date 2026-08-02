package yads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class m9 {
    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("&");
            sb.append(Uri.encode(str));
            sb.append("=");
            sb.append(Uri.encode(str2));
            if (sb.length() > 61440) {
                cw1 cw1Var = gm2.a;
                gm2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return hashMap;
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            cw1 cw1Var = gm2.a;
            gm2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
