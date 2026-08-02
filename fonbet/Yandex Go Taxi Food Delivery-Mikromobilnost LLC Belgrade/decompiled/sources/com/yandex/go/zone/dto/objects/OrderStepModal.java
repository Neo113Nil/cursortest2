package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/OrderStepModal;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/v2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrderStepModal {
    public static final v2 Companion = new v2();
    public final String a;
    public final String b;
    public final OrderStepModalButton c;
    public final OrderStepModalButton d;

    public /* synthetic */ OrderStepModal(int i, String str, String str2, OrderStepModalButton orderStepModalButton, OrderStepModalButton orderStepModalButton2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new OrderStepModalButton(0);
        } else {
            this.c = orderStepModalButton;
        }
        if ((i & 8) == 0) {
            this.d = new OrderStepModalButton(0);
        } else {
            this.d = orderStepModalButton2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OrderStepModalButton getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final OrderStepModalButton getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStepModal)) {
            return false;
        }
        OrderStepModal orderStepModal = (OrderStepModal) obj;
        return jl40.l(this.a, orderStepModal.a) && jl40.l(this.b, orderStepModal.b) && jl40.l(this.c, orderStepModal.c) && jl40.l(this.d, orderStepModal.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.a.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderStepModal(title=", this.a, ", description=", this.b, ", confirmButton=");
        v.append(this.c);
        v.append(", cancelButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public OrderStepModal() {
        OrderStepModalButton orderStepModalButton = new OrderStepModalButton(0);
        OrderStepModalButton orderStepModalButton2 = new OrderStepModalButton(0);
        this.a = "";
        this.b = null;
        this.c = orderStepModalButton;
        this.d = orderStepModalButton2;
    }
}
