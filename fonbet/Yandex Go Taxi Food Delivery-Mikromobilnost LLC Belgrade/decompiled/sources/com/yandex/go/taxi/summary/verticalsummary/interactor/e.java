package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ com.yandex.go.taxi.tariffs.repository.c a;

    public e(com.yandex.go.taxi.tariffs.repository.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1 tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (TariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new TariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
