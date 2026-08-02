package com.yandex.go.chargers.order.active;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.z8y;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public d0(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    rl9 rl9Var = (rl9) obj;
                    Iterator it = rl9Var.a.iterator();
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
                    z8y z8yVar = obj2 instanceof z8y ? (z8y) obj2 : null;
                    Pair pair = z8yVar == null ? null : new Pair(z8yVar, rl9Var.c);
                    if (pair != null) {
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pair, chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
