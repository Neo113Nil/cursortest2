package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.controller.BidsControllerAction;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pp5;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class u {
    public final pp5 a;
    public final com.yandex.go.rida.bids.data.a b;

    public u(pp5 pp5Var, com.yandex.go.rida.bids.data.a aVar) {
        this.a = pp5Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        RejectBidInteractor$rejectBid$1 rejectBidInteractor$rejectBid$1;
        int i;
        if (continuationImpl instanceof RejectBidInteractor$rejectBid$1) {
            rejectBidInteractor$rejectBid$1 = (RejectBidInteractor$rejectBid$1) continuationImpl;
            int i2 = rejectBidInteractor$rejectBid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rejectBidInteractor$rejectBid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rejectBidInteractor$rejectBid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rejectBidInteractor$rejectBid$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                pp5 pp5Var = this.a;
                if (!((Boolean) kotlinx.coroutines.flow.e.d(pp5Var.d).a.getValue()).booleanValue()) {
                    com.yandex.go.rida.bids.data.a aVar = this.b;
                    if (!jl40.l((String) aVar.h.a.getValue(), str)) {
                        pp5Var.b(str, BidsControllerAction.OnCancelRequested);
                        rejectBidInteractor$rejectBid$1.L$0 = null;
                        rejectBidInteractor$rejectBid$1.L$1 = null;
                        rejectBidInteractor$rejectBid$1.label = 1;
                        if (aVar.d(str, rejectBidInteractor$rejectBid$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        rejectBidInteractor$rejectBid$1 = new RejectBidInteractor$rejectBid$1(this, continuationImpl);
        Object obj2 = rejectBidInteractor$rejectBid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rejectBidInteractor$rejectBid$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
