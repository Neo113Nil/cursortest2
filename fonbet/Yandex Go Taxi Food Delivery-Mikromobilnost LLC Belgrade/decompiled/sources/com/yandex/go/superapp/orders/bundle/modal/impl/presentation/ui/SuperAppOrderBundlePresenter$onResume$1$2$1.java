package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkyw0;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$onResume$1$2$1", f = "SuperAppOrderBundlePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppOrderBundlePresenter$onResume$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ pu6 $bundle;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOrderBundlePresenter$onResume$1$2$1(f fVar, pu6 pu6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$bundle = pu6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppOrderBundlePresenter$onResume$1$2$1(this.this$0, this.$bundle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppOrderBundlePresenter$onResume$1$2$1 superAppOrderBundlePresenter$onResume$1$2$1 = (SuperAppOrderBundlePresenter$onResume$1$2$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppOrderBundlePresenter$onResume$1$2$1.invokeSuspend(zy11Var);
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
        f fVar = this.this$0;
        tje.N(fVar.Kg(), null, null, new SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1(fVar, this.$bundle.g, null), 3);
        return zy11.a;
    }
}
