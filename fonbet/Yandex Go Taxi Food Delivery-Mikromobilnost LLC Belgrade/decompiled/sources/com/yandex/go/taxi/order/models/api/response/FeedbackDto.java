package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nsq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/FeedbackDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/l0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FeedbackDto {
    public static final l0 Companion = new l0();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(0))};
    public final Integer a;
    public final String b;
    public final FeedbackChoices c;
    public final RatingDisplayPolicy d;
    public final TaxiOrderFeedbackFlow e;

    public /* synthetic */ FeedbackDto(int i, Integer num, String str, FeedbackChoices feedbackChoices, RatingDisplayPolicy ratingDisplayPolicy, TaxiOrderFeedbackFlow taxiOrderFeedbackFlow) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = feedbackChoices;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ratingDisplayPolicy;
        }
        if ((i & 16) == 0) {
            this.e = TaxiOrderFeedbackFlow.FORCE_SCREEN;
        } else {
            this.e = taxiOrderFeedbackFlow;
        }
    }

    public static FeedbackDto a(FeedbackDto feedbackDto, Integer num, String str, FeedbackChoices feedbackChoices, int i) {
        if ((i & 1) != 0) {
            num = feedbackDto.a;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            str = feedbackDto.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            feedbackChoices = feedbackDto.c;
        }
        return new FeedbackDto(num2, str2, feedbackChoices, feedbackDto.d, feedbackDto.e);
    }

    public final FeedbackDto b(FeedbackChoices feedbackChoices) {
        return a(this, null, null, feedbackChoices, 27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackDto)) {
            return false;
        }
        FeedbackDto feedbackDto = (FeedbackDto) obj;
        return jl40.l(this.a, feedbackDto.a) && jl40.l(this.b, feedbackDto.b) && jl40.l(this.c, feedbackDto.c) && jl40.l(this.d, feedbackDto.d) && this.e == feedbackDto.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FeedbackChoices feedbackChoices = this.c;
        int hashCode3 = (hashCode2 + (feedbackChoices == null ? 0 : feedbackChoices.hashCode())) * 31;
        RatingDisplayPolicy ratingDisplayPolicy = this.d;
        return this.e.hashCode() + ((hashCode3 + (ratingDisplayPolicy != null ? ratingDisplayPolicy.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FeedbackDto(rating=" + this.a + ", message=" + this.b + ", choices=" + this.c + ", ratingDisplayPolicy=" + this.d + ", flow=" + this.e + Extension.C_BRAKE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackDto() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public FeedbackDto(Integer num, String str, FeedbackChoices feedbackChoices, RatingDisplayPolicy ratingDisplayPolicy, TaxiOrderFeedbackFlow taxiOrderFeedbackFlow) {
        this.a = num;
        this.b = str;
        this.c = feedbackChoices;
        this.d = ratingDisplayPolicy;
        this.e = taxiOrderFeedbackFlow;
    }

    public /* synthetic */ FeedbackDto(Integer num, String str, FeedbackChoices feedbackChoices, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : feedbackChoices, null, TaxiOrderFeedbackFlow.FORCE_SCREEN);
    }
}
