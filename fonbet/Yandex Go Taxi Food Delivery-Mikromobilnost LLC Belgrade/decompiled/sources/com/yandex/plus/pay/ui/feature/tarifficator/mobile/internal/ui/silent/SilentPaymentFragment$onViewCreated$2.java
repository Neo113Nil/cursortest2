package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import defpackage.hed0;
import defpackage.mn41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcs0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lrcs0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lrcs0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$onViewCreated$2", f = "SilentPaymentFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SilentPaymentFragment$onViewCreated$2 extends SuspendLambda implements zls {
    final /* synthetic */ hed0 $loadingViewController;
    final /* synthetic */ mn41 $webViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SilentPaymentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentPaymentFragment$onViewCreated$2(SilentPaymentFragment silentPaymentFragment, hed0 hed0Var, mn41 mn41Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = silentPaymentFragment;
        this.$loadingViewController = hed0Var;
        this.$webViewController = mn41Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SilentPaymentFragment$onViewCreated$2 silentPaymentFragment$onViewCreated$2 = new SilentPaymentFragment$onViewCreated$2(this.this$0, this.$loadingViewController, this.$webViewController, (Continuation) obj3);
        silentPaymentFragment$onViewCreated$2.L$0 = (rcs0) obj2;
        zy11 zy11Var = zy11.a;
        silentPaymentFragment$onViewCreated$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rcs0 rcs0Var = (rcs0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.setScreenState(rcs0Var, this.$loadingViewController, this.$webViewController);
        return zy11.a;
    }
}
