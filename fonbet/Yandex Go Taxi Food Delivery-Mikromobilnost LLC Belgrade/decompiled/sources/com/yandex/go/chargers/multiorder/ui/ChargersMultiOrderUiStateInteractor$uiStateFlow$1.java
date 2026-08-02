package com.yandex.go.chargers.multiorder.ui;

import defpackage.bms;
import defpackage.bvf0;
import defpackage.c4a;
import defpackage.d4a;
import defpackage.i5a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.uda;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lrl9;", "activeOrders", "Luda;", "selectedMode", "Lv5a;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lrl9;Luda;)Lv5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateInteractor$uiStateFlow$1", f = "ChargersMultiOrderUiStateInteractor.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateInteractor$uiStateFlow$1(f fVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChargersMultiOrderUiStateInteractor$uiStateFlow$1 chargersMultiOrderUiStateInteractor$uiStateFlow$1 = new ChargersMultiOrderUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        chargersMultiOrderUiStateInteractor$uiStateFlow$1.L$0 = (rl9) obj2;
        chargersMultiOrderUiStateInteractor$uiStateFlow$1.L$1 = (uda) obj3;
        return chargersMultiOrderUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rl9 rl9Var = (rl9) this.L$0;
        uda udaVar = (uda) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0.c;
        String str = udaVar != null ? udaVar.a : null;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        gVar.getClass();
        d4a d4aVar = null;
        i5a i5aVar = rl9Var.b;
        c4a c4aVar = i5aVar != null ? i5aVar.b : null;
        if (i5aVar != null) {
            d4aVar = i5aVar.c;
        }
        Object n = bvf0.n(new ChargersMultiOrderUiStateMapper$toUiState$2(str, rl9Var, i5aVar, gVar, c4aVar, d4aVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
