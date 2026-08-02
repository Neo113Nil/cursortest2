package com.yandex.go.rida.bids.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1 bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1) {
            bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1 = (BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1) continuation;
            int i2 = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$0 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$1 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$2 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$5 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$6 = null;
                    bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label = 1;
                    Object a = i.a(this.b, (List) obj, bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$0 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$1 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$2 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$3 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$4 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$5 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$6 = null;
                bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1 = new BidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$0 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$1 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$2 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$3 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$4 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$5 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.L$6 = null;
        bidsListUiStateInteractor$bidsModelListFlow$$inlined$map$1$2$1.label = 2;
    }
}
