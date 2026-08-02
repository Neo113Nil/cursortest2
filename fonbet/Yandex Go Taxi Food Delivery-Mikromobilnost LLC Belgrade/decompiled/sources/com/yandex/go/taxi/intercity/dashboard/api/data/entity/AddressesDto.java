package com.yandex.go.taxi.intercity.dashboard.api.data.entity;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/api/data/entity/AddressesDto;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/api/data/entity/f", "$serializer", "go-client-android.features.intercity.dashboard:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AddressesDto {
    public static final f Companion = new f();
    public static final AddressesDto c = new AddressesDto((c) null, 3);
    public final e a;
    public final e b;

    static {
        new AddressesDto(c.INSTANCE, 2);
    }

    public /* synthetic */ AddressesDto(int i, e eVar, e eVar2) {
        this.a = (i & 1) == 0 ? d.INSTANCE : eVar;
        if ((i & 2) == 0) {
            this.b = d.INSTANCE;
        } else {
            this.b = eVar2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final e getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final e getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressesDto)) {
            return false;
        }
        AddressesDto addressesDto = (AddressesDto) obj;
        return jl40.l(this.a, addressesDto.a) && jl40.l(this.b, addressesDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressesDto(pointA=" + this.a + ", pointB=" + this.b + Extension.C_BRAKE;
    }

    public AddressesDto() {
        this((c) null, 3);
    }

    public AddressesDto(e eVar, e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    public /* synthetic */ AddressesDto(c cVar, int i) {
        this((i & 1) != 0 ? d.INSTANCE : cVar, d.INSTANCE);
    }
}
