package com.yandex.go.chargers.discounts.list.ui;

import defpackage.kgq0;
import defpackage.ny61;
import defpackage.sr9;
import defpackage.vpr;
import defpackage.zv9;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kgq0 b;

    public f(vpr vprVar, kgq0 kgq0Var) {
        this.a = vprVar;
        this.b = kgq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1 chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1) {
            chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1 = (ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zv9 zv9Var = new zv9((sr9) obj, this.b.c);
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zv9Var, chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1 = new ChargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateInteractor$getUiStateFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
