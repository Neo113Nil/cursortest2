package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.kb5;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ kb5 b;

    public n(kotlinx.coroutines.flow.internal.g gVar, kb5 kb5Var) {
        this.a = gVar;
        this.b = kb5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1 tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1) {
            tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1 = (TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.L$0 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.L$1 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.L$2 = null;
                    tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(mVar, tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1 = new TariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardSelectorUiStateInteractor$tariffCardSelectorUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
