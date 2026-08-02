package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.controller.BidsControllerAction;
import defpackage.avj0;
import defpackage.gyh0;
import defpackage.j0;
import defpackage.mej;
import defpackage.ny61;
import defpackage.pp5;
import defpackage.xq5;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final pp5 a;
    public final zuj0 b;
    public final com.yandex.go.rida.bids.data.a c;

    public a(pp5 pp5Var, zuj0 zuj0Var, com.yandex.go.rida.bids.data.a aVar) {
        this.a = pp5Var;
        this.b = zuj0Var;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, xq5 xq5Var, ContinuationImpl continuationImpl) {
        AcceptBidInteractor$acceptBid$1 acceptBidInteractor$acceptBid$1;
        int i;
        Boolean bool;
        if (continuationImpl instanceof AcceptBidInteractor$acceptBid$1) {
            acceptBidInteractor$acceptBid$1 = (AcceptBidInteractor$acceptBid$1) continuationImpl;
            int i2 = acceptBidInteractor$acceptBid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptBidInteractor$acceptBid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = acceptBidInteractor$acceptBid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptBidInteractor$acceptBid$1.label;
                pp5 pp5Var = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((Boolean) kotlinx.coroutines.flow.e.d(pp5Var.d).a.getValue()).booleanValue()) {
                        j0 j0Var = new j0(3, this, str);
                        acceptBidInteractor$acceptBid$1.L$0 = str;
                        acceptBidInteractor$acceptBid$1.L$1 = xq5Var;
                        acceptBidInteractor$acceptBid$1.label = 1;
                        obj = this.c.a(str, j0Var, acceptBidInteractor$acceptBid$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xq5Var = (xq5) acceptBidInteractor$acceptBid$1.L$1;
                str = (String) acceptBidInteractor$acceptBid$1.L$0;
                kotlin.b.b(obj);
                bool = (Boolean) obj;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        pp5Var.b(str, BidsControllerAction.OnAcceptSuccess);
                        return zy11Var;
                    }
                    int i3 = gyh0.rida_bids_accept_error_title;
                    avj0 avj0Var = (avj0) this.b;
                    ((com.yandex.go.rida.bids.router.d) xq5Var).b(new mej(avj0Var.h(i3), avj0Var.h(gyh0.rida_bids_accept_error_text), null, avj0Var.h(gyh0.rida_bids_accept_error_button)), new AcceptBidInteractor$acceptBid$2(this, str, null), new AcceptBidInteractor$acceptBid$3(this, str, null));
                }
                return zy11Var;
            }
        }
        acceptBidInteractor$acceptBid$1 = new AcceptBidInteractor$acceptBid$1(this, continuationImpl);
        Object obj2 = acceptBidInteractor$acceptBid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptBidInteractor$acceptBid$1.label;
        pp5 pp5Var2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool != null) {
        }
        return zy11Var2;
    }
}
