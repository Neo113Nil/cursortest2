package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsListSearchbarDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsListSearchbarDto {
    public static final s Companion = new s();
    public final String a;
    public final com.yandex.go.places.models.data.entities.network.s b;
    public final boolean c;

    public /* synthetic */ OrganizationsListSearchbarDto(int i, String str, com.yandex.go.places.models.data.entities.network.s sVar, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sVar;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public OrganizationsListSearchbarDto() {
        this.a = "";
        this.b = null;
        this.c = false;
    }
}
