package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceToggleItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/n1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceToggleItem {
    public static final n1 Companion = new n1();
    public final FormattedText a;
    public final FormattedText b;

    public /* synthetic */ DeliveryPaidInsuranceToggleItem(int i, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceToggleItem)) {
            return false;
        }
        DeliveryPaidInsuranceToggleItem deliveryPaidInsuranceToggleItem = (DeliveryPaidInsuranceToggleItem) obj;
        return jl40.l(this.a, deliveryPaidInsuranceToggleItem.a) && jl40.l(this.b, deliveryPaidInsuranceToggleItem.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "DeliveryPaidInsuranceToggleItem(title=" + this.a + ", trailText=" + this.b + Extension.C_BRAKE;
    }

    public DeliveryPaidInsuranceToggleItem() {
        this.a = FormattedText.c;
        this.b = null;
    }
}
