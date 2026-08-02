package com.yandex.go.navigator.alt_select;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.hv1;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xb50;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ e b;

    public b(Ref$ObjectRef ref$ObjectRef, e eVar) {
        this.a = ref$ObjectRef;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1 altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1;
        int i;
        DrivingRoute drivingRoute;
        if (continuation instanceof AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1) {
            altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1 = (AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.label;
                e eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Ref$ObjectRef ref$ObjectRef = this.a;
                    if (!jl40.l(ref$ObjectRef.element, ((DrivingRoute) obj).getRouteId()) && eVar.z) {
                        ref$ObjectRef.element = null;
                        hv1 hv1Var = (hv1) eVar.Dg();
                        altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.L$0 = null;
                        altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.L$1 = null;
                        altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.L$2 = null;
                        altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.label = 1;
                        if (hv1Var.awaitFocusRectReady(altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                xb50 xb50Var = eVar.S;
                drivingRoute = (DrivingRoute) xb50Var.a.a.getValue();
                if (drivingRoute != null) {
                    xb50Var.a(drivingRoute, false);
                }
                eVar.W.g(Boolean.FALSE);
                return zy11.a;
            }
        }
        altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1 = new AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1.label;
        e eVar2 = this.b;
        if (i != 0) {
        }
        xb50 xb50Var2 = eVar2.S;
        drivingRoute = (DrivingRoute) xb50Var2.a.a.getValue();
        if (drivingRoute != null) {
        }
        eVar2.W.g(Boolean.FALSE);
        return zy11.a;
    }
}
