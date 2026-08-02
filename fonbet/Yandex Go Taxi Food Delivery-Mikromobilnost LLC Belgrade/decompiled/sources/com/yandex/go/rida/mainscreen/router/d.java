package com.yandex.go.rida.mainscreen.router;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ e b;

    public d(g gVar, e eVar) {
        this.a = gVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1 ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof RidaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1) {
            ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1 = (RidaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1) continuation;
            int i2 = ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.L$0 = null;
                    ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.L$1 = null;
                    ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.L$2 = null;
                    ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(cVar, ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1 = new RidaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAppMainScreenRouterImpl$multiOrderProviderFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
