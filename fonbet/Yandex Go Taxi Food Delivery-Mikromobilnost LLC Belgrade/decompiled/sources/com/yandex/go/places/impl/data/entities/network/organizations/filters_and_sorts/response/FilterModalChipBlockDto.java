package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nsq;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/FilterModalChipBlockDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FilterModalChipBlockDto {
    public static final h Companion = new h();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(22))};
    public final FormattedText a;
    public final List b;

    public /* synthetic */ FilterModalChipBlockDto(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? null : formattedText;
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
        if (!(obj instanceof FilterModalChipBlockDto)) {
            return false;
        }
        FilterModalChipBlockDto filterModalChipBlockDto = (FilterModalChipBlockDto) obj;
        return jl40.l(this.a, filterModalChipBlockDto.a) && jl40.l(this.b, filterModalChipBlockDto.b);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        return this.b.hashCode() + ((formattedText == null ? 0 : formattedText.a.hashCode()) * 31);
    }

    public final String toString() {
        return "FilterModalChipBlockDto(title=" + this.a + ", chips=" + this.b + Extension.C_BRAKE;
    }

    public FilterModalChipBlockDto() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
