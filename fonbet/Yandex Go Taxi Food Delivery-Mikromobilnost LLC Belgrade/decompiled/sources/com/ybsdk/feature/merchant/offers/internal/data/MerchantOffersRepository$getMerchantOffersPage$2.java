package com.ybsdk.feature.merchant.offers.internal.data;

import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersScreenRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenResponseV2;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.data.MerchantOffersRepository$getMerchantOffersPage$2", f = "MerchantOffersRepository.kt", l = {38, 36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersRepository$getMerchantOffersPage$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $mlRequestId;
    final /* synthetic */ List<String> $offerIds;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersRepository$getMerchantOffersPage$2(a aVar, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$mlRequestId = str;
        this.$offerIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MerchantOffersRepository$getMerchantOffersPage$2(this.this$0, this.$mlRequestId, this.$offerIds, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MerchantOffersRepository$getMerchantOffersPage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MerchantOffersApi merchantOffersApi;
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            merchantOffersApi = aVar.a;
            com.ybsdk.common.b bVar = aVar.b;
            this.L$0 = merchantOffersApi;
            this.label = 1;
            obj = bVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                c = ((Result) obj).getValue();
                return new Result(c);
            }
            merchantOffersApi = (MerchantOffersApi) this.L$0;
            b.b(obj);
        }
        MerchantOffersScreenRequest merchantOffersScreenRequest = new MerchantOffersScreenRequest((DeviceInfoDto) obj, this.$mlRequestId, this.$offerIds, this.this$0.d.b(), com.ybsdk.core.common.data.network.dto.a.a(this.this$0.e.b()), this.this$0.f.b());
        this.L$0 = null;
        this.label = 2;
        c = merchantOffersApi.c(merchantOffersScreenRequest, this);
    }
}
