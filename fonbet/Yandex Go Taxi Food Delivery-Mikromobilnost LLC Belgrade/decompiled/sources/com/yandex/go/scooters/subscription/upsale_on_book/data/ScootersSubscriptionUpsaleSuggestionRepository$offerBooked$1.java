package com.yandex.go.scooters.subscription.upsale_on_book.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.subscription.upsale_on_book.data.ScootersSubscriptionUpsaleSuggestionRepository", f = "ScootersSubscriptionUpsaleSuggestionRepository.kt", l = {MSException.ERROR_INVALID_PARAMETER, 40, 43, 45}, m = "offerBooked", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
