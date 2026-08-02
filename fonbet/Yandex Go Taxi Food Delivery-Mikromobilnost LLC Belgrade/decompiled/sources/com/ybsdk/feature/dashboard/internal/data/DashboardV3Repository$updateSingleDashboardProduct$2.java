package com.ybsdk.feature.dashboard.internal.data;

import com.ybsdk.core.common.data.network.dto.cache.CacheableResponseDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Request;
import com.ybsdk.feature.dashboard.internal.data.dto.NfcSystemInfo;
import defpackage.fzw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1x0;
import defpackage.p860;
import defpackage.tls;
import defpackage.vvj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/common/data/network/dto/cache/CacheableResponseDto;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV4Response;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.dashboard.internal.data.DashboardV3Repository$updateSingleDashboardProduct$2", f = "DashboardV3Repository.kt", l = {83, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3Repository$updateSingleDashboardProduct$2 extends SuspendLambda implements tls {
    final /* synthetic */ vvj0 $cacheKey;
    final /* synthetic */ p1x0 $nfcSysChecks;
    final /* synthetic */ String $productId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3Repository$updateSingleDashboardProduct$2(c cVar, vvj0 vvj0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$cacheKey = vvj0Var;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DashboardV3Repository$updateSingleDashboardProduct$2(this.this$0, this.$cacheKey, this.$productId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DashboardV3Repository$updateSingleDashboardProduct$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r12 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String j;
        String b;
        NfcSystemInfo nfcSystemInfo;
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j = this.this$0.b.j(this.$cacheKey);
            b = this.this$0.e.b();
            fzw b2 = ((p860) this.this$0.c).b();
            this.L$0 = j;
            this.L$1 = null;
            this.L$2 = b;
            this.label = 1;
            obj = e.y(b2, this);
            if (obj != coroutineSingletons) {
                nfcSystemInfo = null;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
            if (!(f instanceof Result.Failure)) {
                try {
                    f = (CacheableResponseDto) ((DataWithStatusResponse) f).getOrThrow();
                } catch (Throwable th) {
                    f = new Result.Failure(th);
                }
            }
            return new Result(f);
        }
        b = (String) this.L$2;
        NfcSystemInfo nfcSystemInfo2 = (NfcSystemInfo) this.L$1;
        j = (String) this.L$0;
        kotlin.b.b(obj);
        nfcSystemInfo = nfcSystemInfo2;
        DashboardV3Request dashboardV3Request = new DashboardV3Request(((NfcInfoDto) obj).getTokenizedProductTypes(), nfcSystemInfo, b, com.ybsdk.core.common.data.network.dto.a.a(this.this$0.f.b()), this.this$0.g.b(), j);
        c cVar = this.this$0;
        DashboardApi dashboardApi = cVar.a;
        String a = cVar.d.a();
        String str = this.$productId;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        f = dashboardApi.f(a, str, dashboardV3Request, this);
    }
}
