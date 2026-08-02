package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class dy implements cy {
    public final LinkedHashMap a;

    public dy(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mu muVar = (mu) it.next();
            Pair pair = new Pair(muVar.a, muVar.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        sls slsVar = (sls) this.a.get(str);
        if (slsVar != null) {
            return (KSerializer) slsVar.invoke();
        }
        return null;
    }
}
