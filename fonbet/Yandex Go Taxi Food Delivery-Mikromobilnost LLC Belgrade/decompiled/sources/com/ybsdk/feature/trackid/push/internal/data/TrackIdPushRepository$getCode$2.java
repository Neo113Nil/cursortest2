package com.ybsdk.feature.trackid.push.internal.data;

import com.ybsdk.feature.trackid.push.internal.network.TrackIdPushApi;
import com.ybsdk.feature.trackid.push.internal.network.dto.GetCodeRequest;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.trackid.push.internal.data.TrackIdPushRepository$getCode$2", f = "TrackIdPushRepository.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TrackIdPushRepository$getCode$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetCodeRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackIdPushRepository$getCode$2(a aVar, GetCodeRequest getCodeRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getCodeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TrackIdPushRepository$getCode$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TrackIdPushRepository$getCode$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TrackIdPushApi trackIdPushApi = this.this$0.a;
            GetCodeRequest getCodeRequest = this.$request;
            this.label = 1;
            a = trackIdPushApi.a(getCodeRequest, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
