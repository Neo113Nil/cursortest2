package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewRatingDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationPreviewRatingDto {
    public static final o Companion = new o();
    public final Double a;
    public final String b;

    public /* synthetic */ OrganizationPreviewRatingDto(int i, Double d, String str) {
        this.a = (i & 1) == 0 ? null : d;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public OrganizationPreviewRatingDto(int i) {
        this.a = null;
        this.b = "";
    }

    public OrganizationPreviewRatingDto() {
        this(0);
    }
}
