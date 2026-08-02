package com.yandex.go.chargers.order.active;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e0 implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ String b;

    public e0(gci0 gci0Var, String str) {
        this.a = gci0Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) {
            chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 = (ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar, this.b);
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.a.collect(d0Var, chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1 = new ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
