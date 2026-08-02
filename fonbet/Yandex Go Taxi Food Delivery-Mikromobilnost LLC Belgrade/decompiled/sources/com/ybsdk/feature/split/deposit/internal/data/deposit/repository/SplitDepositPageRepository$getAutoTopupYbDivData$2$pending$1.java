package com.ybsdk.feature.split.deposit.internal.data.deposit.repository;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrr51;", "<anonymous>", "(Ltse;)Lrr51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.split.deposit.internal.data.deposit.repository.SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1", f = "SplitDepositPageRepository.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetDepositPageResponse.AutoTopupData.StatusScreen $statusScreens;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1(GetDepositPageResponse.AutoTopupData.StatusScreen statusScreen, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$statusScreens = statusScreen;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1(this.$statusScreens, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplitDepositPageRepository$getAutoTopupYbDivData$2$pending$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DivDataDto bottomDivKitData = this.$statusScreens.getPendingData().getBottomDivKitData();
            if (bottomDivKitData == null) {
                return null;
            }
            com.ybsdk.feature.divkit.api.domain.a aVar = this.this$0.c;
            this.label = 1;
            b = aVar.b(bottomDivKitData, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        b.b(b);
        return (rr51) b;
    }
}
