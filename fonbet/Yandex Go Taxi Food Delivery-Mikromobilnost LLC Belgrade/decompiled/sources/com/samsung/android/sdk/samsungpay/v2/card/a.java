package com.samsung.android.sdk.samsungpay.v2.card;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.card.CardManager;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements PartnerRequest.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardManager b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ CardManager.a d;

    public /* synthetic */ a(CardManager cardManager, Parcelable parcelable, CardManager.a aVar, int i) {
        this.a = i;
        this.b = cardManager;
        this.c = parcelable;
        this.d = aVar;
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.PartnerRequest.c
    public final void a(IInterface iInterface, PartnerRequest partnerRequest) {
        int i = this.a;
        CardManager.a aVar = this.d;
        Parcelable parcelable = this.c;
        CardManager cardManager = this.b;
        switch (i) {
            case 0:
                cardManager.q((Bundle) parcelable, (CardManager.GetCardListenerInternal) aVar, iInterface, partnerRequest);
                break;
            default:
                cardManager.o((AddCardInfo) parcelable, (CardManager.AddCardInfoListenerInternal) aVar, iInterface, partnerRequest);
                break;
        }
    }
}
