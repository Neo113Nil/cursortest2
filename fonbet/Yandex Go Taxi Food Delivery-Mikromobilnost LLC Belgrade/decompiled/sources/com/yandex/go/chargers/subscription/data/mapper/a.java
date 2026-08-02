package com.yandex.go.chargers.subscription.data.mapper;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import defpackage.bvf0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public final Object a(ChargersSubscriptionResponseDto chargersSubscriptionResponseDto, Continuation continuation) {
        return bvf0.n(new ChargersSubscriptionMapper$mapToChargersSubscriptionData$2(this, chargersSubscriptionResponseDto, null), continuation);
    }
}
