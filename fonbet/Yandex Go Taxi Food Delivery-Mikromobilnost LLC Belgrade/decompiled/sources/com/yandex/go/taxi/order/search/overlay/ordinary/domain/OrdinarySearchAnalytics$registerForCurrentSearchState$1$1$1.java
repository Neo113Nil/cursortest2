package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/state/search/SearchState;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1", f = "OrdinarySearchAnalytics.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<SearchState> $states;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1(Set set, Continuation continuation) {
        super(2, continuation);
        this.$states = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1 ordinarySearchAnalytics$registerForCurrentSearchState$1$1$1 = new OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1(this.$states, continuation);
        ordinarySearchAnalytics$registerForCurrentSearchState$1$1$1.L$0 = obj;
        return ordinarySearchAnalytics$registerForCurrentSearchState$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdinarySearchAnalytics$registerForCurrentSearchState$1$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = this.$states.iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            SearchState searchState = (SearchState) it.next();
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            if (vprVar.emit(searchState, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
