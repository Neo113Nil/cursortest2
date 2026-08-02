package com.yandex.go.address.models;

import com.yandex.go.zone.model.Zone;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/models/ZoneAddress;", "", "Companion", "$serializer", "com/yandex/go/address/models/e", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZoneAddress {
    public static final e Companion = new e();
    public final Address a;
    public final Zone b;

    public /* synthetic */ ZoneAddress(int i, Address address) {
        if ((i & 1) == 0) {
            this.a = PlainAddress.a;
        } else {
            this.a = address;
        }
        this.b = null;
    }

    public final boolean a() {
        Zone zone = this.b;
        return zone == null || zone.h();
    }

    public ZoneAddress() {
        this((Address) null, 3);
    }

    public ZoneAddress(Address address, Zone zone) {
        this.a = address;
        this.b = zone;
    }

    public /* synthetic */ ZoneAddress(Address address, int i) {
        this((i & 1) != 0 ? PlainAddress.a : address, (Zone) null);
    }
}
