package com.ybsdk.feature.savings.internal.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vps;
import defpackage.wls;
import defpackage.zps;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzps;", "", "<anonymous>", "(Lzps;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.FundCreationInteractor$requestFundCreationStatus$2", f = "FundCreationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundCreationInteractor$requestFundCreationStatus$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundCreationInteractor$requestFundCreationStatus$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FundCreationInteractor$requestFundCreationStatus$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundCreationInteractor$requestFundCreationStatus$2) create((zps) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!(this.this$0.e instanceof vps));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
