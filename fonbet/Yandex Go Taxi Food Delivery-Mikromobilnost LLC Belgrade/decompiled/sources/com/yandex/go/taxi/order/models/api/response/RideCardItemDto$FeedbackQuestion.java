package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$FeedbackQuestion", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/c5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$FeedbackQuestion extends a7 {
    public static final c5 Companion = new c5();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(21))};
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public RideCardItemDto$FeedbackQuestion(int i, String str, String str2, List list, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$FeedbackQuestion)) {
            return false;
        }
        RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion = (RideCardItemDto$FeedbackQuestion) obj;
        return jl40.l(this.a, rideCardItemDto$FeedbackQuestion.a) && jl40.l(this.b, rideCardItemDto$FeedbackQuestion.b) && this.c == rideCardItemDto$FeedbackQuestion.c && jl40.l(this.d, rideCardItemDto$FeedbackQuestion.d);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackQuestion(id=", this.a, ", analyticsId=", this.b, ", isCompact=");
        v.append(this.c);
        v.append(", visibleOnRatings=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$FeedbackQuestion() {
        this.a = "";
        this.b = null;
        this.c = true;
        this.d = EmptyList.a;
    }
}
