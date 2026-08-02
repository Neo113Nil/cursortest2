package com.yandex.delivery.map_filters.ui;

import defpackage.d6r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.x5r;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00060\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lx5r;", "filtersData", "", "", "", "", "Lcom/yandex/delivery/map_filters/model/FilterMeta;", "selectedFilters", "Ld6r;", "<anonymous>", "(Lx5r;Ljava/util/List;)Ld6r;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.map_filters.ui.FiltersViewModel$filterStateflow$1", f = "FiltersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class FiltersViewModel$filterStateflow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FiltersViewModel$filterStateflow$1 filtersViewModel$filterStateflow$1 = new FiltersViewModel$filterStateflow$1(3, (Continuation) obj3);
        filtersViewModel$filterStateflow$1.L$0 = (x5r) obj;
        filtersViewModel$filterStateflow$1.L$1 = (List) obj2;
        return filtersViewModel$filterStateflow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x5r x5rVar = (x5r) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        x5r.a aVar = x5rVar.a;
        String str = aVar.a;
        String str2 = aVar.b;
        List<x5r.a.b> list2 = aVar.c;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (x5r.a.b bVar : list2) {
            String str3 = bVar.a;
            List<x5r.a.C0132a> list3 = bVar.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            for (x5r.a.C0132a c0132a : list3) {
                String str4 = c0132a.a;
                Map map = c0132a.c;
                arrayList2.add(new d6r.a(str4, list.contains(map), map));
            }
            arrayList.add(new d6r.b(str3, arrayList2));
        }
        return new d6r(str, str2, arrayList);
    }
}
