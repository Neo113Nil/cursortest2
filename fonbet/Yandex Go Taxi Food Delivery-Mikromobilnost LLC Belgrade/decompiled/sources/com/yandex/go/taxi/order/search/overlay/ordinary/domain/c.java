package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(SearchState searchState, Continuation continuation) {
        OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1 ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1;
        int i;
        SearchState searchState2;
        DriverCandidate driverCandidate;
        if (continuation instanceof OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1) {
            ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1 = (OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1) continuation;
            int i2 = ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.label;
                d dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DriverCandidate driverCandidate2 = searchState.l;
                    ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.L$0 = searchState;
                    ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.L$1 = driverCandidate2;
                    ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.label = 1;
                    Object a = d.a(dVar, driverCandidate2, ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    searchState2 = searchState;
                    driverCandidate = driverCandidate2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    driverCandidate = (DriverCandidate) ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.L$1;
                    searchState2 = (SearchState) ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                dVar.b.g(driverCandidate, (ImageProvider) obj);
                qv10.B(searchState2.f, dVar.h, null);
                return zy11.a;
            }
        }
        ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1 = new OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1(this, continuation);
        Object obj2 = ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1.label;
        d dVar2 = this.a;
        if (i != 0) {
        }
        dVar2.b.g(driverCandidate, (ImageProvider) obj2);
        qv10.B(searchState2.f, dVar2.h, null);
        return zy11.a;
    }
}
