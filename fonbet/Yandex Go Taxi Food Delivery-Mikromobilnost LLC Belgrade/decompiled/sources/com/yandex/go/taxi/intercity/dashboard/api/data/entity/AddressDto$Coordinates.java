package com.yandex.go.taxi.intercity.dashboard.api.data.entity;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pn0;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/api/data/entity/AddressDto$Coordinates", "Lcom/yandex/go/taxi/intercity/dashboard/api/data/entity/e;", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/api/data/entity/b", "go-client-android.features.intercity.dashboard:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AddressDto$Coordinates extends e {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(7))};
    public final List a;

    public AddressDto$Coordinates(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressDto$Coordinates) && jl40.l(this.a, ((AddressDto$Coordinates) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Coordinates(point=", Extension.C_BRAKE, this.a);
    }

    public AddressDto$Coordinates(List list) {
        this.a = list;
    }

    public AddressDto$Coordinates() {
        this(EmptyList.a);
    }
}
