package com.yandex.go.taxi.order.models.api.response.rating_reasons;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/rating_reasons/RatingReasonBadgeDto$Achievement", "", "Companion", "Images", "$serializer", "com/yandex/go/taxi/order/models/api/response/rating_reasons/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RatingReasonBadgeDto$Achievement {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(9)), null};
    public final String a;
    public final String b;
    public final List c;
    public final Images d;

    public /* synthetic */ RatingReasonBadgeDto$Achievement(int i, String str, String str2, List list, Images images) {
        this.a = (i & 1) == 0 ? "" : str;
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
            this.d = null;
        } else {
            this.d = images;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingReasonBadgeDto$Achievement)) {
            return false;
        }
        RatingReasonBadgeDto$Achievement ratingReasonBadgeDto$Achievement = (RatingReasonBadgeDto$Achievement) obj;
        return jl40.l(this.a, ratingReasonBadgeDto$Achievement.a) && jl40.l(this.b, ratingReasonBadgeDto$Achievement.b) && jl40.l(this.c, ratingReasonBadgeDto$Achievement.c) && jl40.l(this.d, ratingReasonBadgeDto$Achievement.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Images images = this.d;
        return c + (images != null ? images.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Achievement(id=", this.a, ", title=", this.b, ", visibleOnRatings=");
        v.append(this.c);
        v.append(", images=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/rating_reasons/RatingReasonBadgeDto$Achievement$Images;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/rating_reasons/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Images {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ Images(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Images)) {
                return false;
            }
            Images images = (Images) obj;
            return jl40.l(this.a, images.a) && jl40.l(this.b, images.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("Images(activeImageTag=", this.a, ", inactiveImageTag=", this.b, Extension.C_BRAKE);
        }

        public Images() {
            this.a = null;
            this.b = null;
        }
    }

    public RatingReasonBadgeDto$Achievement() {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
    }
}
