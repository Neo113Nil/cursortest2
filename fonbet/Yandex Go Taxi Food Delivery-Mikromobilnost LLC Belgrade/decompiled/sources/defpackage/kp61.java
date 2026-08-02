package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.a;
import kotlin.text.Regex;
import yads.ae;
import yads.be;

/* loaded from: classes7.dex */
public abstract class kp61 {
    public static final i3y a = a.a(ae.w);
    public static final i3y b = a.a(be.w);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = evu0.M(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String obj = evu0.k0((String) it.next()).toString();
            w610 b2 = ((Regex) b.getValue()).b(obj);
            String str2 = b2 != null ? (String) kotlin.collections.a.S(1, b2.a()) : null;
            if (str2 != null) {
                thread = new Thread("[ExitInfo] ".concat(str2));
                linkedHashMap.put(thread, new ArrayList());
            } else if (cvu0.x(obj, "at ", false) && thread != null) {
                w610 b3 = ((Regex) a.getValue()).b(obj);
                if (b3 != null) {
                    String str3 = (String) ((u1l) b3.a()).get(1);
                    String str4 = (String) ((u1l) b3.a()).get(2);
                    String str5 = (String) ((u1l) b3.a()).get(3);
                    String h0 = evu0.h0('.', str3, "");
                    String e0 = evu0.e0('.', str3, str3);
                    try {
                        Integer l = bvu0.l(10, str5);
                        stackTraceElement = new StackTraceElement(h0, e0, str4, l != null ? l.intValue() : -1);
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
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
