package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutotopupPaymentStatusRequest;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Ldqg;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusEntity;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutotopupPaymentStatus$2", f = "AutoTopupSetupRepository.kt", l = {481, 491}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutotopupPaymentStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $source;
    final /* synthetic */ String $type;
    final /* synthetic */ boolean $wasPaymentRetried;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutotopupPaymentStatus$2(b bVar, String str, String str2, String str3, boolean z, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$agreementId = str;
        this.$source = str2;
        this.$type = str3;
        this.$wasPaymentRetried = z;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$getAutotopupPaymentStatus$2(this.this$0, this.$agreementId, this.$source, this.$type, this.$wasPaymentRetried, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$getAutotopupPaymentStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r11 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
        Object failure;
        iyd0 iyd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AutoTopupApi autoTopupApi = this.this$0.a;
            GetAutotopupPaymentStatusRequest getAutotopupPaymentStatusRequest = new GetAutotopupPaymentStatusRequest(this.$agreementId, this.$source, this.$type, this.$wasPaymentRetried);
            int i2 = this.$attemptNumber;
            this.label = 1;
            m = autoTopupApi.m(getAutotopupPaymentStatusRequest, i2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iyd0Var = (iyd0) this.L$0;
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                if (!(failure instanceof Result.Failure)) {
                    failure = new iyd0(iyd0Var.b, failure);
                }
                return new Result(failure);
            }
            kotlin.b.b(obj);
            m = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        Throwable a = Result.a(m);
        if (a != null) {
            failure = new Result.Failure(a);
            return new Result(failure);
        }
        iyd0 iyd0Var2 = (iyd0) m;
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
        AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1 autoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1 = new AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1(bVar, null);
        this.L$0 = iyd0Var2;
        this.label = 2;
        Object d = com.ybsdk.core.utils.dto.b.d(dataWithStatusResponse, autoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1, this);
        if (d != coroutineSingletons) {
            failure = d;
            iyd0Var = iyd0Var2;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
