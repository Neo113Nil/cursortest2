package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationIdDto;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationIdDto {
    public static final l Companion = new l();
    public final String a;

    public /* synthetic */ OrganizationIdDto(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrganizationIdDto) && jl40.l(this.a, ((OrganizationIdDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OrganizationIdDto(oid=", this.a, Extension.C_BRAKE);
    }

    public OrganizationIdDto() {
        this.a = "";
    }
}
