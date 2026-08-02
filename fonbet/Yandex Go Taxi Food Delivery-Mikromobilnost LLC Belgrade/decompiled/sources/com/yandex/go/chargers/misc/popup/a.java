package com.yandex.go.chargers.misc.popup;

import defpackage.ana;
import defpackage.bna;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.uma;
import defpackage.vpr;
import defpackage.zma;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ana b;
    public final /* synthetic */ uma c;

    public a(vpr vprVar, ana anaVar, uma umaVar) {
        this.a = vprVar;
        this.b = anaVar;
        this.c = umaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bna bnaVar = this.b.c;
                    bnaVar.getClass();
                    uma umaVar = this.c;
                    String str = umaVar.b;
                    zma zmaVar = new zma(umaVar.a, umaVar.c, str != null ? ((m7x0) bnaVar.a).a(str) : null);
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zmaVar, chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new ChargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPopupUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
