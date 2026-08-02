package com.yandex.go.chargers.order.active;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public g(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) {
            chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 = (ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((rl9) obj).a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((taa) obj2).a(), this.b.F)) {
                            break;
                        }
                    }
                    chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$0 = null;
                    chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$1 = null;
                    chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$2 = null;
                    chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.L$3 = null;
                    chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1 = new ChargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1(this, continuation);
        Object obj32 = chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderPresenter$listenOrderStatusForNavigating$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
