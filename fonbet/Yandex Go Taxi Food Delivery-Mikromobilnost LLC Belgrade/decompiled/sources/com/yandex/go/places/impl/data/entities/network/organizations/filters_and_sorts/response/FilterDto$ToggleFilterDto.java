package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/FilterDto$ToggleFilterDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/g;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterDto$ToggleFilterDto extends g {
    public static final e Companion = new e();
    public final String a;
    public final FilterChoiceOptionDto b;

    public FilterDto$ToggleFilterDto(int i, String str, FilterChoiceOptionDto filterChoiceOptionDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new FilterChoiceOptionDto(0);
        } else {
            this.b = filterChoiceOptionDto;
        }
    }

    public FilterDto$ToggleFilterDto() {
        FilterChoiceOptionDto filterChoiceOptionDto = new FilterChoiceOptionDto(0);
        this.a = "";
        this.b = filterChoiceOptionDto;
    }
}
