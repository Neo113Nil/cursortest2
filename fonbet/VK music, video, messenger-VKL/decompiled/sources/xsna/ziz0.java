package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import xsna.eez0;
import xsna.u3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public abstract class ziz0 {
    public static volatile vfz0 a;
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    public static Object a(String str) {
        ConcurrentHashMap concurrentHashMap = e;
        Object obj = concurrentHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        Object obj2 = new Object();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj2);
        return putIfAbsent != null ? putIfAbsent : obj2;
    }

    public static void b(String str, String str2, e7z0 e7z0Var, u3z0.a aVar, boolean z, int i) {
        String str3 = e7z0Var.a.a;
        synchronized (a(str3)) {
            try {
                ConcurrentHashMap concurrentHashMap = d;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(str3);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap();
                    ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.putIfAbsent(str3, concurrentHashMap2);
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap2 = concurrentHashMap3;
                    }
                }
                eez0 eez0Var = (eez0) concurrentHashMap2.get(str);
                if (eez0Var == null) {
                    eez0Var = new eez0(str, str2, e7z0Var);
                    concurrentHashMap2.put(str, eez0Var);
                }
                if (aVar.a() && !z && i <= 0) {
                    eez0Var.d(true);
                }
                eez0.a b2 = eez0Var.b(aVar, e7z0Var);
                vfz0 vfz0Var = a;
                if (vfz0Var != null) {
                    vfz0Var.a(str3, str, str2, b2, eez0Var.e(), e7z0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean c(String str) {
        synchronized (a(str)) {
            try {
                Map map = (Map) d.get(str);
                boolean z = true;
                if (map != null && !map.isEmpty()) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (!((eez0) it.next()).e()) {
                            return false;
                        }
                    }
                    Integer num = (Integer) c.get(str);
                    if (num != null && num.intValue() != map.size()) {
                        z = false;
                    }
                    return z;
                }
                return true;
            } finally {
            }
        }
    }

    public static void d(String str) {
        Object obj = e.get(str);
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                ConcurrentHashMap concurrentHashMap = d;
                if (concurrentHashMap.containsKey(str)) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.remove(str);
                    if (concurrentHashMap2 == null) {
                        return;
                    }
                    vfz0 vfz0Var = a;
                    if (vfz0Var != null) {
                        vfz0Var.a(str);
                    }
                    b.remove(str);
                    c.remove(str);
                    ArrayList arrayList = new ArrayList(concurrentHashMap2.values());
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        jSONArray.put(((eez0) obj2).g());
                    }
                    ((eez0) arrayList.get(0)).a().b(9102, "", jSONArray.toString());
                    e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
