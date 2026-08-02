package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import defpackage.gyu;
import defpackage.ny61;
import defpackage.sc31;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ArrayList b;

    public a(vpr vprVar, ArrayList arrayList) {
        this.a = vprVar;
        this.b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1 verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1) {
            verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1 = (VerticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1) continuation;
            int i2 = verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sc31 sc31Var = new sc31(this.b, (gyu) obj, null);
                    verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.L$0 = null;
                    verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.L$1 = null;
                    verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.L$2 = null;
                    verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.L$3 = null;
                    verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(sc31Var, verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1 = new VerticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV1UiStateInteractor$mapLoadingState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
