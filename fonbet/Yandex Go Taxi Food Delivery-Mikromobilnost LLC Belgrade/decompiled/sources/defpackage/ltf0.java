package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ltf0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new htf0(str, 1));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new htf0(str, 3)) : str2;
    }

    public static boolean b(String str) {
        try {
            String a2 = a(str);
            if (a2 != null && a2.length() == 4 && ((a2.charAt(0) == 't' || a2.charAt(0) == 'T') && ((a2.charAt(1) == 'r' || a2.charAt(1) == 'R') && (a2.charAt(2) == 'u' || a2.charAt(2) == 'U')))) {
                if (a2.charAt(3) != 'e') {
                    if (a2.charAt(3) == 'E') {
                    }
                }
                return true;
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
