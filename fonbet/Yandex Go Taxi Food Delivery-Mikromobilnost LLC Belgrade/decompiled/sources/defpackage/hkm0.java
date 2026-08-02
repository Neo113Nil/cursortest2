package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class hkm0 implements gkm0 {
    public final LinkedHashMap a;

    public hkm0(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ikm0 ikm0Var = (ikm0) it.next();
            Pair pair = new Pair(ikm0Var.a, ikm0Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        return (KSerializer) this.a.get(str);
    }
}
