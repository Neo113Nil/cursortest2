package com.ybsdk.feature.merchant.offers.internal.data;

import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchRequest;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.data.MerchantOffersRepository$testSearchMerchantOffers$2", f = "MerchantOffersRepository.kt", l = {56, 53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersRepository$testSearchMerchantOffers$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $query;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersRepository$testSearchMerchantOffers$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MerchantOffersRepository$testSearchMerchantOffers$2(this.this$0, this.$query, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MerchantOffersRepository$testSearchMerchantOffers$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MerchantOffersApi merchantOffersApi;
        String str;
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            MerchantOffersApi merchantOffersApi2 = aVar.a;
            String str2 = this.$query;
            com.ybsdk.common.b bVar = aVar.b;
            this.L$0 = merchantOffersApi2;
            this.L$1 = str2;
            this.label = 1;
            obj = bVar.a(this);
            if (obj != coroutineSingletons) {
                merchantOffersApi = merchantOffersApi2;
                str = str2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e = ((Result) obj).getValue();
            return new Result(e);
        }
        str = (String) this.L$1;
        merchantOffersApi = (MerchantOffersApi) this.L$0;
        b.b(obj);
        MerchantOffersSearchRequest merchantOffersSearchRequest = new MerchantOffersSearchRequest(str, (DeviceInfoDto) obj, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        e = merchantOffersApi.e(merchantOffersSearchRequest, this);
    }
}
