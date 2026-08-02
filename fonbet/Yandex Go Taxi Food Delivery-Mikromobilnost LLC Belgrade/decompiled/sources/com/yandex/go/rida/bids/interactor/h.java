package com.yandex.go.rida.bids.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements tpr {
    public final /* synthetic */ com.yandex.go.rida.bids.controller.b a;
    public final /* synthetic */ i b;

    public h(com.yandex.go.rida.bids.controller.b bVar, i iVar) {
        this.a = bVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1 bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1) {
            bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1 = (BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1) continuation;
            int i2 = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.L$0 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.L$1 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.L$2 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1 = new BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
