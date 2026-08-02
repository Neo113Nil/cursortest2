package com.yandex.go.chargers.misc.popup;

import defpackage.ana;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.uma;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ana b;
    public final /* synthetic */ uma c;

    public b(tpr tprVar, ana anaVar, uma umaVar) {
        this.a = tprVar;
        this.b = anaVar;
        this.c = umaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1 chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
