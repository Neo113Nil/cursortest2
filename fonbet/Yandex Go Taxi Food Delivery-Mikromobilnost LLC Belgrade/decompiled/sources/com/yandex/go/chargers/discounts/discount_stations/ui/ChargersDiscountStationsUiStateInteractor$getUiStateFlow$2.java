package com.yandex.go.chargers.discounts.discount_stations.ui;

import defpackage.bms;
import defpackage.ft9;
import defpackage.it9;
import defpackage.ks9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lks9;", "paging", "Lit9;", ClidProvider.STATE, "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lks9;Lit9;)Lit9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.discount_stations.ui.ChargersDiscountStationsUiStateInteractor$getUiStateFlow$2", f = "ChargersDiscountStationsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountStationsUiStateInteractor$getUiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChargersDiscountStationsUiStateInteractor$getUiStateFlow$2 chargersDiscountStationsUiStateInteractor$getUiStateFlow$2 = new ChargersDiscountStationsUiStateInteractor$getUiStateFlow$2(4, (Continuation) obj4);
        chargersDiscountStationsUiStateInteractor$getUiStateFlow$2.L$0 = (ks9) obj2;
        chargersDiscountStationsUiStateInteractor$getUiStateFlow$2.L$1 = (it9) obj3;
        return chargersDiscountStationsUiStateInteractor$getUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ks9 ks9Var = (ks9) this.L$0;
        it9 it9Var = (it9) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!(it9Var instanceof ft9)) {
            return it9Var;
        }
        return new ft9(((ft9) it9Var).a, ks9Var.a, ks9Var.b, ks9Var.d, ks9Var.c);
    }
}
