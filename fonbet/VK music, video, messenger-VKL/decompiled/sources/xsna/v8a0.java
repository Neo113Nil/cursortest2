package xsna;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a9a0;
import xsna.q8a0;
import xsna.y8a0;

/* compiled from: PhotoFlowSettingsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8a0 extends FunctionReferenceImpl implements izs<y8a0, a9a0.b> {
    @Override // xsna.izs
    public final a9a0.b invoke(y8a0 y8a0Var) {
        List list;
        ArrayList arrayList;
        y8a0 y8a0Var2 = y8a0Var;
        w8a0 w8a0Var = (w8a0) this.receiver;
        w8a0Var.getClass();
        List<q8a0.a> list2 = y8a0Var2.b;
        y8a0.a aVar = y8a0Var2.c;
        if (list2 != null) {
            epx.f(aVar, y8a0.a.b.a);
        }
        a9a0.b.a aVar2 = null;
        Throwable th = aVar instanceof y8a0.a.C4085a ? ((y8a0.a.C4085a) aVar).a : null;
        if (list2 != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (hashSet.add(Integer.valueOf(((q8a0.a) obj).a().b))) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((q8a0.a) next).a().b != -15) {
                    arrayList3.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Boolean valueOf = Boolean.valueOf(((q8a0.a) next2).a().x);
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(next2);
            }
            List list3 = (List) linkedHashMap.get(Boolean.TRUE);
            if (list3 != null) {
                List<q8a0.a> list4 = list3;
                arrayList = new ArrayList(c5g.u(list4, 10));
                for (q8a0.a aVar3 : list4) {
                    if (aVar3.b() != y8a0Var2.e.getOrDefault(Integer.valueOf(aVar3.a().b), Boolean.valueOf(aVar3.b())).booleanValue()) {
                        if (aVar3 instanceof q8a0.a.C3553a) {
                            q8a0.a.C3553a c3553a = (q8a0.a.C3553a) aVar3;
                            aVar3 = new q8a0.a.C3553a(c3553a.c, !c3553a.d, c3553a.e);
                        } else {
                            if (!(aVar3 instanceof q8a0.a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3 = new q8a0.a.b(((q8a0.a.b) aVar3).c, !r6.d);
                        }
                    }
                    arrayList.add(aVar3);
                }
            } else {
                arrayList = null;
            }
            List list5 = (List) linkedHashMap.get(Boolean.FALSE);
            ListBuilder e = e43.e();
            if (arrayList != null && !arrayList.isEmpty()) {
                e.add(q8a0.b.c.a);
                e.addAll(arrayList);
            }
            List list6 = list5;
            if (list6 != null && !list6.isEmpty()) {
                if (w8a0Var.d) {
                    e.add(q8a0.b.a.a);
                } else {
                    e.add(q8a0.b.C3554b.a);
                }
                e.addAll(j5g.R(list5));
            }
            list = e.g();
        } else {
            list = EmptyList.b;
        }
        y8a0.a aVar4 = y8a0Var2.d;
        if (aVar4 != null) {
            if (aVar4.equals(y8a0.a.b.a)) {
                aVar2 = a9a0.b.a.C2533b.a;
            } else {
                if (!(aVar4 instanceof y8a0.a.C4085a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = new a9a0.b.a.C2532a();
            }
        }
        return new a9a0.b(list, aVar2, th);
    }
}
