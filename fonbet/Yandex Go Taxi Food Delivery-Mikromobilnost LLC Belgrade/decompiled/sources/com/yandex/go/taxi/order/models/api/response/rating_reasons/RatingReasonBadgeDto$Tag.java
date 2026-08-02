package com.yandex.go.taxi.order.models.api.response.rating_reasons;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/rating_reasons/RatingReasonBadgeDto$Tag", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/rating_reasons/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RatingReasonBadgeDto$Tag {
    public static final c Companion = new c();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(10)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ RatingReasonBadgeDto$Tag(String str, int i, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingReasonBadgeDto$Tag)) {
            return false;
        }
        RatingReasonBadgeDto$Tag ratingReasonBadgeDto$Tag = (RatingReasonBadgeDto$Tag) obj;
        return jl40.l(this.a, ratingReasonBadgeDto$Tag.a) && jl40.l(this.b, ratingReasonBadgeDto$Tag.b) && jl40.l(this.c, ratingReasonBadgeDto$Tag.c) && jl40.l(this.d, ratingReasonBadgeDto$Tag.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return n.l(", iconTag=", this.d, Extension.C_BRAKE, b64.v("Tag(id=", this.a, ", title=", this.b, ", visibleOnRatings="), this.c);
    }

    public RatingReasonBadgeDto$Tag() {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
        this.d = "";
    }
}
