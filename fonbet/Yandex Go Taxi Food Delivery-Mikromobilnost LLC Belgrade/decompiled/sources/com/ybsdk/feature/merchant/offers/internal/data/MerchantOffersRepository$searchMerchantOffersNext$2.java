package com.ybsdk.feature.merchant.offers.internal.data;

import com.ybsdk.feature.merchant.offers.internal.data.network.MerchantOffersApi;
import com.ybsdk.feature.merchant.offers.internal.data.network.dto.MerchantOffersSearchNextPageRequest;
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
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersPageResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.data.MerchantOffersRepository$searchMerchantOffersNext$2", f = "MerchantOffersRepository.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersRepository$searchMerchantOffersNext$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $mlRequestId;
    final /* synthetic */ List<String> $offerIds;
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersRepository$searchMerchantOffersNext$2(a aVar, String str, List list, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$mlRequestId = str;
        this.$offerIds = list;
        this.$query = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MerchantOffersRepository$searchMerchantOffersNext$2(this.this$0, this.$mlRequestId, this.$offerIds, this.$query, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MerchantOffersRepository$searchMerchantOffersNext$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            MerchantOffersApi merchantOffersApi = this.this$0.a;
            MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest = new MerchantOffersSearchNextPageRequest(this.$mlRequestId, this.$offerIds, this.$query);
            this.label = 1;
            a = merchantOffersApi.a(merchantOffersSearchNextPageRequest, this);
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
