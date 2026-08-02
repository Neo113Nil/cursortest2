package yads;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.text.Regex;
import xsna.arm0;
import xsna.bpn0;
import xsna.brm0;
import xsna.drm0;
import xsna.hl10;
import xsna.j5g;
import xsna.on00;

/* loaded from: classes10.dex */
public abstract class sf {
    public static final Lazy a = new bpn0(qf.b);
    public static final Lazy b = new bpn0(rf.b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        List<String> b2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = drm0.Q(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String obj = drm0.p0((String) it.next()).toString();
            hl10 b3 = ((Regex) b.getValue()).b(obj);
            String str2 = (b3 == null || (b2 = b3.b()) == null) ? null : (String) j5g.b0(1, b2);
            if (str2 != null) {
                thread = new Thread("[ExitInfo] ".concat(str2));
                linkedHashMap.put(thread, new ArrayList());
            } else if (brm0.B(obj, "at ", false) && thread != null) {
                hl10 b4 = ((Regex) a.getValue()).b(obj);
                if (b4 != null) {
                    String str3 = (String) ((hl10.a) b4.b()).get(1);
                    String str4 = (String) ((hl10.a) b4.b()).get(2);
                    String str5 = (String) ((hl10.a) b4.b()).get(3);
                    String m0 = drm0.m0(JwtParser.SEPARATOR_CHAR, str3, "");
                    String i0 = drm0.i0(JwtParser.SEPARATOR_CHAR, str3, str3);
                    try {
                        Integer m = arm0.m(10, str5);
                        stackTraceElement = new StackTraceElement(m0, i0, str4, m != null ? m.intValue() : -1);
                    } catch (Throwable unused) {
                    }
                    if (stackTraceElement != null && (list = (List) linkedHashMap.get(thread)) != null) {
                        list.add(stackTraceElement);
                    }
                }
                stackTraceElement = null;
                if (stackTraceElement != null) {
                    list.add(stackTraceElement);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
