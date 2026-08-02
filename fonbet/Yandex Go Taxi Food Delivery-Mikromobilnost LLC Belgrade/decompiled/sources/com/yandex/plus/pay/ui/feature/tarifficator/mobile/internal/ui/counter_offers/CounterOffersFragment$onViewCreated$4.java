package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import defpackage.m0f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uze;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lm0f;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lm0f;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment$onViewCreated$4", f = "CounterOffersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CounterOffersFragment$onViewCreated$4 extends SuspendLambda implements zls {
    final /* synthetic */ uze $counterOffersViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CounterOffersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterOffersFragment$onViewCreated$4(CounterOffersFragment counterOffersFragment, uze uzeVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = counterOffersFragment;
        this.$counterOffersViewController = uzeVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CounterOffersFragment$onViewCreated$4 counterOffersFragment$onViewCreated$4 = new CounterOffersFragment$onViewCreated$4(this.this$0, this.$counterOffersViewController, (Continuation) obj3);
        counterOffersFragment$onViewCreated$4.L$0 = (m0f) obj2;
        zy11 zy11Var = zy11.a;
        counterOffersFragment$onViewCreated$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m0f m0fVar = (m0f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.setScreenState(m0fVar, this.$counterOffersViewController);
        return zy11.a;
    }
}
