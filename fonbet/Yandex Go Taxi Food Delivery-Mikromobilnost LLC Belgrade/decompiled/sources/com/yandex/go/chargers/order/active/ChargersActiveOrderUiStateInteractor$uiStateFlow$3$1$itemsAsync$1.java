package com.yandex.go.chargers.order.active;

import defpackage.bvf0;
import defpackage.il9;
import defpackage.kca;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lel9;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1", f = "ChargersActiveOrderUiStateInteractor.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<kca> $filteredItems;
    final /* synthetic */ String $timer;
    int label;
    final /* synthetic */ il9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1(il9 il9Var, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = il9Var;
        this.$filteredItems = list;
        this.$timer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1(this.this$0, this.$filteredItems, this.$timer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderUiStateInteractor$uiStateFlow$3$1$itemsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        f fVar = this.this$0.d;
        List<kca> list = this.$filteredItems;
        String str = this.$timer;
        this.label = 1;
        fVar.getClass();
        Object n = bvf0.n(new ChargersActiveOrderMapper$mapToUiStateModelList$2(list, fVar, str, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
