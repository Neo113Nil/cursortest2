package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonByEntryPoint;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/j1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceScreenButtonByEntryPoint {
    public static final j1 Companion = new j1();
    public final DeliveryPaidInsuranceScreenButtonOptions a;
    public final DeliveryPaidInsuranceScreenButtonOptions b;

    public /* synthetic */ DeliveryPaidInsuranceScreenButtonByEntryPoint(int i, DeliveryPaidInsuranceScreenButtonOptions deliveryPaidInsuranceScreenButtonOptions, DeliveryPaidInsuranceScreenButtonOptions deliveryPaidInsuranceScreenButtonOptions2) {
        this.a = (i & 1) == 0 ? new DeliveryPaidInsuranceScreenButtonOptions(0) : deliveryPaidInsuranceScreenButtonOptions;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = deliveryPaidInsuranceScreenButtonOptions2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryPaidInsuranceScreenButtonOptions getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryPaidInsuranceScreenButtonOptions getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceScreenButtonByEntryPoint)) {
            return false;
        }
        DeliveryPaidInsuranceScreenButtonByEntryPoint deliveryPaidInsuranceScreenButtonByEntryPoint = (DeliveryPaidInsuranceScreenButtonByEntryPoint) obj;
        return jl40.l(this.a, deliveryPaidInsuranceScreenButtonByEntryPoint.a) && jl40.l(this.b, deliveryPaidInsuranceScreenButtonByEntryPoint.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DeliveryPaidInsuranceScreenButtonOptions deliveryPaidInsuranceScreenButtonOptions = this.b;
        return hashCode + (deliveryPaidInsuranceScreenButtonOptions == null ? 0 : deliveryPaidInsuranceScreenButtonOptions.hashCode());
    }

    public final String toString() {
        return "DeliveryPaidInsuranceScreenButtonByEntryPoint(default=" + this.a + ", orderButton=" + this.b + Extension.C_BRAKE;
    }

    public DeliveryPaidInsuranceScreenButtonByEntryPoint() {
        this.a = new DeliveryPaidInsuranceScreenButtonOptions(0);
        this.b = null;
    }
}
