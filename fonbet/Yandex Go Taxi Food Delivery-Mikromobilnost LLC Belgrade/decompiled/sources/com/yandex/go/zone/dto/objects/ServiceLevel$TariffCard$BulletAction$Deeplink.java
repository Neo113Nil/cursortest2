package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/ServiceLevel$TariffCard$BulletAction$Deeplink", "Lcom/yandex/go/zone/dto/objects/w4;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/u4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ServiceLevel$TariffCard$BulletAction$Deeplink extends w4 {
    public static final u4 Companion = new u4();
    public final String a;

    public ServiceLevel$TariffCard$BulletAction$Deeplink(int i, String str) {
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
        return (obj instanceof ServiceLevel$TariffCard$BulletAction$Deeplink) && jl40.l(this.a, ((ServiceLevel$TariffCard$BulletAction$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ServiceLevel$TariffCard$BulletAction$Deeplink() {
        this.a = "";
    }
}
