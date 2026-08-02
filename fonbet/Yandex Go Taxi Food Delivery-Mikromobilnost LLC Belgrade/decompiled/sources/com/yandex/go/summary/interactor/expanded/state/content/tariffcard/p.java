package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.fnx0;
import defpackage.ndx0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ ndx0 b;
    public final /* synthetic */ fnx0 c;

    public p(kotlinx.coroutines.flow.internal.g gVar, ndx0 ndx0Var, fnx0 fnx0Var) {
        this.a = gVar;
        this.b = ndx0Var;
        this.c = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) {
            tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 = (TariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) continuation;
            int i2 = tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar, this.b, this.c);
                    tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$0 = null;
                    tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$1 = null;
                    tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.L$2 = null;
                    tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(oVar, tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1 = new TariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardSelectorUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
