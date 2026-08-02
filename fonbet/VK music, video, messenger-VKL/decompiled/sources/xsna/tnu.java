package xsna;

import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.i870;
import xsna.jnu;
import xsna.kb70;
import xsna.xh70;

/* compiled from: GroupedNotificationListReducer.kt */
/* loaded from: classes4.dex */
public final class tnu extends dm50<eou, jnu, wnu> {
    public final Object d;

    public tnu() {
        super(new wnu(0));
        this.d = msy.a(LazyThreadSafetyMode.NONE, new d2(15));
    }

    @Override // xsna.dm50
    public final wnu c(wnu wnuVar, jnu jnuVar) {
        Integer num;
        wnu wnuVar2 = wnuVar;
        jnu jnuVar2 = jnuVar;
        int i = wnuVar2.j;
        List<kb70> list = wnuVar2.i;
        if (jnuVar2 instanceof jnu.m) {
            return wnu.a(wnuVar2, oq.d(tlo0.Companion, ((jnu.m) jnuVar2).b), 0, null, false, false, false, null, 0, null, null, null, null, false, 16382);
        }
        if (jnuVar2.equals(jnu.l.b)) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, 0, null, null, null, null, false, 16381);
        }
        if (jnuVar2.equals(jnu.q.b)) {
            return wnu.a(wnuVar2, null, 0, null, false, true, false, null, 0, null, null, null, null, false, 16271);
        }
        if (jnuVar2.equals(jnu.p.b)) {
            return wnu.a(wnuVar2, null, 0, null, true, false, false, null, 0, null, null, null, null, false, 16271);
        }
        if (jnuVar2 instanceof jnu.f) {
            return wnu.a(wnuVar2, null, 0, null, false, false, true, EmptyList.b, 0, null, null, null, null, false, 16143);
        }
        if (jnuVar2 instanceof jnu.a) {
            jnu.a aVar = (jnu.a) jnuVar2;
            return wnu.a(wnuVar2, null, (!aVar.d || (num = wnuVar2.n) == null) ? aVar.c : num.intValue(), null, false, false, false, aVar.b, 0, null, null, null, Integer.valueOf(((int) (qni0.a() / 1000)) + 1), false, 12043);
        }
        if (jnuVar2.equals(jnu.g.b)) {
            return wnu.a(wnuVar2, null, 0, ListNextState.ERROR, false, false, false, null, 0, null, null, null, null, false, 16375);
        }
        if (jnuVar2.equals(jnu.h.b)) {
            return wnu.a(wnuVar2, null, 0, ListNextState.LOADING, false, false, false, null, 0, null, null, null, null, false, 16375);
        }
        if (jnuVar2 instanceof jnu.i) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, j5g.u0(((jnu.i) jnuVar2).b, list), 0, null, null, null, null, false, 16247);
        }
        if (jnuVar2.equals(jnu.o.b)) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, i + 1, xh70.b.a, null, null, null, false, 15615);
        }
        if (jnuVar2 instanceof jnu.r) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, i + 1, ((jnu.r) jnuVar2).b, null, null, null, false, 15615);
        }
        if (jnuVar2 instanceof jnu.k) {
            List<kb70> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (Object obj : list2) {
                if (obj instanceof kb70.d) {
                    kb70.d dVar = (kb70.d) obj;
                    jnu.k kVar = (jnu.k) jnuVar2;
                    if (epx.f(dVar.a, kVar.b)) {
                        i870 i870Var = dVar.k;
                        if (i870Var instanceof i870.a) {
                            obj = kb70.d.a(dVar, null, i870.a.a((i870.a) i870Var, kVar.c), null, 3071);
                        }
                    }
                }
                arrayList.add(obj);
            }
            return wnu.a(wnuVar2, null, 0, null, false, false, false, arrayList, 0, null, null, null, null, false, 16255);
        }
        if (jnuVar2 instanceof jnu.s) {
            List<kb70> list3 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (Object obj2 : list3) {
                if (obj2 instanceof kb70.d) {
                    kb70.d dVar2 = (kb70.d) obj2;
                    jnu.s sVar = (jnu.s) jnuVar2;
                    if (epx.f(dVar2.a, sVar.b)) {
                        obj2 = kb70.d.a(dVar2, null, new i870.b(sVar.c, sVar.d), null, 3071);
                    }
                }
                arrayList2.add(obj2);
            }
            return wnu.a(wnuVar2, null, 0, null, false, false, false, arrayList2, 0, null, null, null, null, false, 16255);
        }
        if (jnuVar2.equals(jnu.d.b)) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, 0, null, null, null, null, false, 15359);
        }
        if (jnuVar2 instanceof jnu.n) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, 0, null, ((jnu.n) jnuVar2).b, null, null, false, 15359);
        }
        if (jnuVar2 instanceof jnu.t) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, 0, null, null, null, null, ((jnu.t) jnuVar2).b, 8191);
        }
        if (jnuVar2 instanceof jnu.u) {
            return wnu.a(wnuVar2, null, 0, null, false, false, false, null, 0, null, null, ((jnu.u) jnuVar2).b, null, false, 14335);
        }
        if (jnuVar2 instanceof jnu.c) {
            jnu.c cVar = (jnu.c) jnuVar2;
            List<kb70> list4 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            for (Object obj3 : list4) {
                if (obj3 instanceof kb70.d) {
                    kb70.d dVar3 = (kb70.d) obj3;
                    if (epx.f(cVar.b, dVar3.a)) {
                        obj3 = kb70.d.a(dVar3, null, null, cVar.c, 2047);
                    }
                }
                arrayList3.add(obj3);
            }
            return wnu.a(wnuVar2, null, 0, null, false, false, false, arrayList3, 0, null, null, null, null, false, 16255);
        }
        if (!(jnuVar2 instanceof jnu.e)) {
            if (jnuVar2 instanceof jnu.b) {
                return wnu.a(wnuVar2, null, 0, null, false, false, false, rdi.A(((jnu.b) jnuVar2).b, list), 0, null, null, null, null, false, 16255);
            }
            if (!(jnuVar2 instanceof jnu.j)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList4 = new ArrayList(list);
            jnu.j jVar = (jnu.j) jnuVar2;
            arrayList4.add(jVar.b, jVar.c);
            s3q0 s3q0Var = s3q0.a;
            return wnu.a(wnuVar2, null, 0, null, false, false, false, arrayList4, 0, null, null, null, null, false, 16255);
        }
        jnu.e eVar = (jnu.e) jnuVar2;
        List<kb70> list5 = list;
        ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
        for (Object obj4 : list5) {
            if (obj4 instanceof kb70.d) {
                kb70.d dVar4 = (kb70.d) obj4;
                if (epx.f(eVar.b, dVar4.a)) {
                    obj4 = kb70.d.a(dVar4, null, null, null, 2047);
                }
            }
            arrayList5.add(obj4);
        }
        return wnu.a(wnuVar2, null, 0, null, false, false, false, arrayList5, 0, null, null, null, null, false, 16255);
    }

    @Override // xsna.dm50
    public final eou d() {
        return new eou(e(new gmj(this, 17)));
    }

    @Override // xsna.dm50
    public final void h(wnu wnuVar, eou eouVar) {
        f(eouVar.a, wnuVar);
    }
}
