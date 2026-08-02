package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3ExternalRequest;
import defpackage.fzw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1x0;
import defpackage.p860;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Response;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardV3Repository$getSingleDashboardV3External$2", f = "DashboardV3Repository.kt", l = {102, 106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3Repository$getSingleDashboardV3External$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $memberId;
    final /* synthetic */ p1x0 $nfcSysChecks;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Repository$getSingleDashboardV3External$2(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.$memberId = str;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DashboardV3Repository$getSingleDashboardV3External$2(this.this$0, this.$memberId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DashboardV3Repository$getSingleDashboardV3External$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            str = this.$memberId;
            fzw b = ((p860) this.this$0.c).b();
            this.L$0 = str;
            this.label = 1;
            obj = e.y(b, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                return new Result(a);
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        DashboardV3ExternalRequest dashboardV3ExternalRequest = new DashboardV3ExternalRequest(str, ((NfcInfoDto) obj).getTokenizedProductTypes(), null, this.this$0.g.b());
        DashboardApi dashboardApi = this.this$0.a;
        this.L$0 = null;
        this.label = 2;
        a = dashboardApi.a(dashboardV3ExternalRequest, this);
    }
}
