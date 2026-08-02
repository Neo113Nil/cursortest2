package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryOrderingProcess;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/e1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryOrderingProcess {
    public static final e1 Companion = new e1();
    public final OrderDetailsStep a;
    public final RecipientDetailsStep b;
    public final SummaryPropertiesStep c;

    public /* synthetic */ DeliveryOrderingProcess(int i, OrderDetailsStep orderDetailsStep, RecipientDetailsStep recipientDetailsStep, SummaryPropertiesStep summaryPropertiesStep) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = orderDetailsStep;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = recipientDetailsStep;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = summaryPropertiesStep;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OrderDetailsStep getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final RecipientDetailsStep getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final SummaryPropertiesStep getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryOrderingProcess)) {
            return false;
        }
        DeliveryOrderingProcess deliveryOrderingProcess = (DeliveryOrderingProcess) obj;
        return jl40.l(this.a, deliveryOrderingProcess.a) && jl40.l(this.b, deliveryOrderingProcess.b) && jl40.l(this.c, deliveryOrderingProcess.c);
    }

    public final int hashCode() {
        OrderDetailsStep orderDetailsStep = this.a;
        int hashCode = (orderDetailsStep == null ? 0 : orderDetailsStep.hashCode()) * 31;
        RecipientDetailsStep recipientDetailsStep = this.b;
        int hashCode2 = (hashCode + (recipientDetailsStep == null ? 0 : recipientDetailsStep.hashCode())) * 31;
        SummaryPropertiesStep summaryPropertiesStep = this.c;
        return hashCode2 + (summaryPropertiesStep != null ? summaryPropertiesStep.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryOrderingProcess(orderDetailsStep=" + this.a + ", recipientStep=" + this.b + ", summaryStep=" + this.c + Extension.C_BRAKE;
    }

    public DeliveryOrderingProcess() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
