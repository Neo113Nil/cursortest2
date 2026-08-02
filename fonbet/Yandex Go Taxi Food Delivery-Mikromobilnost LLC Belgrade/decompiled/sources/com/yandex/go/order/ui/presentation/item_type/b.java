package com.yandex.go.order.ui.presentation.item_type;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x301;
import defpackage.zn70;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public b(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1 mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1) {
            mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1 = (MapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x301 x301Var = new x301(this.b, (zn70) obj);
                    mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x301Var, mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1 = new MapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapScreenTrackingCardItemInteractorImpl$toItemUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
