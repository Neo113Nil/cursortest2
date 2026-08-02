package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryInsuranceModal;", "Lcom/yandex/go/zone/dto/objects/u2;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d1", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryInsuranceModal extends u2 {
    public static final d1 Companion = new d1();
    public final int a;

    public DeliveryInsuranceModal(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryInsuranceModal) && this.a == ((DeliveryInsuranceModal) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "DeliveryInsuranceModal(maxShowCount=", Extension.C_BRAKE);
    }

    public DeliveryInsuranceModal() {
        this.a = 0;
    }
}
