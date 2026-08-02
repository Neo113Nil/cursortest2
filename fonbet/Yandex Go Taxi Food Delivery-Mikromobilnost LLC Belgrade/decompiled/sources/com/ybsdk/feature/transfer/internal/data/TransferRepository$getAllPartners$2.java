package com.ybsdk.feature.transfer.internal.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.feature.transfer.internal.network.dto.partners.GetAllYbsRequest;
import defpackage.cf91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uza;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetYbsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.internal.data.TransferRepository$getAllPartners$2", f = "TransferRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRepository$getAllPartners$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetAllYbsRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRepository$getAllPartners$2(a aVar, GetAllYbsRequest getAllYbsRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getAllYbsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferRepository$getAllPartners$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferRepository$getAllPartners$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransfersApi transfersApi = this.this$0.b;
            GetAllYbsRequest getAllYbsRequest = this.$request;
            this.label = 1;
            byte[] bArr = new byte[13];
            for (int i2 = 0; i2 < 13; i2++) {
                bArr[i2] = (byte) (cf91.d[i2] ^ cf91.a[i2 % 8]);
            }
            a = transfersApi.a(getAllYbsRequest, new String(bArr, uza.a), this);
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
