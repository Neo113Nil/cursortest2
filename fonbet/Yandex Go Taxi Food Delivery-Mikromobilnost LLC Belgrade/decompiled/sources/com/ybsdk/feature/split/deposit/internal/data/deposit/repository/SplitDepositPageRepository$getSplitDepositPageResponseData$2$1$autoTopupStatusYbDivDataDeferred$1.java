package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.bvf0;
import defpackage.i24;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Li24;", "<anonymous>", "(Ltse;)Li24;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1", f = "SplitDepositPageRepository.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetDepositPageResponse $response;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1(a aVar, GetDepositPageResponse getDepositPageResponse, Continuation continuation) {
        super(2, continuation);
        this.$response = getDepositPageResponse;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPageRepository$getSplitDepositPageResponseData$2$1$autoTopupStatusYbDivDataDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$response.getAutoTopupData() == null) {
                return null;
            }
            a aVar = this.this$0;
            GetDepositPageResponse.AutoTopupData.StatusScreen statusScreen = this.$response.getAutoTopupData().getStatusScreen();
            this.label = 1;
            aVar.getClass();
            obj = bvf0.n(new SplitDepositPageRepository$getAutoTopupYbDivData$2(statusScreen, aVar, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (i24) obj;
    }
}
