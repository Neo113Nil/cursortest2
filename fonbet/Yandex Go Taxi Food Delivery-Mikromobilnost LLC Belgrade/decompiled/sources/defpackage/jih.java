package defpackage;

import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class jih {
    public static ua91 a(X509Certificate x509Certificate, LinkedHashMap linkedHashMap) {
        iih iihVar;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(x509Certificate.getNotBefore());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(x509Certificate.getNotAfter());
        int i = 2;
        int i2 = 0;
        if (calendar2.compareTo(calendar) < 0) {
            iihVar = new iih(0, false);
        } else {
            iihVar = new iih(((calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12)) - (calendar2.get(5) < calendar.get(5) ? 1 : 0), calendar2.get(5) != calendar.get(5));
        }
        int a = iihVar.a();
        boolean b = iihVar.b();
        if (a > 39 || (a == 39 && b)) {
            i = 5;
        } else if (a > 27 || (a == 27 && b)) {
            i = 4;
        } else if (a >= 15) {
            i = 3;
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() instanceof klp0) {
                    i2++;
                }
            }
        }
        return i2 < i ? new q831(linkedHashMap, i) : new u831(linkedHashMap);
    }
}
