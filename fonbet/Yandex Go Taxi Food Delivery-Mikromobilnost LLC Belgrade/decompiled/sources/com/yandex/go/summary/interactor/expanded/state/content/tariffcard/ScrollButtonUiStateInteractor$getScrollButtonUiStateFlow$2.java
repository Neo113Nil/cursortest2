package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.summary.model.LastVisibleTariffCardItemOrigin;
import defpackage.ihp0;
import defpackage.jhp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrsn;", "Ljhp0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2", f = "ScrollButtonUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ihp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2(ihp0 ihp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ihp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2 scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2 = new ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2(this.this$0, continuation);
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2.L$0 = obj;
        return scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2 scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2 = (ScrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2) create((rsn) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scrollButtonUiStateInteractor$getScrollButtonUiStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jhp0 jhp0Var = (jhp0) rsnVar.a;
        jhp0 jhp0Var2 = (jhp0) rsnVar.b;
        ihp0 ihp0Var = this.this$0;
        ihp0Var.getClass();
        boolean z = (jhp0Var != null ? jhp0Var.a : null) != null && jhp0Var.b.a(jhp0Var2.b);
        if (jhp0Var2.a == null && z && jhp0Var2.c && jhp0Var2.d == LastVisibleTariffCardItemOrigin.USER) {
            ihp0Var.c.a();
        }
        return zy11.a;
    }
}
