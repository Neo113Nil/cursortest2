package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import defpackage.n6w0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1 eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n6w0 n6w0Var = this.b.M;
                    SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type = SuperAppRecenterPointRepository$Type.EATS;
                    n6w0Var.getClass();
                    ArrayList b = n6w0Var.b(Collections.singletonList(superAppRecenterPointRepository$Type));
                    if (b.isEmpty()) {
                        b = null;
                    }
                    if (b != null) {
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(b, eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new EatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderDetailsRouter$launchRecenterJob$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
