package com.yandex.go.taxi.tariffs.internal.routestats.factory;

import defpackage.coe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lyne0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.factory.PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2", f = "PrefetchRouteStatsParamBuilderImpl.kt", l = {111}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $defaultTimeoutMillis;
    final /* synthetic */ List<coe0> $destinations;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2(List list, a aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$destinations = list;
        this.this$0 = aVar;
        this.$defaultTimeoutMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2 prefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2 = new PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2(this.$destinations, this.this$0, this.$defaultTimeoutMillis, continuation);
        prefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2.L$0 = obj;
        return prefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List<coe0> list = this.$destinations;
            a aVar = this.this$0;
            long j = this.$defaultTimeoutMillis;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1(aVar, j, (coe0) it.next(), null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
