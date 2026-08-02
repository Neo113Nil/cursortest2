package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.kb5;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements tpr {
    public final /* synthetic */ j a;
    public final /* synthetic */ kb5 b;

    public l(j jVar, kb5 kb5Var) {
        this.a = jVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1 scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1) {
            scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1 = (ScrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1 = new ScrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollButtonUiStateInteractor$getTariffCardExpandedStateFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
