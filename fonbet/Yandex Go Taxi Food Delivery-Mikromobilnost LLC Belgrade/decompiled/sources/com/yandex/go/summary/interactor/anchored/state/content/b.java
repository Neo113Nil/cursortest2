package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.fnx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AuctionUiStateInteractor$special$$inlined$map$1$2$1 auctionUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AuctionUiStateInteractor$special$$inlined$map$1$2$1) {
            auctionUiStateInteractor$special$$inlined$map$1$2$1 = (AuctionUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = auctionUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                auctionUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = auctionUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = auctionUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mi31 mi31Var = ((fnx0) obj).a;
                    auctionUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    auctionUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    auctionUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    auctionUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    auctionUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mi31Var, auctionUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        auctionUiStateInteractor$special$$inlined$map$1$2$1 = new AuctionUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = auctionUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = auctionUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
