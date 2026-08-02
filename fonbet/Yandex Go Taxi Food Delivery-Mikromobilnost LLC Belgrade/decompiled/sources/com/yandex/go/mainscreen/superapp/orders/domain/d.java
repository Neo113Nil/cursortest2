package com.yandex.go.mainscreen.superapp.orders.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ h b;

    public d(tpr tprVar, h hVar) {
        this.a = tprVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1 superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1) {
            superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1 = (SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1) continuation;
            int i2 = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.L$0 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.L$1 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.L$2 = null;
                    superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1) == coroutineSingletons) {
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
        superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1 = new SuperAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenOrdersUiStateInteractor$observeTrackings$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
