package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import defpackage.j7c;
import defpackage.k6c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lj7c;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lj7c;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment$onViewCreated$3", f = "ClosingOfferFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClosingOfferFragment$onViewCreated$3 extends SuspendLambda implements zls {
    final /* synthetic */ k6c $closingOfferViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClosingOfferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosingOfferFragment$onViewCreated$3(ClosingOfferFragment closingOfferFragment, k6c k6cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = closingOfferFragment;
        this.$closingOfferViewController = k6cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ClosingOfferFragment$onViewCreated$3 closingOfferFragment$onViewCreated$3 = new ClosingOfferFragment$onViewCreated$3(this.this$0, this.$closingOfferViewController, (Continuation) obj3);
        closingOfferFragment$onViewCreated$3.L$0 = (j7c) obj2;
        zy11 zy11Var = zy11.a;
        closingOfferFragment$onViewCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j7c j7cVar = (j7c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.setScreenState(j7cVar, this.$closingOfferViewController);
        return zy11.a;
    }
}
