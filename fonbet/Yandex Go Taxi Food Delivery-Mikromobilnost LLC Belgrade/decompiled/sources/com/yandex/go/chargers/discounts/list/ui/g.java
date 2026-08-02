package com.yandex.go.chargers.discounts.list.ui;

import defpackage.kgq0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ kgq0 b;

    public g(m0 m0Var, kgq0 kgq0Var) {
        this.a = m0Var;
        this.b = kgq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1 chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1) {
            chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1 = (ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1 = new ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
