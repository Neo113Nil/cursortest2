package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import defpackage.cg6;
import defpackage.ee21;
import defpackage.mn41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe21;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Loe21;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Loe21;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$onViewCreated$2", f = "UpsaleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UpsaleFragment$onViewCreated$2 extends SuspendLambda implements zls {
    final /* synthetic */ cg6 $paymentLoadingViewController;
    final /* synthetic */ ee21 $upsaleContentViewController;
    final /* synthetic */ mn41 $webViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpsaleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsaleFragment$onViewCreated$2(UpsaleFragment upsaleFragment, ee21 ee21Var, cg6 cg6Var, mn41 mn41Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = upsaleFragment;
        this.$upsaleContentViewController = ee21Var;
        this.$paymentLoadingViewController = cg6Var;
        this.$webViewController = mn41Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpsaleFragment$onViewCreated$2 upsaleFragment$onViewCreated$2 = new UpsaleFragment$onViewCreated$2(this.this$0, this.$upsaleContentViewController, this.$paymentLoadingViewController, this.$webViewController, (Continuation) obj3);
        upsaleFragment$onViewCreated$2.L$0 = (oe21) obj2;
        zy11 zy11Var = zy11.a;
        upsaleFragment$onViewCreated$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oe21 oe21Var = (oe21) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.setScreenState(oe21Var, this.$upsaleContentViewController, this.$paymentLoadingViewController, this.$webViewController);
        return zy11.a;
    }
}
