package com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/FilterChoiceOptionDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/filters_and_sorts/response/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FilterChoiceOptionDto {
    public static final c Companion = new c();
    public final String a;
    public final boolean b;
    public final kotlinx.serialization.json.c c;

    public /* synthetic */ FilterChoiceOptionDto(int i, String str, boolean z, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final kotlinx.serialization.json.c getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public FilterChoiceOptionDto(int i) {
        this.a = "";
        this.b = false;
        this.c = null;
    }

    public FilterChoiceOptionDto() {
        this(0);
    }
}
