package com.yandex.go.places.models.data.entities.network.bottom_panel;

import com.yandex.go.places.models.data.entities.network.DeliveryOrderFormRoutePointDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$OpenDeliveryOrderForm", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/b", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$OpenDeliveryOrderForm extends k {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final DeliveryOrderFormRoutePointDto c;
    public final String d;

    public BottomPanelButtonActionDto$OpenDeliveryOrderForm(int i, String str, String str2, DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, BottomPanelButtonActionDto$OpenDeliveryOrderForm$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = deliveryOrderFormRoutePointDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.bottom_panel.k
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonActionDto$OpenDeliveryOrderForm)) {
            return false;
        }
        BottomPanelButtonActionDto$OpenDeliveryOrderForm bottomPanelButtonActionDto$OpenDeliveryOrderForm = (BottomPanelButtonActionDto$OpenDeliveryOrderForm) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$OpenDeliveryOrderForm.a) && jl40.l(this.b, bottomPanelButtonActionDto$OpenDeliveryOrderForm.b) && jl40.l(this.c, bottomPanelButtonActionDto$OpenDeliveryOrderForm.c) && jl40.l(this.d, bottomPanelButtonActionDto$OpenDeliveryOrderForm.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto = this.c;
        int hashCode3 = (hashCode2 + (deliveryOrderFormRoutePointDto == null ? 0 : deliveryOrderFormRoutePointDto.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenDeliveryOrderForm(formMode=", this.a, ", scenario=", this.b, ", presetPoint=");
        v.append(this.c);
        v.append(", goalTrackingLink=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
