package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RatingDependentVisibilityTextDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RatingDependentVisibilityTextDto {
    public static final r3 Companion = new r3();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(6))};
    public final FormattedText a;
    public final List b;

    public /* synthetic */ RatingDependentVisibilityTextDto(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
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
        if (!(obj instanceof RatingDependentVisibilityTextDto)) {
            return false;
        }
        RatingDependentVisibilityTextDto ratingDependentVisibilityTextDto = (RatingDependentVisibilityTextDto) obj;
        return jl40.l(this.a, ratingDependentVisibilityTextDto.a) && jl40.l(this.b, ratingDependentVisibilityTextDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "RatingDependentVisibilityTextDto(text=" + this.a + ", visibleOnRatings=" + this.b + Extension.C_BRAKE;
    }

    public RatingDependentVisibilityTextDto() {
        this.a = FormattedText.c;
        this.b = EmptyList.a;
    }
}
