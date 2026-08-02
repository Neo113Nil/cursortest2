package com.ybsdk.feature.merchant.offers.internal.screens.testSearch;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment$onViewCreated$2", f = "MerchantOffersTestSearchFragment.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MerchantOffersTestSearchFragment$onViewCreated$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ MerchantOffersTestSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersTestSearchFragment$onViewCreated$2(MerchantOffersTestSearchFragment merchantOffersTestSearchFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = merchantOffersTestSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantOffersTestSearchFragment$onViewCreated$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantOffersTestSearchFragment$onViewCreated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            kotlinx.coroutines.flow.b B = com.ybsdk.core.utils.ext.view.b.B(MerchantOffersTestSearchFragment.access$getBinding(this.this$0).d);
            v41 v41Var = new v41(9, MerchantOffersTestSearchFragment.access$getViewModel(this.this$0));
            this.label = 1;
            if (B.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
