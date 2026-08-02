package com.yandex.go.taxi.order.search.ui;

import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.a3y0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.ui.LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3", f = "LongSearchV2CardCollapseTimeoutRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3 longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3 = (LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3) create((SearchState) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c.getClass();
        a3y0.h(new String[]{"awaitCardCollapsing"});
        hst hstVar = jst.e;
        return zy11.a;
    }
}
