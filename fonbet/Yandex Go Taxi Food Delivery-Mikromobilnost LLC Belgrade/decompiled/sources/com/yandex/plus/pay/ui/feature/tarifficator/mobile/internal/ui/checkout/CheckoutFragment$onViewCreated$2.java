package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import defpackage.kgd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pjb;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkgd0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lkgd0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$onViewCreated$2", f = "CheckoutFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CheckoutFragment$onViewCreated$2 extends SuspendLambda implements zls {
    final /* synthetic */ pjb $checkoutContentViewController;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutFragment$onViewCreated$2(pjb pjbVar, Continuation continuation) {
        super(3, continuation);
        this.$checkoutContentViewController = pjbVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CheckoutFragment$onViewCreated$2 checkoutFragment$onViewCreated$2 = new CheckoutFragment$onViewCreated$2(this.$checkoutContentViewController, (Continuation) obj3);
        checkoutFragment$onViewCreated$2.L$0 = (kgd0) obj2;
        zy11 zy11Var = zy11.a;
        checkoutFragment$onViewCreated$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kgd0 kgd0Var = (kgd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$checkoutContentViewController.u.a(kgd0Var);
        return zy11.a;
    }
}
