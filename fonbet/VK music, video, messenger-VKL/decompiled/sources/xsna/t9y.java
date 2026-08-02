package xsna;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;
import xsna.z2m;

/* compiled from: JsonNamesMap.kt */
/* loaded from: classes8.dex */
public final class t9y {
    public static final z2m.a<Map<String, Integer>> a = new z2m.a<>();

    public static final int a(SerialDescriptor serialDescriptor, j8y j8yVar, String str) {
        q8y q8yVar = j8yVar.a;
        c(serialDescriptor, j8yVar);
        int g = serialDescriptor.g(str);
        if (g != -3 || !j8yVar.a.j) {
            return g;
        }
        z2m z2mVar = j8yVar.c;
        i5 i5Var = new i5(15, serialDescriptor, j8yVar);
        ConcurrentHashMap concurrentHashMap = z2mVar.a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        z2m.a<Map<String, Integer>> aVar = a;
        Object obj = map != null ? map.get(aVar) : null;
        Object obj2 = obj != null ? obj : null;
        if (obj2 == null) {
            obj2 = i5Var.invoke();
            Object obj3 = concurrentHashMap.get(serialDescriptor);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj3);
            }
            ((Map) obj3).put(aVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(SerialDescriptor serialDescriptor, j8y j8yVar, String str, String str2) {
        int a2 = a(serialDescriptor, j8yVar, str);
        if (a2 != -3) {
            return a2;
        }
        throw new SerializationException(serialDescriptor.f() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void c(SerialDescriptor serialDescriptor, j8y j8yVar) {
        if (epx.f(serialDescriptor.getKind(), prm0.a.a)) {
            q8y q8yVar = j8yVar.a;
        }
    }
}
