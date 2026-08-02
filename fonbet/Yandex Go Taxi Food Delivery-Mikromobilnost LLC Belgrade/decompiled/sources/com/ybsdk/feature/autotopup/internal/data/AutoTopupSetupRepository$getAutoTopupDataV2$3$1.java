package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2SuccessData;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;", "it", "Lkotlin/Result;", "Ln04;", "<anonymous>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutoTopupDataV2$3$1", f = "AutoTopupSetupRepository.kt", l = {221}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutoTopupDataV2$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $userStatus;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutoTopupDataV2$3$1(b bVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$userStatus = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$getAutoTopupDataV2$3$1 autoTopupSetupRepository$getAutoTopupDataV2$3$1 = new AutoTopupSetupRepository$getAutoTopupDataV2$3$1(this.this$0, this.$userStatus, continuation);
        autoTopupSetupRepository$getAutoTopupDataV2$3$1.L$0 = obj;
        return autoTopupSetupRepository$getAutoTopupDataV2$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$getAutoTopupDataV2$3$1) create((AutoTopupSettingsV2SuccessData) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData = (AutoTopupSettingsV2SuccessData) this.L$0;
            b bVar = this.this$0;
            Object obj2 = this.$userStatus;
            if (obj2 instanceof Result.Failure) {
                obj2 = null;
            }
            this.label = 1;
            a = b.a(bVar, autoTopupSettingsV2SuccessData, (AutoTopupUserStatus) obj2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
