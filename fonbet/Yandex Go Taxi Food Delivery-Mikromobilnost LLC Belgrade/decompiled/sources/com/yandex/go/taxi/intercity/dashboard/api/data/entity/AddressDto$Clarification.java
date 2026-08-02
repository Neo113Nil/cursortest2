package com.yandex.go.taxi.intercity.dashboard.api.data.entity;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/api/data/entity/AddressDto$Clarification", "Lcom/yandex/go/taxi/intercity/dashboard/api/data/entity/e;", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/api/data/entity/a", "go-client-android.features.intercity.dashboard:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AddressDto$Clarification extends e {
    public static final a Companion = new a();
    public final String a;

    public AddressDto$Clarification(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressDto$Clarification) && jl40.l(this.a, ((AddressDto$Clarification) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Clarification(geoArea=", this.a, Extension.C_BRAKE);
    }

    public AddressDto$Clarification(String str) {
        this.a = str;
    }

    public AddressDto$Clarification() {
        this("");
    }
}
