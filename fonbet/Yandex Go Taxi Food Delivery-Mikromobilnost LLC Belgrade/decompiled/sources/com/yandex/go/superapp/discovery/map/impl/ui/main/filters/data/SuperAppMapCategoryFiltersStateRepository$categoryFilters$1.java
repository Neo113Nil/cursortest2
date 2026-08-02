package com.yandex.go.superapp.discovery.map.impl.ui.main.filters.data;

import defpackage.gtv0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lgtv0;", "filters", "selectedFilter", "<anonymous>", "(Ljava/util/List;Lgtv0;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.filters.data.SuperAppMapCategoryFiltersStateRepository$categoryFilters$1", f = "SuperAppMapCategoryFiltersStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SuperAppMapCategoryFiltersStateRepository$categoryFilters$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppMapCategoryFiltersStateRepository$categoryFilters$1 superAppMapCategoryFiltersStateRepository$categoryFilters$1 = new SuperAppMapCategoryFiltersStateRepository$categoryFilters$1(3, (Continuation) obj3);
        superAppMapCategoryFiltersStateRepository$categoryFilters$1.L$0 = (List) obj;
        superAppMapCategoryFiltersStateRepository$categoryFilters$1.L$1 = (gtv0) obj2;
        return superAppMapCategoryFiltersStateRepository$categoryFilters$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        gtv0 gtv0Var = (gtv0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<gtv0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (gtv0 gtv0Var2 : list2) {
            if (gtv0Var2.h) {
                gtv0Var2 = new gtv0(gtv0Var2.a, gtv0Var2.b, gtv0Var2.c, gtv0Var2.d, gtv0Var2.e, gtv0Var2.f, gtv0Var2.g, gtv0Var2.h, jl40.l(gtv0Var2.a, gtv0Var != null ? gtv0Var.a : null));
            }
            arrayList.add(gtv0Var2);
        }
        return arrayList;
    }
}
