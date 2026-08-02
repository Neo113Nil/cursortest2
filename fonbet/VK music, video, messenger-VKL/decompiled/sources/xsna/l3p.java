package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: EditorAnimationsQueue.kt */
/* loaded from: classes4.dex */
public final class l3p {
    public static ConcurrentHashMap<String, List<izs<gzs<s3q0>, s3q0>>> a = new ConcurrentHashMap<>();
    public static LinkedHashMap b = new LinkedHashMap();

    public static void a(String str, izs izsVar) {
        List<izs<gzs<s3q0>, s3q0>> putIfAbsent;
        ConcurrentHashMap<String, List<izs<gzs<s3q0>, s3q0>>> concurrentHashMap = a;
        List<izs<gzs<s3q0>, s3q0>> list = concurrentHashMap.get(str);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (list = new ArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        List<izs<gzs<s3q0>, s3q0>> list2 = list;
        LinkedHashMap linkedHashMap = b;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = Boolean.FALSE;
            linkedHashMap.put(str, obj);
        }
        if (((Boolean) obj).booleanValue() || !list2.isEmpty()) {
            list2.add(izsVar);
        } else {
            b.put(str, Boolean.TRUE);
            izsVar.invoke(new ldl(str, 8));
        }
    }
}
