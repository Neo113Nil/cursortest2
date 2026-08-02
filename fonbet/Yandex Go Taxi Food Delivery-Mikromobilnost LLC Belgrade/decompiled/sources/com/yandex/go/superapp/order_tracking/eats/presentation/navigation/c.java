package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.fi6;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1 eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1) {
            eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1 = (EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fi6 fi6Var = new fi6();
                    fi6Var.e((List) obj);
                    BoundingBox g = fi6Var.g();
                    eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g, eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1 = new EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
