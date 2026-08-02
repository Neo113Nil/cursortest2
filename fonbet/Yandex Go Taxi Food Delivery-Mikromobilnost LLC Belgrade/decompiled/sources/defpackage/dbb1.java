package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes11.dex */
public abstract class dbb1 {
    public static final igr0 a(fid fidVar) {
        return ((ry2) ((bts) fidVar).m(uy2.a)).b ? jgr0.b : jgr0.e;
    }

    public static final igr0 b(fid fidVar) {
        return ((ry2) ((bts) fidVar).m(uy2.a)).b ? jgr0.a : jgr0.d;
    }

    public static final igr0 c(fid fidVar) {
        return ((ry2) ((bts) fidVar).m(uy2.a)).b ? jgr0.c : jgr0.f;
    }

    public static final b d(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj instanceof String) {
            return qcx.c((String) obj);
        }
        if (obj instanceof Number) {
            return qcx.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return qcx.a((Boolean) obj);
        }
        if (obj instanceof Character) {
            return qcx.c(String.valueOf(((Character) obj).charValue()));
        }
        if (obj instanceof Map) {
            Set<Map.Entry> entrySet = ((Map) obj).entrySet();
            int d = gw00.d(tcc.n(entrySet, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Map.Entry entry : entrySet) {
                Pair pair = new Pair(String.valueOf(entry.getKey()), d(entry.getValue()));
                linkedHashMap.put(pair.c(), pair.f());
            }
            return new c(linkedHashMap);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(d(it.next()));
            }
            return new a(arrayList);
        }
        if (obj instanceof Iterable) {
            xbx xbxVar = new xbx();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                xbxVar.a(d(it2.next()));
            }
            return xbxVar.b();
        }
        int i = 0;
        if (obj instanceof Object[]) {
            xbx xbxVar2 = new xbx();
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                xbxVar2.a(d(objArr[i]));
                i++;
            }
            return xbxVar2.b();
        }
        if (obj instanceof int[]) {
            xbx xbxVar3 = new xbx();
            int[] iArr = (int[]) obj;
            int length2 = iArr.length;
            while (i < length2) {
                xbxVar3.a(qcx.b(Integer.valueOf(iArr[i])));
                i++;
            }
            return xbxVar3.b();
        }
        if (obj instanceof long[]) {
            xbx xbxVar4 = new xbx();
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            while (i < length3) {
                xbxVar4.a(qcx.b(Long.valueOf(jArr[i])));
                i++;
            }
            return xbxVar4.b();
        }
        if (obj instanceof double[]) {
            xbx xbxVar5 = new xbx();
            double[] dArr = (double[]) obj;
            int length4 = dArr.length;
            while (i < length4) {
                xbxVar5.a(qcx.b(Double.valueOf(dArr[i])));
                i++;
            }
            return xbxVar5.b();
        }
        if (obj instanceof float[]) {
            xbx xbxVar6 = new xbx();
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            while (i < length5) {
                xbxVar6.a(qcx.b(Float.valueOf(fArr[i])));
                i++;
            }
            return xbxVar6.b();
        }
        if (obj instanceof boolean[]) {
            xbx xbxVar7 = new xbx();
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                xbxVar7.a(qcx.a(Boolean.valueOf(zArr[i])));
                i++;
            }
            return xbxVar7.b();
        }
        if (obj instanceof short[]) {
            xbx xbxVar8 = new xbx();
            short[] sArr = (short[]) obj;
            int length7 = sArr.length;
            while (i < length7) {
                xbxVar8.a(qcx.b(Integer.valueOf(sArr[i])));
                i++;
            }
            return xbxVar8.b();
        }
        if (obj instanceof char[]) {
            xbx xbxVar9 = new xbx();
            char[] cArr = (char[]) obj;
            int length8 = cArr.length;
            while (i < length8) {
                xbxVar9.a(qcx.c(String.valueOf(cArr[i])));
                i++;
            }
            return xbxVar9.b();
        }
        if (!(obj instanceof byte[])) {
            vg10.g(qoi0.a(obj.getClass()), "Unsupported type: ");
            return null;
        }
        xbx xbxVar10 = new xbx();
        byte[] bArr = (byte[]) obj;
        int length9 = bArr.length;
        while (i < length9) {
            xbxVar10.a(qcx.b(Integer.valueOf(bArr[i])));
            i++;
        }
        return xbxVar10.b();
    }
}
