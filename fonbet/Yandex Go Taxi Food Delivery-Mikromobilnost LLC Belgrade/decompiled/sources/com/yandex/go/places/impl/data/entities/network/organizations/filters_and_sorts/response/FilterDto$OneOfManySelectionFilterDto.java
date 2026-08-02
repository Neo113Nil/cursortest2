package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nsq;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/FilterDto$OneOfManySelectionFilterDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/g;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterDto$OneOfManySelectionFilterDto extends g {
    public static final d Companion = new d();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(20))};
    public final String a;
    public final List b;

    public FilterDto$OneOfManySelectionFilterDto(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public FilterDto$OneOfManySelectionFilterDto() {
        this.a = "";
        this.b = EmptyList.a;
    }
}
