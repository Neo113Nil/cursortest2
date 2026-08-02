package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Request;
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
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardV3Repository$getSingleDashboardV3Product$2", f = "DashboardV3Repository.kt", l = {41, 47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3Repository$getSingleDashboardV3Product$2 extends SuspendLambda implements tls {
    final /* synthetic */ p1x0 $nfcSysChecks;
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Repository$getSingleDashboardV3Product$2(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DashboardV3Repository$getSingleDashboardV3Product$2(this.this$0, this.$productId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DashboardV3Repository$getSingleDashboardV3Product$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (r12 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r13 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fzw b2 = ((p860) this.this$0.c).b();
            this.label = 1;
            obj = e.y(b2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                return new Result(b);
            }
            kotlin.b.b(obj);
        }
        DashboardV3Request dashboardV3Request = new DashboardV3Request(((NfcInfoDto) obj).getTokenizedProductTypes(), null, this.this$0.e.b(), com.ybsdk.core.common.data.network.dto.a.a(this.this$0.f.b()), this.this$0.g.b(), null, 32, null);
        c cVar = this.this$0;
        DashboardApi dashboardApi = cVar.a;
        String a = cVar.d.a();
        String str = this.$productId;
        this.label = 2;
        b = dashboardApi.b(a, str, dashboardV3Request, this);
    }
}
