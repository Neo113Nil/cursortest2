package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/FilterOptionRequestDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/request/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterOptionRequestDto {
    public static final a Companion = new a();
    public final String a;
    public final kotlinx.serialization.json.c b;

    public /* synthetic */ FilterOptionRequestDto(int i, String str, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cVar;
        }
    }

    public FilterOptionRequestDto() {
        this(0);
    }

    public FilterOptionRequestDto(String str, kotlinx.serialization.json.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public /* synthetic */ FilterOptionRequestDto(int i) {
        this("", null);
    }
}
