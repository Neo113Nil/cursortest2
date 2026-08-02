package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfo;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/f1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceInfo {
    public static final f1 Companion = new f1();
    public final boolean a;
    public final DeliveryPaidInsuranceScreen b;
    public final DeliveryPaidInsuranceSummaryListItem c;
    public final DeliveryPaidInsuranceSummaryBubble d;

    public /* synthetic */ DeliveryPaidInsuranceInfo(int i, boolean z, DeliveryPaidInsuranceScreen deliveryPaidInsuranceScreen, DeliveryPaidInsuranceSummaryListItem deliveryPaidInsuranceSummaryListItem, DeliveryPaidInsuranceSummaryBubble deliveryPaidInsuranceSummaryBubble) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = new DeliveryPaidInsuranceScreen(148);
        } else {
            this.b = deliveryPaidInsuranceScreen;
        }
        if ((i & 4) == 0) {
            this.c = new DeliveryPaidInsuranceSummaryListItem(0);
        } else {
            this.c = deliveryPaidInsuranceSummaryListItem;
        }
        if ((i & 8) == 0) {
            this.d = new DeliveryPaidInsuranceSummaryBubble(0);
        } else {
            this.d = deliveryPaidInsuranceSummaryBubble;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryPaidInsuranceScreen getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryPaidInsuranceSummaryBubble getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final DeliveryPaidInsuranceSummaryListItem getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceInfo)) {
            return false;
        }
        DeliveryPaidInsuranceInfo deliveryPaidInsuranceInfo = (DeliveryPaidInsuranceInfo) obj;
        return this.a == deliveryPaidInsuranceInfo.a && jl40.l(this.b, deliveryPaidInsuranceInfo.b) && jl40.l(this.c, deliveryPaidInsuranceInfo.c) && jl40.l(this.d, deliveryPaidInsuranceInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeliveryPaidInsuranceInfo(isEnabled=" + this.a + ", screen=" + this.b + ", summaryListItem=" + this.c + ", summaryBubble=" + this.d + Extension.C_BRAKE;
    }

    public DeliveryPaidInsuranceInfo() {
        DeliveryPaidInsuranceScreen deliveryPaidInsuranceScreen = new DeliveryPaidInsuranceScreen(148);
        DeliveryPaidInsuranceSummaryListItem deliveryPaidInsuranceSummaryListItem = new DeliveryPaidInsuranceSummaryListItem(0);
        DeliveryPaidInsuranceSummaryBubble deliveryPaidInsuranceSummaryBubble = new DeliveryPaidInsuranceSummaryBubble(0);
        this.a = false;
        this.b = deliveryPaidInsuranceScreen;
        this.c = deliveryPaidInsuranceSummaryListItem;
        this.d = deliveryPaidInsuranceSummaryBubble;
    }
}
