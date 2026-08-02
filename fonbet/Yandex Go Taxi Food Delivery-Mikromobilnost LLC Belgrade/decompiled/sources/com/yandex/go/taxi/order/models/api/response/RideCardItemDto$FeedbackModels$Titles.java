package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$FeedbackModels$Titles", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/b5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$FeedbackModels$Titles {
    public static final b5 Companion = new b5();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(20))};
    public final String a;
    public final List b;

    public /* synthetic */ RideCardItemDto$FeedbackModels$Titles(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$FeedbackModels$Titles)) {
            return false;
        }
        RideCardItemDto$FeedbackModels$Titles rideCardItemDto$FeedbackModels$Titles = (RideCardItemDto$FeedbackModels$Titles) obj;
        return jl40.l(this.a, rideCardItemDto$FeedbackModels$Titles.a) && jl40.l(this.b, rideCardItemDto$FeedbackModels$Titles.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("Titles(text=", this.a, ", visibleOnRatings=", Extension.C_BRAKE, this.b);
    }

    public RideCardItemDto$FeedbackModels$Titles() {
        this.a = "";
        this.b = EmptyList.a;
    }
}
