package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e extends com.yandex.passport.common.domain.d {
    public static final a c = new a();
    public final com.yandex.passport.internal.flags.j b;

    public e(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.flags.j jVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = jVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        a aVar;
        String str;
        d dVar = (d) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        boolean booleanValue = ((Boolean) this.b.b(com.yandex.passport.internal.flags.q.r0)).booleanValue();
        Iterator it = dVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t2 t2Var = (t2) it.next();
            Uid a = t2Var.a();
            if (a == null || !booleanValue) {
                r2 r2Var = t2Var instanceof r2 ? (r2) t2Var : null;
                if (r2Var != null) {
                    arrayList.add(r2Var);
                }
            } else {
                Long l = new Long(a.getValue());
                Object obj2 = linkedHashMap.get(l);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(l, obj2);
                }
                ((Set) obj2).add(t2Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((r2) it2.next()).a.getAccountName());
        }
        Map map = dVar.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (arrayList4.contains((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        List x = iw00.x(linkedHashMap2);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            r2 r2Var2 = (r2) it3.next();
            if (r2Var2.a.isChild()) {
                Uid uid = r2Var2.a.getUid();
                Iterator it4 = x.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str = null;
                        break;
                    }
                    Pair pair = (Pair) it4.next();
                    str = (String) pair.getFirst();
                    if (((List) pair.getSecond()).contains(uid)) {
                        break;
                    }
                }
                if (str == null) {
                    arrayList3.add(r2Var2);
                } else {
                    arrayList2.add(new Pair(str, r2Var2));
                }
            } else {
                arrayList3.add(r2Var2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it5.hasNext();
            aVar = c;
            if (!hasNext) {
                break;
            }
            arrayList5.addAll(kotlin.collections.a.x0((Iterable) ((Map.Entry) it5.next()).getValue(), aVar));
        }
        for (r2 r2Var3 : kotlin.collections.a.x0(arrayList3, aVar)) {
            arrayList5.add(r2Var3);
            ArrayList arrayList6 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                if (jl40.l(((Pair) next).c(), r2Var3.a.getAccountName())) {
                    arrayList6.add(next);
                }
            }
            ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                arrayList7.add((r2) ((Pair) it7.next()).f());
            }
            arrayList5.addAll(kotlin.collections.a.x0(arrayList7, aVar));
        }
        return arrayList5;
    }
}
