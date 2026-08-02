package com.yandex.go.tariffcard.ui;

import defpackage.ny61;
import defpackage.tix0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements tpr {
    public final /* synthetic */ ru.yandex.taxi.preorder.summary.tariffpage.badge.d a;
    public final /* synthetic */ tix0 b;

    public o(ru.yandex.taxi.preorder.summary.tariffpage.badge.d dVar, tix0 tix0Var) {
        this.a = dVar;
        this.b = tix0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1 tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1) {
            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1 = (TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.L$0 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.L$1 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.L$2 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1 = new TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
