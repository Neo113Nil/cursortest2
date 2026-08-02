package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ l b;

    public k(gci0 gci0Var, l lVar) {
        this.a = gci0Var;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtTicketsUiStateInteractor$special$$inlined$map$1$1 mtTicketsUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtTicketsUiStateInteractor$special$$inlined$map$1$1) {
            mtTicketsUiStateInteractor$special$$inlined$map$1$1 = (MtTicketsUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = mtTicketsUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    mtTicketsUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(jVar, mtTicketsUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        mtTicketsUiStateInteractor$special$$inlined$map$1$1 = new MtTicketsUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = mtTicketsUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
