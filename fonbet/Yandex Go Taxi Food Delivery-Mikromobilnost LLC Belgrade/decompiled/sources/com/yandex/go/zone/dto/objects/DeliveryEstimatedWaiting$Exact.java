package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryEstimatedWaiting$Exact", "Lcom/yandex/go/zone/dto/objects/s0;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/q0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryEstimatedWaiting$Exact extends s0 {
    public static final q0 Companion = new q0();
    public final double a;
    public final String b;

    public DeliveryEstimatedWaiting$Exact(double d, int i, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, DeliveryEstimatedWaiting$Exact$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.go.zone.dto.objects.s0
    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // com.yandex.go.zone.dto.objects.s0
    /* renamed from: c, reason: from getter */
    public final double getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryEstimatedWaiting$Exact)) {
            return false;
        }
        DeliveryEstimatedWaiting$Exact deliveryEstimatedWaiting$Exact = (DeliveryEstimatedWaiting$Exact) obj;
        return Double.compare(this.a, deliveryEstimatedWaiting$Exact.a) == 0 && jl40.l(this.b, deliveryEstimatedWaiting$Exact.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Exact(seconds=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
