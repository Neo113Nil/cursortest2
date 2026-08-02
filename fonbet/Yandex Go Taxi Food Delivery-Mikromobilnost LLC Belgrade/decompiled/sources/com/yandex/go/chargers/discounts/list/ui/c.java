package com.yandex.go.chargers.discounts.list.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ h b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tsa w;

    public c(tpr tprVar, h hVar, String str, tsa tsaVar) {
        this.a = tprVar;
        this.b = hVar;
        this.c = str;
        this.w = tsaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1 chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1) {
            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1 = (ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c, this.w);
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.L$0 = null;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.L$1 = null;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.L$2 = null;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1 = new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
