package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/DeliveryPinLead$Icon", "Lcom/yandex/go/zone/dto/objects/s1;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/q1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPinLead$Icon extends s1 {
    public static final q1 Companion = new q1();
    public final n7v a;

    public DeliveryPinLead$Icon(int i, n7v n7vVar) {
        if (1 == (i & 1)) {
            this.a = n7vVar;
        } else {
            qje.Z(i, 1, DeliveryPinLead$Icon$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final n7v getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryPinLead$Icon) && jl40.l(this.a, ((DeliveryPinLead$Icon) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + Extension.C_BRAKE;
    }
}
