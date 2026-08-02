package com.ybsdk.feature.transfer.version2.internal.screens.requisites.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.GetYbsByBicRequest;
import defpackage.gf91;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicDto;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.Transfer2RequisitesRepository$getPartnersByBic$2", f = "Transfer2RequisitesRepository.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Transfer2RequisitesRepository$getPartnersByBic$2 extends SuspendLambda implements tls {
    final /* synthetic */ GetYbsByBicRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2RequisitesRepository$getPartnersByBic$2(a aVar, GetYbsByBicRequest getYbsByBicRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = getYbsByBicRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Transfer2RequisitesRepository$getPartnersByBic$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Transfer2RequisitesRepository$getPartnersByBic$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Transfer2Api transfer2Api = this.this$0.a;
            GetYbsByBicRequest getYbsByBicRequest = this.$request;
            this.label = 1;
            byte[] bArr = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                bArr[i2] = (byte) (gf91.d[i2] ^ gf91.a[i2 % 8]);
            }
            B = transfer2Api.B(getYbsByBicRequest, new String(bArr, uza.a), this);
            if (B == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            B = ((Result) obj).getValue();
        }
        return new Result(B);
    }
}
