package xsna;

import com.google.crypto.tink.shaded.protobuf.MapFieldLite;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class jl00 implements il00 {
    @Override // xsna.il00
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.k()) {
                mapFieldLite = mapFieldLite.n();
            }
            mapFieldLite.m(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // xsna.il00
    public final void b(Object obj) {
        ((dl00) obj).getClass();
    }

    @Override // xsna.il00
    public final Object c(Object obj) {
        ((MapFieldLite) obj).l();
        return obj;
    }

    @Override // xsna.il00
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // xsna.il00
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // xsna.il00
    public final MapFieldLite f() {
        return MapFieldLite.i().n();
    }

    @Override // xsna.il00
    public final int g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        dl00 dl00Var = (dl00) obj2;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        dl00Var.getClass();
        dl00.a(i);
        throw null;
    }

    @Override // xsna.il00
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).k();
    }
}
