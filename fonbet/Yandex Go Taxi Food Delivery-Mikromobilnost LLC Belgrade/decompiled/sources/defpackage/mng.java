package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class mng {
    public final LinkedHashMap a = new LinkedHashMap();

    public final ong a() {
        ong ongVar = new ong(this.a);
        bb1.O(ongVar);
        return ongVar;
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            obj = null;
        } else {
            g0c a = qoi0.a(obj.getClass());
            if (!a.equals(qoi0.a(Boolean.TYPE)) && !a.equals(qoi0.a(Byte.TYPE)) && !a.equals(qoi0.a(Integer.TYPE)) && !a.equals(qoi0.a(Long.TYPE)) && !a.equals(qoi0.a(Float.TYPE)) && !a.equals(qoi0.a(Double.TYPE)) && !a.equals(qoi0.a(String.class)) && !a.equals(qoi0.a(Boolean[].class)) && !a.equals(qoi0.a(Byte[].class)) && !a.equals(qoi0.a(Integer[].class)) && !a.equals(qoi0.a(Long[].class)) && !a.equals(qoi0.a(Float[].class)) && !a.equals(qoi0.a(Double[].class)) && !a.equals(qoi0.a(String[].class))) {
                if (a.equals(qoi0.a(boolean[].class))) {
                    obj = eqg.a((boolean[]) obj);
                } else if (a.equals(qoi0.a(byte[].class))) {
                    obj = eqg.b((byte[]) obj);
                } else if (a.equals(qoi0.a(int[].class))) {
                    obj = eqg.e((int[]) obj);
                } else if (a.equals(qoi0.a(long[].class))) {
                    obj = eqg.f((long[]) obj);
                } else if (a.equals(qoi0.a(float[].class))) {
                    obj = eqg.d((float[]) obj);
                } else {
                    if (!a.equals(qoi0.a(double[].class))) {
                        w511.l("Key ", str, " has invalid type ", a);
                        return;
                    }
                    obj = eqg.c((double[]) obj);
                }
            }
        }
        this.a.put(str, obj);
    }

    public final void c(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            b(entry.getValue(), (String) entry.getKey());
        }
    }
}
