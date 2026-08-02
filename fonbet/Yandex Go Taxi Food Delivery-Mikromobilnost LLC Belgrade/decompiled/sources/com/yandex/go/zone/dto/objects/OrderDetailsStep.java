package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.DeliveryExtra;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/OrderDetailsStep;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/t2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrderDetailsStep {
    public static final t2 Companion = new t2();
    public final DeliveryExtra.OrderHeader a;
    public final OrderButtonOverride b;

    public /* synthetic */ OrderDetailsStep(int i, DeliveryExtra.OrderHeader orderHeader, OrderButtonOverride orderButtonOverride) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = orderHeader;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = orderButtonOverride;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryExtra.OrderHeader getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final OrderButtonOverride getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsStep)) {
            return false;
        }
        OrderDetailsStep orderDetailsStep = (OrderDetailsStep) obj;
        return jl40.l(this.a, orderDetailsStep.a) && jl40.l(this.b, orderDetailsStep.b);
    }

    public final int hashCode() {
        DeliveryExtra.OrderHeader orderHeader = this.a;
        int hashCode = (orderHeader == null ? 0 : orderHeader.hashCode()) * 31;
        OrderButtonOverride orderButtonOverride = this.b;
        return hashCode + (orderButtonOverride != null ? orderButtonOverride.hashCode() : 0);
    }

    public final String toString() {
        return "OrderDetailsStep(header=" + this.a + ", orderButtonOverride=" + this.b + Extension.C_BRAKE;
    }

    public OrderDetailsStep() {
        this.a = null;
        this.b = null;
    }
}
