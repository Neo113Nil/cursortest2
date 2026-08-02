package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreenButtonOptions;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/k1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceScreenButtonOptions {
    public static final k1 Companion = new k1();
    public final DeliveryPaidInsuranceScreenButton a;
    public final DeliveryPaidInsuranceScreenButton b;

    public DeliveryPaidInsuranceScreenButtonOptions(int i, DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton, DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton2) {
        if ((i & 1) == 0) {
            DeliveryPaidInsuranceScreenButton.Companion.getClass();
            deliveryPaidInsuranceScreenButton = DeliveryPaidInsuranceScreenButton.e;
        }
        this.a = deliveryPaidInsuranceScreenButton;
        if ((i & 2) != 0) {
            this.b = deliveryPaidInsuranceScreenButton2;
        } else {
            DeliveryPaidInsuranceScreenButton.Companion.getClass();
            this.b = DeliveryPaidInsuranceScreenButton.e;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryPaidInsuranceScreenButton getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final DeliveryPaidInsuranceScreenButton getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceScreenButtonOptions)) {
            return false;
        }
        DeliveryPaidInsuranceScreenButtonOptions deliveryPaidInsuranceScreenButtonOptions = (DeliveryPaidInsuranceScreenButtonOptions) obj;
        return jl40.l(this.a, deliveryPaidInsuranceScreenButtonOptions.a) && jl40.l(this.b, deliveryPaidInsuranceScreenButtonOptions.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryPaidInsuranceScreenButtonOptions(selected=" + this.a + ", unselected=" + this.b + Extension.C_BRAKE;
    }

    public DeliveryPaidInsuranceScreenButtonOptions() {
        this(0);
    }

    public DeliveryPaidInsuranceScreenButtonOptions(int i) {
        i1 i1Var = DeliveryPaidInsuranceScreenButton.Companion;
        i1Var.getClass();
        DeliveryPaidInsuranceScreenButton deliveryPaidInsuranceScreenButton = DeliveryPaidInsuranceScreenButton.e;
        i1Var.getClass();
        this.a = deliveryPaidInsuranceScreenButton;
        this.b = deliveryPaidInsuranceScreenButton;
    }
}
