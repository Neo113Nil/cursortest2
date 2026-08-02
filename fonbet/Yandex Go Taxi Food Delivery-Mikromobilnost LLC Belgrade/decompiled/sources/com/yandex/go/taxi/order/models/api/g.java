package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class g {
    public static TaxiOrderFeedback a() {
        return TaxiOrderFeedback.j;
    }

    public static FeedbackDto b(TaxiOrderFeedback taxiOrderFeedback) {
        Integer num = taxiOrderFeedback.a;
        String str = taxiOrderFeedback.f;
        List list = taxiOrderFeedback.c;
        List list2 = taxiOrderFeedback.b;
        return new FeedbackDto(num, str, new FeedbackChoices(list, taxiOrderFeedback.d, taxiOrderFeedback.e, list2, list2), 16);
    }

    public final KSerializer serializer() {
        return TaxiOrderFeedback$$serializer.INSTANCE;
    }
}
