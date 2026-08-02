package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public class lhh implements elb0 {
    public final r0 a;
    public final gci0 b;
    public final r0 c;
    public final gci0 d;

    public lhh() {
        r0 c = bvf0.c(b.f());
        this.a = c;
        this.b = e.d(c);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.c = c2;
        this.d = e.d(c2);
    }

    @Override // defpackage.elb0
    public final gci0 a() {
        return this.b;
    }

    @Override // defpackage.elb0
    public void b(mkb0 mkb0Var, okb0 okb0Var) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            List list = (List) linkedHashMap.get(okb0Var);
            Integer num = null;
            ArrayList arrayList = list != null ? new ArrayList(list) : null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (jl40.l(((mkb0) it.next()).getId(), mkb0Var.getId())) {
                        break;
                    } else {
                        i++;
                    }
                }
                num = Integer.valueOf(i);
            }
            if ((num == null || num.intValue() != -1) && num != null) {
                arrayList.set(num.intValue(), mkb0Var);
                linkedHashMap.put(okb0Var, arrayList);
            }
        } while (!r0Var.k(value, linkedHashMap));
    }

    @Override // defpackage.elb0
    public final void c(LinkedHashMap linkedHashMap) {
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, linkedHashMap);
    }

    @Override // defpackage.elb0
    public final gci0 d() {
        return this.d;
    }

    @Override // defpackage.elb0
    public void e(ikb0 ikb0Var, okb0 okb0Var) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(okb0Var, a.o0((Collection) map.getOrDefault(okb0Var, EmptyList.a), ikb0Var));
        } while (!r0Var.k(value, linkedHashMap));
    }

    @Override // defpackage.elb0
    public final void f(boolean z) {
        qv10.B(z, this.c, null);
    }

    @Override // defpackage.elb0
    public void g(String str, okb0 okb0Var) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            List list = (List) linkedHashMap.get(okb0Var);
            List arrayList = list != null ? new ArrayList(list) : null;
            if (arrayList != null) {
                arrayList.removeIf(new sdc(2, new wwb(str, 7)));
            }
            if (arrayList == null) {
                arrayList = EmptyList.a;
            }
            linkedHashMap.put(okb0Var, arrayList);
        } while (!r0Var.k(value, linkedHashMap));
    }

    public final void h(r5s r5sVar, List list, boolean z) {
        r0 r0Var;
        Object value;
        Map map;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
            map = (Map) value;
            if (!z || !map.containsKey(r5sVar)) {
                map = b.n(new LinkedHashMap(map), gw00.e(new Pair(r5sVar, list)));
            }
        } while (!r0Var.k(value, map));
    }
}
