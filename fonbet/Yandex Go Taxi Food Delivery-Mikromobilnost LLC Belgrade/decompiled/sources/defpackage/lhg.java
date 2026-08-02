package defpackage;

import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lhg {
    public final jwh a;

    public lhg(jwh jwhVar) {
        this.a = jwhVar;
    }

    public static void a(lhg lhgVar, String str, Object obj) {
        lhgVar.c("Shown", str, obj, null);
    }

    public final void b(Object obj, String str) {
        c("Tapped", str, obj, null);
    }

    public final void c(String str, String str2, Object obj, String str3) {
        if (str2 != null) {
            String p = g8e.p(str2, Extension.DOT_CHAR, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                linkedHashMap.put(Constants.REFERRER_API_META, obj);
            }
            if (str3 != null) {
                linkedHashMap.put("inputPoint", str3);
            }
            this.a.a.o(p, null, linkedHashMap);
        }
    }
}
