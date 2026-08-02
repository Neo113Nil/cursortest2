package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class m5p {
    public static final l5p Companion = new l5p();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new cao(27)), null, null};
    public final transient Object a;
    public final String b;
    public final b c;

    public /* synthetic */ m5p(int i, Object obj, String str, b bVar) {
        b c;
        b cVar;
        if (1 != (i & 1)) {
            qje.Z(i, 1, k5p.a.getDescriptor());
            throw null;
        }
        this.a = obj;
        this.b = (i & 2) == 0 ? obj instanceof String ? "string" : obj instanceof Integer ? "int" : obj instanceof Long ? Constants.LONG : obj instanceof Double ? "double" : obj instanceof Float ? "float" : obj instanceof Boolean ? "boolean" : obj instanceof List ? "array" : obj instanceof Map ? "object" : obj == null ? "null" : "unknown" : str;
        if ((i & 4) != 0) {
            this.c = bVar;
            return;
        }
        if (obj instanceof String) {
            c = qcx.c((String) obj);
        } else if (obj instanceof Integer) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Long) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Double) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Float) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Boolean) {
            c = qcx.a((Boolean) obj);
        } else {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(new m5p(it.next()).c);
                }
                cVar = new kotlinx.serialization.json.a(arrayList);
            } else if (obj instanceof Map) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        linkedHashMap.put(key, new m5p(value).c);
                    }
                }
                cVar = new c(linkedHashMap);
            } else {
                c = obj == null ? JsonNull.INSTANCE : qcx.c(obj.toString());
            }
            c = cVar;
        }
        this.c = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5p)) {
            return false;
        }
        return jl40.l(this.a, ((m5p) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return qv10.p("FTAnyCodable(value=", Extension.C_BRAKE, this.a);
    }

    public m5p(Object obj) {
        String str;
        b c;
        this.a = obj;
        if (obj instanceof String) {
            str = "string";
        } else if (obj instanceof Integer) {
            str = "int";
        } else if (obj instanceof Long) {
            str = Constants.LONG;
        } else if (obj instanceof Double) {
            str = "double";
        } else if (obj instanceof Float) {
            str = "float";
        } else if (obj instanceof Boolean) {
            str = "boolean";
        } else if (obj instanceof List) {
            str = "array";
        } else if (obj instanceof Map) {
            str = "object";
        } else if (obj == null) {
            str = "null";
        } else {
            str = "unknown";
        }
        this.b = str;
        if (obj instanceof String) {
            c = qcx.c((String) obj);
        } else if (obj instanceof Integer) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Long) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Double) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Float) {
            c = qcx.b((Number) obj);
        } else if (obj instanceof Boolean) {
            c = qcx.a((Boolean) obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(new m5p(it.next()).c);
            }
            c = new kotlinx.serialization.json.a(arrayList);
        } else if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    linkedHashMap.put(key, new m5p(value).c);
                }
            }
            c = new c(linkedHashMap);
        } else if (obj == null) {
            c = JsonNull.INSTANCE;
        } else {
            c = qcx.c(obj.toString());
        }
        this.c = c;
    }
}
