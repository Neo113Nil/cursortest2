package com.yandex.go.places.impl.data.repositories.map;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import defpackage.ibc0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Libc0;", "filters", "selectedFilter", "<anonymous>", "(Ljava/util/List;Libc0;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.data.repositories.map.PlacesCategoryFiltersStateRepository$categoryFilters$1", f = "PlacesCategoryFiltersStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesCategoryFiltersStateRepository$categoryFilters$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesCategoryFiltersStateRepository$categoryFilters$1 placesCategoryFiltersStateRepository$categoryFilters$1 = new PlacesCategoryFiltersStateRepository$categoryFilters$1(3, (Continuation) obj3);
        placesCategoryFiltersStateRepository$categoryFilters$1.L$0 = (List) obj;
        placesCategoryFiltersStateRepository$categoryFilters$1.L$1 = (ibc0) obj2;
        return placesCategoryFiltersStateRepository$categoryFilters$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        ibc0 ibc0Var = (ibc0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<ibc0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ibc0 ibc0Var2 : list2) {
            if (ibc0Var2.g == CategoryFilterType.FAVOURITES) {
                ibc0Var2 = new ibc0(ibc0Var2.a, ibc0Var2.b, ibc0Var2.c, ibc0Var2.d, ibc0Var2.e, ibc0Var2.f, ibc0Var2.g, ibc0Var2.h, jl40.l(ibc0Var2.a, ibc0Var != null ? ibc0Var.a : null));
            }
            arrayList.add(ibc0Var2);
        }
        return arrayList;
    }
}
