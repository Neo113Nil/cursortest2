package com.yandex.go.tariffcard.ui;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tix0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class v implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ tix0 b;

    public v(tpr[] tprVarArr, tix0 tix0Var) {
        this.a = tprVarArr;
        this.b = tix0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1 tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1) {
            tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1 = (TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 8);
                    TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$3 tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$3 = new TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$3(null, false, this.b);
                    tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.L$0 = null;
                    tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.L$1 = null;
                    tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.L$2 = null;
                    tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, akt0Var, tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$3, tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1, tprVarArr) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1 = new TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1(this, continuation);
        Object obj2 = tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
