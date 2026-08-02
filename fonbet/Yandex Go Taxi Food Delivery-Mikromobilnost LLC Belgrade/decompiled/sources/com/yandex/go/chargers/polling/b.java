package com.yandex.go.chargers.polling;

import defpackage.a2e0;
import defpackage.evu0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ k a;

    public b(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        pzt0 pzt0Var;
        Object obj2;
        Pair pair = (Pair) obj;
        Set set = (Set) pair.getFirst();
        Set set2 = (Set) pair.getSecond();
        k kVar = this.a;
        kVar.getClass();
        r0 r0Var = kVar.d;
        HashMap hashMap = new HashMap((Map) r0Var.getValue());
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            String g0 = evu0.g0(str, ":", str);
            String d0 = evu0.d0(str, ":", str);
            Iterator it2 = kVar.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((a2e0) obj2).a.equals(g0)) {
                    break;
                }
            }
            a2e0 a2e0Var = (a2e0) obj2;
            a aVar = a2e0Var != null ? new a(d0, kVar.a, kVar.e, kVar.f, a2e0Var) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a aVar2 = (a) it3.next();
            String str2 = aVar2.h;
            aVar2.i = tje.N(aVar2.c, null, null, new ChargersPolling$start$1(aVar2, null), 3);
            hashMap.put(str2, aVar2);
        }
        Iterator it4 = set2.iterator();
        while (it4.hasNext()) {
            a aVar3 = (a) hashMap.remove((String) it4.next());
            if (aVar3 != null && (pzt0Var = aVar3.i) != null) {
                pzt0Var.a(null);
            }
        }
        r0Var.emit(hashMap, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }
}
