package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.dashboard.TransfersDashboardRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lrr51;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.TransfersDashboardRepository$getTransfersDashboard$2", f = "TransfersDashboardRepository.kt", l = {18, 24, 27}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransfersDashboardRepository$getTransfersDashboard$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransfersDashboardRepository$getTransfersDashboard$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransfersDashboardRepository$getTransfersDashboard$2(this.this$0, this.$agreementId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransfersDashboardRepository$getTransfersDashboard$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u;
        Object failure;
        Throwable a;
        Object failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            TransfersDashboardRequest transfersDashboardRequest = new TransfersDashboardRequest(this.$agreementId);
            this.label = 1;
            u = transfer2Api.u(transfersDashboardRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    failure2 = ((Result) obj).getValue();
                    return new Result(failure2);
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                a = Result.a(failure);
                if (a != null) {
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    this.label = 3;
                    failure2 = aVar.b((DivDataDto) failure, this);
                } else {
                    failure2 = new Result.Failure(a);
                }
                return new Result(failure2);
            }
            b.b(obj);
            u = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(u);
        if (a2 == null) {
            TransfersDashboardRepository$getTransfersDashboard$2$1$1 transfersDashboardRepository$getTransfersDashboard$2$1$1 = new TransfersDashboardRepository$getTransfersDashboard$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) u, transfersDashboardRepository$getTransfersDashboard$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return new Result(failure2);
    }
}
