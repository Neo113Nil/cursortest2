package com.yandex.go.safety.center.lost_item.modal.interactor;

import defpackage.dqk0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.prz;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.xby;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ljrz;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.interactor.LostItemsUiStateInteractor$getUiStateFlow$2", f = "LostItemsUiStateInteractor.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiStateInteractor$getUiStateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ dqk0 $orderId;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiStateInteractor$getUiStateFlow$2(c cVar, dqk0 dqk0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$orderId = dqk0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LostItemsUiStateInteractor$getUiStateFlow$2 lostItemsUiStateInteractor$getUiStateFlow$2 = new LostItemsUiStateInteractor$getUiStateFlow$2(this.this$0, this.$orderId, (Continuation) obj3);
        lostItemsUiStateInteractor$getUiStateFlow$2.L$0 = (vpr) obj;
        lostItemsUiStateInteractor$getUiStateFlow$2.L$1 = (Throwable) obj2;
        return lostItemsUiStateInteractor$getUiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xby.l(jst.e, "LOST_ITEM", null, th, "Failed to get UI state for lost item", 2);
            this.this$0.d(this.$orderId.a, th);
            c cVar = this.this$0;
            b bVar = new b(cVar.e.a(), cVar, prz.a);
            cVar.h.getClass();
            tpr F = e.F(bVar, uyj.a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(F, vprVar, this) == coroutineSingletons) {
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
