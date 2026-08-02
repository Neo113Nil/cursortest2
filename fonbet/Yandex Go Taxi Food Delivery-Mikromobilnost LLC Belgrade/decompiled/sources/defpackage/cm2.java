package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cm2 extends vfx {
    public static final cm2 a = new cm2();
    public static final asq0 b = d6z.g("kotlin.Any", new SerialDescriptor[0]);

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable c(b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        boolean z = bVar instanceof c;
        cm2 cm2Var = a;
        if (z) {
            Map map = (Map) bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                b bVar2 = (b) entry.getValue();
                cm2Var.getClass();
                linkedHashMap.put(key, c(bVar2));
            }
            return linkedHashMap;
        }
        if (bVar instanceof a) {
            Iterable<b> iterable = (Iterable) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            for (b bVar3 : iterable) {
                cm2Var.getClass();
                arrayList.add(c(bVar3));
            }
            return arrayList;
        }
        if (!(bVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) bVar;
        if (dVar.b()) {
            return dVar.a();
        }
        String a2 = dVar.a();
        Boolean j0 = evu0.j0(a2);
        return j0 == null ? evu0.y(a2, Extension.DOT_CHAR, false) ? Double.valueOf(Double.parseDouble(a2)) : Long.valueOf(Long.parseLong(a2)) : j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Object obj) {
        b bVar;
        boolean z = obj instanceof Map;
        cm2 cm2Var = a;
        if (z) {
            MapBuilder mapBuilder = new MapBuilder();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    String valueOf = String.valueOf(key);
                    cm2Var.getClass();
                    mapBuilder.put(valueOf, d(value));
                }
            }
            return new c(mapBuilder.j());
        }
        if (!(obj instanceof Collection)) {
            return obj instanceof Number ? qcx.b((Number) obj) : obj instanceof Boolean ? qcx.a((Boolean) obj) : qcx.c(obj.toString());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 != null) {
                cm2Var.getClass();
                bVar = d(obj2);
            }
            bVar = JsonNull.INSTANCE;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return new a(arrayList);
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        Serializable c = c(ncxVar.t());
        if (c != null) {
            return c;
        }
        yci0.m("AnySerializer does not support null value");
        return null;
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        vcxVar.p(d(obj));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
