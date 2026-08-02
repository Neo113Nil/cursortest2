package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.pjk0;
import defpackage.sjk0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$TagRatingReasonsSelector", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lpjk0;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$TagRatingReasonsSelector extends a7 implements pjk0 {
    public static final e6 Companion = new e6();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(4)), kotlin.a.b(lazyThreadSafetyMode, new sjk0(5)), kotlin.a.b(lazyThreadSafetyMode, new sjk0(6))};
    }

    public RideCardItemDto$TagRatingReasonsSelector(int i, String str, String str2, List list, List list2, List list3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
    }

    @Override // defpackage.pjk0
    /* renamed from: a, reason: from getter */
    public final List getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$TagRatingReasonsSelector)) {
            return false;
        }
        RideCardItemDto$TagRatingReasonsSelector rideCardItemDto$TagRatingReasonsSelector = (RideCardItemDto$TagRatingReasonsSelector) obj;
        return jl40.l(this.a, rideCardItemDto$TagRatingReasonsSelector.a) && jl40.l(this.b, rideCardItemDto$TagRatingReasonsSelector.b) && jl40.l(this.c, rideCardItemDto$TagRatingReasonsSelector.c) && jl40.l(this.d, rideCardItemDto$TagRatingReasonsSelector.d) && jl40.l(this.e, rideCardItemDto$TagRatingReasonsSelector.e);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + unr0.c(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("TagRatingReasonsSelector(id=", this.a, ", analyticsId=", this.b, ", visibleOnRatings=");
        nnm.w(v, this.c, ", badges=", this.d, ", titles=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public RideCardItemDto$TagRatingReasonsSelector() {
        this.a = "";
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
    }
}
