package com.yandex.go.chargers.order.preparing;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public f(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ChargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((rl9) obj).a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((taa) obj2).a(), this.b)) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj2, chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ChargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderPreparingUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
