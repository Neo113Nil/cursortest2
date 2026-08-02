package com.ybsdk.feature.card.internal.presentation.carddetails;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel", f = "CardDetailsViewModel.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "addCardToSamsungPay")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$addCardToSamsungPay$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$addCardToSamsungPay$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b0(this.this$0, null, null, this);
    }
}
