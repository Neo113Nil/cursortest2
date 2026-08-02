package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryTimeIntervals;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/v1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryTimeIntervals {
    public static final v1 Companion = new v1();
    public final DeliveryTimeIntervalsListScreen a;
    public final DeliveryTimeIntervalsSummaryItem b;

    public /* synthetic */ DeliveryTimeIntervals(int i, DeliveryTimeIntervalsListScreen deliveryTimeIntervalsListScreen, DeliveryTimeIntervalsSummaryItem deliveryTimeIntervalsSummaryItem) {
        this.a = (i & 1) == 0 ? new DeliveryTimeIntervalsListScreen(0) : deliveryTimeIntervalsListScreen;
        if ((i & 2) == 0) {
            this.b = new DeliveryTimeIntervalsSummaryItem(0);
        } else {
            this.b = deliveryTimeIntervalsSummaryItem;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryTimeIntervalsListScreen getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryTimeIntervalsSummaryItem getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTimeIntervals)) {
            return false;
        }
        DeliveryTimeIntervals deliveryTimeIntervals = (DeliveryTimeIntervals) obj;
        return jl40.l(this.a, deliveryTimeIntervals.a) && jl40.l(this.b, deliveryTimeIntervals.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryTimeIntervals(listScreen=" + this.a + ", summaryItem=" + this.b + Extension.C_BRAKE;
    }

    public DeliveryTimeIntervals() {
        DeliveryTimeIntervalsListScreen deliveryTimeIntervalsListScreen = new DeliveryTimeIntervalsListScreen(0);
        DeliveryTimeIntervalsSummaryItem deliveryTimeIntervalsSummaryItem = new DeliveryTimeIntervalsSummaryItem(0);
        this.a = deliveryTimeIntervalsListScreen;
        this.b = deliveryTimeIntervalsSummaryItem;
    }
}
