package com.yandex.go.chargers.discounts.list.ui;

import defpackage.dw9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zv9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw9;", "listState", "Lzv9;", "detailsState", "<anonymous>", "(Ldw9;Lzv9;)Ldw9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiStateInteractor$getUiStateFlow$1", f = "ChargersDiscountsListUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsListUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersDiscountsListUiStateInteractor$getUiStateFlow$1 chargersDiscountsListUiStateInteractor$getUiStateFlow$1 = new ChargersDiscountsListUiStateInteractor$getUiStateFlow$1(3, (Continuation) obj3);
        chargersDiscountsListUiStateInteractor$getUiStateFlow$1.L$0 = (dw9) obj;
        chargersDiscountsListUiStateInteractor$getUiStateFlow$1.L$1 = (zv9) obj2;
        return chargersDiscountsListUiStateInteractor$getUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dw9 dw9Var = (dw9) this.L$0;
        zv9 zv9Var = (zv9) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zv9Var != null ? zv9Var : dw9Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
