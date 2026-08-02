package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.domain.repositories.f0;
import defpackage.b630;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jl40;
import defpackage.kc00;
import defpackage.o2y0;
import defpackage.q6y0;
import defpackage.r701;
import defpackage.t6y0;
import defpackage.tpr;
import defpackage.tse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class v implements r701 {
    public final tse a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final com.yandex.go.taxi.order.domain.interactors.s f;
    public final h3y g;
    public final h3y h;
    public final h3y i;
    public final t6y0 j;
    public final f0 k;
    public final jc00 l;
    public final com.yandex.go.taxi.order.promo_plaques.domain.c m;
    public final b630 n;
    public final com.yandex.go.taxi.order.details.v2.core.availability.m o;
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    public final r0 q;
    public final tpr r;

    public v(tse tseVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, com.yandex.go.taxi.order.domain.interactors.s sVar, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, t6y0 t6y0Var, f0 f0Var, jc00 jc00Var, com.yandex.go.taxi.order.promo_plaques.domain.c cVar, b630 b630Var, com.yandex.go.taxi.order.details.v2.core.availability.m mVar) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
        this.f = sVar;
        this.g = h3yVar5;
        this.h = h3yVar6;
        this.i = h3yVar7;
        this.j = t6y0Var;
        this.k = f0Var;
        this.l = jc00Var;
        this.m = cVar;
        this.n = b630Var;
        this.o = mVar;
        r0 c = bvf0.c(EmptyList.a);
        this.q = c;
        tpr uVar = new u(new s(new kotlinx.coroutines.flow.k(com.yandex.go.coroutines.b.d(c, new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1(this, null)), new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$2(this, null))), this);
        ic00 ic00Var = ((kc00) jc00Var).a;
        ic00Var.getClass();
        this.r = ic00Var instanceof hc00 ? uVar : kotlinx.coroutines.flow.e.X(uVar, new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1(this, null));
    }

    @Override // defpackage.r701
    public final tpr a() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(o2y0 o2y0Var, q6y0 q6y0Var) {
        r0 r0Var;
        Object value;
        List list;
        ArrayList arrayList;
        do {
            r0Var = this.q;
            value = r0Var.getValue();
            List list2 = (List) value;
            if (q6y0Var == null) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!jl40.l(String.valueOf(o2y0Var.hashCode()), ((q6y0) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                Iterator it = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (jl40.l(String.valueOf(o2y0Var.hashCode()), ((q6y0) it.next()).getId())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    list = kotlin.collections.a.m0(list2, Collections.singletonList(q6y0Var));
                } else {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.set(i, q6y0Var);
                    list = kotlin.collections.a.J0(arrayList2);
                }
                arrayList = list;
            }
        } while (!r0Var.k(value, arrayList));
    }
}
