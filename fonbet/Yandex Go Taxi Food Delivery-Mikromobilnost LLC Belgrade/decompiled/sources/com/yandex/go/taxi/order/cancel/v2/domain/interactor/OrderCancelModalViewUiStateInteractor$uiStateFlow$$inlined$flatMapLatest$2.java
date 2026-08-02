package com.yandex.go.taxi.order.cancel.v2.domain.interactor;

import defpackage.gl70;
import defpackage.hl70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.domain.interactor.OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2", f = "OrderCancelModalViewUiStateInteractor.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    final /* synthetic */ hl70 $receiver$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2(Continuation continuation, hl70 hl70Var) {
        super(3, continuation);
        this.$receiver$inlined = hl70Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 = new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2((Continuation) obj3, this.$receiver$inlined);
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$1 = obj2;
        return orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r15, r0, r13) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r15 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gl70 gl70Var = (gl70) obj2;
            hl70 hl70Var = this.$receiver$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 = this;
            obj = ((com.yandex.go.taxi.order.cancel.v2.data.d) hl70Var.c).a(gl70Var.a, gl70Var.b, gl70Var.c, gl70Var.d, gl70Var.e, orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2 = this;
        }
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$0 = null;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$1 = null;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$2 = null;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$3 = null;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.L$4 = null;
        orderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2.label = 2;
    }
}
