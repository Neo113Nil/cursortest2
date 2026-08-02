package com.ybsdk.screens.notice.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.topup.TopupNoticeContentDeprecatedRequest;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.notice.data.TopupNoticeRepository$getTopupNoticeDeprecated$2$1", f = "TopupNoticeRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TopupNoticeRepository$getTopupNoticeDeprecated$2$1 extends SuspendLambda implements tls {
    final /* synthetic */ TopupNoticeContentDeprecatedRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopupNoticeRepository$getTopupNoticeDeprecated$2$1(a aVar, TopupNoticeContentDeprecatedRequest topupNoticeContentDeprecatedRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = topupNoticeContentDeprecatedRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TopupNoticeRepository$getTopupNoticeDeprecated$2$1(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TopupNoticeRepository$getTopupNoticeDeprecated$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            TopupNoticeContentDeprecatedRequest topupNoticeContentDeprecatedRequest = this.$request;
            this.label = 1;
            r = api.r(topupNoticeContentDeprecatedRequest, this);
            if (r == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            r = ((Result) obj).getValue();
        }
        return new Result(r);
    }
}
