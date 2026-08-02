package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class hqy implements w6k {
    public final /* synthetic */ int a;
    public final z22 b;

    public /* synthetic */ hqy(z22 z22Var, int i) {
        this.a = i;
        this.b = z22Var;
    }

    @Override // defpackage.w6k
    public final void a(p6k p6kVar, w3k w3kVar, apk apkVar) {
        String str;
        String str2;
        Map map;
        vhk vhkVar;
        int i = this.a;
        z22 z22Var = this.b;
        ArrayList arrayList = null;
        Map map2 = null;
        switch (i) {
            case 0:
                Object obj = w3kVar.a.get("actions");
                List<Map> list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map3 : list) {
                        Object obj2 = map3.get("url");
                        Map map4 = obj2 instanceof Map ? (Map) obj2 : null;
                        if (map4 == null) {
                            str = null;
                        } else {
                            Object obj3 = map4.get("value");
                            if (obj3 == null) {
                                obj3 = map4.get("url");
                            }
                            if (!(obj3 instanceof String)) {
                                obj3 = null;
                            }
                            str = (String) obj3;
                        }
                        if (str == null) {
                            vhkVar = null;
                        } else {
                            Object obj4 = map3.get("log_id");
                            Map map5 = obj4 instanceof Map ? (Map) obj4 : null;
                            if (map5 == null) {
                                str2 = null;
                            } else {
                                Object obj5 = map5.get("value");
                                if (obj5 == null) {
                                    obj5 = map5.get("log_id");
                                }
                                if (!(obj5 instanceof String)) {
                                    obj5 = null;
                                }
                                str2 = (String) obj5;
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                            Object obj6 = map3.get("payload");
                            Map map6 = obj6 instanceof Map ? (Map) obj6 : null;
                            if (map6 == null) {
                                map = null;
                            } else {
                                Object obj7 = map6.get("value");
                                if (obj7 == null) {
                                    obj7 = map6.get("payload");
                                }
                                if (!(obj7 instanceof Map)) {
                                    obj7 = null;
                                }
                                map = (Map) obj7;
                            }
                            vhkVar = new vhk(str2, str, map);
                        }
                        if (vhkVar != null) {
                            arrayList2.add(vhkVar);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            p6kVar.executeAction((vhk) it.next());
                        } catch (Throwable th) {
                            String message = th.getMessage();
                            if (message == null) {
                                message = th.toString();
                            }
                            ((a) z22Var).a(new iqy(message));
                        }
                    }
                    break;
                }
                break;
            default:
                Map map7 = w3kVar.a;
                Object obj8 = map7.get("event_name");
                String str3 = obj8 instanceof String ? (String) obj8 : null;
                if (str3 != null) {
                    Object obj9 = map7.get("params");
                    Map map8 = obj9 instanceof Map ? (Map) obj9 : null;
                    if (map8 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map8.size()));
                        for (Map.Entry entry : map8.entrySet()) {
                            linkedHashMap.put(String.valueOf(entry.getKey()), entry.getValue());
                        }
                        map2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            map2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                        }
                    }
                    if (map2 == null) {
                        map2 = b.f();
                    }
                    ((a) z22Var).a(new keo(str3, map2));
                    break;
                }
                break;
        }
    }
}
