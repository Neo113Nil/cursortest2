package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryCostDetails;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/m0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryCostDetails {
    public static final m0 Companion = new m0();
    public final DeliveryCostDetailsScreen a;
    public final DeliveryFormListItem b;

    public /* synthetic */ DeliveryCostDetails(int i, DeliveryCostDetailsScreen deliveryCostDetailsScreen, DeliveryFormListItem deliveryFormListItem) {
        this.a = (i & 1) == 0 ? null : deliveryCostDetailsScreen;
        if ((i & 2) == 0) {
            this.b = new DeliveryFormListItem(0);
        } else {
            this.b = deliveryFormListItem;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryFormListItem getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryCostDetailsScreen getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryCostDetails)) {
            return false;
        }
        DeliveryCostDetails deliveryCostDetails = (DeliveryCostDetails) obj;
        return jl40.l(this.a, deliveryCostDetails.a) && jl40.l(this.b, deliveryCostDetails.b);
    }

    public final int hashCode() {
        DeliveryCostDetailsScreen deliveryCostDetailsScreen = this.a;
        return this.b.hashCode() + ((deliveryCostDetailsScreen == null ? 0 : deliveryCostDetailsScreen.hashCode()) * 31);
    }

    public final String toString() {
        return "DeliveryCostDetails(screen=" + this.a + ", formListItem=" + this.b + Extension.C_BRAKE;
    }

    public DeliveryCostDetails() {
        DeliveryFormListItem deliveryFormListItem = new DeliveryFormListItem(0);
        this.a = null;
        this.b = deliveryFormListItem;
    }
}
