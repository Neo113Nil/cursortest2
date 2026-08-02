package com.ybsdk.feature.qr.internal.data;

import com.ybsdk.feature.qr.api.data.QrApi;
import com.ybsdk.feature.qr.api.data.resolve.ResolveQrRequestBodyDto;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/qr/api/data/resolve/ResolveQrResponseDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.internal.data.ResolveQrRepository$resolveQr$2", f = "ResolveQrRepository.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ResolveQrRepository$resolveQr$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $origin;
    final /* synthetic */ String $qr;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveQrRepository$resolveQr$2(a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$qr = str;
        this.$origin = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ResolveQrRepository$resolveQr$2(this.this$0, this.$qr, this.$origin, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ResolveQrRepository$resolveQr$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            QrApi qrApi = this.this$0.a;
            ResolveQrRequestBodyDto resolveQrRequestBodyDto = new ResolveQrRequestBodyDto(this.$qr, this.$origin);
            this.label = 1;
            a = qrApi.a(resolveQrRequestBodyDto, this);
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
