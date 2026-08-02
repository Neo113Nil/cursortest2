package defpackage;

import defpackage.iyi;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonDecodingException;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public abstract class ddx {
    public static final iyi.a a = new iyi.a();

    static {
        new iyi.a();
    }

    public static final void a(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i) {
        String str2 = jl40.l(serialDescriptor.getKind(), fsq0.g) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        String str3 = "The suggested name '" + str + "' for " + str2 + HexString.CHAR_SPACE + serialDescriptor.f(i) + " is already one of the names for " + str2 + HexString.CHAR_SPACE + serialDescriptor.f(((Number) b.g(str, linkedHashMap)).intValue()) + " in " + serialDescriptor;
        throw new JsonDecodingException(qje.n(-1, str3, null, null, null), str3, null, null, -1, null);
    }

    public static final int b(SerialDescriptor serialDescriptor, sbx sbxVar, String str) {
        Object obj;
        iyi iyiVar = sbxVar.c;
        ccx ccxVar = sbxVar.a;
        boolean z = ccxVar.k;
        int i = 27;
        iyi.a aVar = a;
        if (z && jl40.l(serialDescriptor.getKind(), fsq0.g)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            ou ouVar = new ou(i, serialDescriptor, sbxVar);
            ConcurrentHashMap concurrentHashMap = iyiVar.a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj2 = map != null ? map.get(aVar) : null;
            obj = obj2 != null ? obj2 : null;
            if (obj == null) {
                obj = ouVar.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(aVar, obj);
            }
            Integer num = (Integer) ((Map) obj).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        e(sbxVar, serialDescriptor);
        int c = serialDescriptor.c(str);
        if (c != -3 || !ccxVar.j) {
            return c;
        }
        ou ouVar2 = new ou(i, serialDescriptor, sbxVar);
        ConcurrentHashMap concurrentHashMap2 = iyiVar.a;
        Map map2 = (Map) concurrentHashMap2.get(serialDescriptor);
        Object obj4 = map2 != null ? map2.get(aVar) : null;
        obj = obj4 != null ? obj4 : null;
        if (obj == null) {
            obj = ouVar2.invoke();
            Object obj5 = concurrentHashMap2.get(serialDescriptor);
            if (obj5 == null) {
                obj5 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(serialDescriptor, obj5);
            }
            ((Map) obj5).put(aVar, obj);
        }
        Integer num2 = (Integer) ((Map) obj).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int c(SerialDescriptor serialDescriptor, sbx sbxVar, String str, String str2) {
        int b = b(serialDescriptor, sbxVar, str);
        if (b != -3) {
            return b;
        }
        throw new SerializationException(serialDescriptor.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean d(sbx sbxVar, SerialDescriptor serialDescriptor) {
        if (sbxVar.a.b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof ycx) {
                return true;
            }
        }
        return false;
    }

    public static final void e(sbx sbxVar, SerialDescriptor serialDescriptor) {
        jl40.l(serialDescriptor.getKind(), ovu0.g);
    }
}
