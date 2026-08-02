package com.yandex.go.superapp.order.multi.old.view;

import defpackage.bt00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1 orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1;
        int i;
        bt00 bt00Var;
        int i2;
        if (continuation instanceof OrderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1) {
            orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1 = (OrderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1) continuation;
            int i3 = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f fVar = this.a;
                    bt00Var = fVar.O;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3 = bt00Var;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.I$0 = 2;
                    orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 1;
                    Object Mg = f.Mg(fVar, orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1);
                    if (Mg == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = Mg;
                    i2 = 2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.I$0;
                    bt00Var = (bt00) orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3;
                    kotlin.b.b(obj2);
                }
                ((ru.yandex.taxi.map_common.style.source.e) bt00Var).c(i2, (String) obj2);
                return zy11.a;
            }
        }
        orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1 = new OrderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStackViewPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
        if (i != 0) {
        }
        ((ru.yandex.taxi.map_common.style.source.e) bt00Var).c(i2, (String) obj22);
        return zy11.a;
    }
}
