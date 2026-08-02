package com.yandex.go.tariffcard.ui;

import defpackage.iix0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements tpr {
    public final /* synthetic */ com.yandex.go.tariffcard.experiment.q a;
    public final /* synthetic */ iix0 b;

    public h(com.yandex.go.tariffcard.experiment.q qVar, iix0 iix0Var) {
        this.a = qVar;
        this.b = iix0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) {
            tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 = (TariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(gVar, tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 = new TariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
