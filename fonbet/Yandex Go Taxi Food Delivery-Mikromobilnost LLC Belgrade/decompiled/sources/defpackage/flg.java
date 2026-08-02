package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class flg {
    public final r0 a = bvf0.c(b.f());

    public final void a(ArrayList arrayList) {
        r0 r0Var = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.getFirst();
            Boolean bool = (Boolean) pair.getSecond();
            bool.getClass();
            linkedHashMap.put(str, bool);
        }
        r0Var.getClass();
        r0Var.m(null, linkedHashMap);
    }
}
