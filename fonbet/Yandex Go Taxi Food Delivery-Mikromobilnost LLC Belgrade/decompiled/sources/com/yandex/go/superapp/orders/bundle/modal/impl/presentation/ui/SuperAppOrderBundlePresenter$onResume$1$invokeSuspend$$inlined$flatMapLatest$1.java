package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import defpackage.g92;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1", f = "SuperAppOrderBundlePresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1 superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1 = new SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return superAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr eVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pu6 pu6Var = (pu6) obj2;
            if (pu6Var == null) {
                EmptyList emptyList = EmptyList.a;
                eVar = new g92(2, new Pair(emptyList, emptyList));
            } else {
                f fVar = this.this$0;
                eVar = new e(new jqr(fVar.J.b(pu6Var.g, fVar.B), new SuperAppOrderBundlePresenter$onResume$1$2$1(this.this$0, pu6Var, null), 3), pu6Var);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(eVar, vprVar, this) == coroutineSingletons) {
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
