package com.yandex.go.taxi.order.search.ui.search_views;

import com.yandex.go.taxi.order.promotions.analytics.OrderPickupPointAnalytics$OrderStatus;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.jl40;
import defpackage.l380;
import defpackage.m380;
import defpackage.ny61;
import defpackage.sxp0;
import defpackage.txp0;
import defpackage.uxp0;
import defpackage.vpr;
import defpackage.vup0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ vup0 b;

    public a(vpr vprVar, vup0 vup0Var) {
        this.a = vprVar;
        this.b = vup0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SearchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1 searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SearchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1) {
            searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1 = (SearchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    uxp0 uxp0Var = (uxp0) pair.getFirst();
                    m380 m380Var = (m380) pair.getSecond();
                    vup0 vup0Var = this.b;
                    vup0Var.getClass();
                    boolean z = jl40.l(uxp0Var, new txp0(ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE, null, 0)) || (uxp0Var instanceof sxp0);
                    if ((m380Var instanceof l380) && !z) {
                        vup0Var.F.a(((l380) m380Var).a, OrderPickupPointAnalytics$OrderStatus.SEARCH);
                    }
                    searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uxp0Var, searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1 = new SearchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchMapPresenter$collectState$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
