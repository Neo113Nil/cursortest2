package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutoTopupRequestStatus$2", f = "AutoTopupSetupRepository.kt", l = {233, 235}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutoTopupRequestStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ boolean $isV2RequestStatusEnabled;
    final /* synthetic */ GetAutoTopupStatusRequest $requestBody;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutoTopupRequestStatus$2(boolean z, b bVar, GetAutoTopupStatusRequest getAutoTopupStatusRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.$isV2RequestStatusEnabled = z;
        this.this$0 = bVar;
        this.$requestBody = getAutoTopupStatusRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$getAutoTopupRequestStatus$2(this.$isV2RequestStatusEnabled, this.this$0, this.$requestBody, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$getAutoTopupRequestStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r4 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r4 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isV2RequestStatusEnabled;
            b bVar = this.this$0;
            if (z) {
                AutoTopupApi autoTopupApi = bVar.a;
                GetAutoTopupStatusRequest getAutoTopupStatusRequest = this.$requestBody;
                int i2 = this.$attemptNumber;
                this.label = 1;
                f = autoTopupApi.j(getAutoTopupStatusRequest, i2, this);
            } else {
                AutoTopupApi autoTopupApi2 = bVar.a;
                GetAutoTopupStatusRequest getAutoTopupStatusRequest2 = this.$requestBody;
                int i3 = this.$attemptNumber;
                this.label = 2;
                f = autoTopupApi2.f(getAutoTopupStatusRequest2, i3, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
