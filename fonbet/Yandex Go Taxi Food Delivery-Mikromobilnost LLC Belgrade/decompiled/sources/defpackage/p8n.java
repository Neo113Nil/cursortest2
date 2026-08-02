package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class p8n {
    public static final Set a = j73.f0(new String[]{"fintech-sdk", "fintechsdk"});
    public static final Regex b = new Regex("^[a-z0-9\\-_/]+$");
    public static final Regex c = new Regex("//");

    public static Object a(Object obj) {
        if (obj instanceof Map) {
            return h((Map) obj);
        }
        if (!(obj instanceof List)) {
            return obj instanceof Integer ? Long.valueOf(((Number) obj).intValue()) : obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new JSONArray((Collection) arrayList);
    }

    public static Object b(Object obj) {
        return obj instanceof String ? obj : obj instanceof JSONObject ? f((JSONObject) obj) : obj instanceof JSONArray ? d((JSONArray) obj) : obj.toString();
    }

    public static LinkedHashMap c(Map map) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                obj = c((Map) value);
            } else if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                for (Object obj2 : iterable) {
                    arrayList.add(obj2 instanceof Map ? c((Map) obj2) : String.valueOf(obj2));
                }
                obj = arrayList;
            } else {
                obj = value.toString();
            }
            linkedHashMap.put(key, obj);
        }
        return linkedHashMap;
    }

    public static ArrayList d(JSONArray jSONArray) {
        d6w n = y6i0.n(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(b(jSONArray.get(it.nextInt())));
        }
        return arrayList;
    }

    public static LinkedHashMap e(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, g(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap f(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, b(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static Object g(Object obj) {
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return e((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj.toString();
        }
        JSONArray jSONArray = (JSONArray) obj;
        d6w n = y6i0.n(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(tcc.n(n, 10));
        c6w it = n.iterator();
        while (it.c) {
            arrayList.add(g(jSONArray.get(it.nextInt())));
        }
        return arrayList;
    }

    public static JSONObject h(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), a(entry.getValue()));
        }
        return jSONObject;
    }

    public static void i(Map map, List list, Serializable serializable) {
        int i;
        Map map2;
        if (list.isEmpty()) {
            return;
        }
        n8n n8nVar = (n8n) list.get(0);
        if (n8nVar instanceof m8n) {
            if (list.size() == 1) {
                map.put(((m8n) n8nVar).a, serializable);
                return;
            }
            List J = a.J(list, 1);
            n8n n8nVar2 = (n8n) J.get(0);
            if (!(n8nVar2 instanceof l8n) && !(n8nVar2 instanceof k8n)) {
                if (!(n8nVar2 instanceof m8n)) {
                    w511.b();
                    return;
                }
                String str = ((m8n) n8nVar).a;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new LinkedHashMap();
                    map.put(str, obj);
                }
                map2 = ym11.h(obj) ? (Map) obj : null;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    map.put(str, map2);
                }
                i(map2, J, serializable);
                return;
            }
            String str2 = ((m8n) n8nVar).a;
            Object obj2 = map.get(str2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                map.put(str2, obj2);
            }
            List list2 = ym11.g(obj2) ? (List) obj2 : null;
            if (list2 == null) {
                list2 = new ArrayList();
                map.put(str2, list2);
            }
            if (J.isEmpty()) {
                return;
            }
            n8n n8nVar3 = (n8n) J.get(0);
            if (n8nVar3 instanceof k8n) {
                if (J.size() == 1) {
                    list2.add(serializable);
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                i(linkedHashMap, a.J(J, 1), serializable);
                list2.add(linkedHashMap);
                return;
            }
            if (n8nVar3 instanceof l8n) {
                while (true) {
                    int size = list2.size();
                    i = ((l8n) n8nVar3).a;
                    if (size > i) {
                        break;
                    } else {
                        list2.add(new LinkedHashMap());
                    }
                }
                Object obj3 = list2.get(i);
                if (J.size() == 1) {
                    list2.set(i, serializable);
                    return;
                }
                map2 = ym11.h(obj3) ? (Map) obj3 : null;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    list2.set(i, map2);
                }
                i(map2, a.J(J, 1), serializable);
            }
        }
    }
}
