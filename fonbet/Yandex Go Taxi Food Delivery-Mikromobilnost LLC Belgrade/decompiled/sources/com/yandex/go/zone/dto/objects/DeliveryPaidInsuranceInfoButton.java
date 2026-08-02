package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceInfoButton;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/g1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceInfoButton {
    public static final g1 Companion = new g1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ DeliveryPaidInsuranceInfoButton(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceInfoButton)) {
            return false;
        }
        DeliveryPaidInsuranceInfoButton deliveryPaidInsuranceInfoButton = (DeliveryPaidInsuranceInfoButton) obj;
        return jl40.l(this.a, deliveryPaidInsuranceInfoButton.a) && jl40.l(this.b, deliveryPaidInsuranceInfoButton.b) && jl40.l(this.c, deliveryPaidInsuranceInfoButton.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("DeliveryPaidInsuranceInfoButton(text=", this.a, ", iconTag=", this.b, ", deeplink="), this.c, Extension.C_BRAKE);
    }

    public DeliveryPaidInsuranceInfoButton() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
