package defpackage;

import com.yandex.mapkit.navigation.JamSegment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kj1 {
    public JamSegment a;
    public float b;
    public final LinkedHashMap c;

    public kj1(JamSegment jamSegment, float f) {
        this.a = jamSegment;
        this.b = f;
        this.c = b.l(new Pair(jamSegment, Float.valueOf(f)));
    }

    public final void a(kj1 kj1Var) {
        LinkedHashMap linkedHashMap;
        Object obj;
        JamSegment jamSegment;
        this.b += kj1Var.b;
        Iterator it = kj1Var.c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.c;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            JamSegment jamSegment2 = (JamSegment) entry.getKey();
            linkedHashMap.put(jamSegment2, Float.valueOf(((Number) linkedHashMap.getOrDefault(jamSegment2, Float.valueOf(0.0f))).floatValue() + ((Number) entry.getValue()).floatValue()));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                do {
                    Object next2 = it2.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 == null || (jamSegment = (JamSegment) entry2.getKey()) == null) {
            jamSegment = this.a;
        }
        this.a = jamSegment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return jl40.l(this.a, kj1Var.a) && Float.compare(this.b, kj1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatedSegment(type=" + this.a + ", distance=" + this.b + Extension.C_BRAKE;
    }
}
