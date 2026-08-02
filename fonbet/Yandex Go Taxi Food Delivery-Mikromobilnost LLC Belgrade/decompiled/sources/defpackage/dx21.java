package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class dx21 {
    public static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "cp1251");
        } catch (UnsupportedEncodingException e) {
            aez.a("[YaSearchLib:Utils]", "Error while getting platform version", e);
            try {
                return URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                aez.a("[YaSearchLib:Utils]", "Error while getting platform version", e2);
                return str;
            }
        }
    }
}
