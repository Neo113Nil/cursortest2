package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferError;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOfferError {
    public static final a Companion = new a();
    public final ChargersErrorDetailsDto a;

    public /* synthetic */ ChargersOfferError(int i, ChargersErrorDetailsDto chargersErrorDetailsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersErrorDetailsDto;
        }
    }

    public ChargersOfferError() {
        this.a = null;
    }
}
