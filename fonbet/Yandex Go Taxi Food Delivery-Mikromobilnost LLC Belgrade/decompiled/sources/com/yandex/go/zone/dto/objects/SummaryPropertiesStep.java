package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryPropertiesStep;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/n5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SummaryPropertiesStep {
    public static final n5 Companion = new n5();
    public final OrderButtonOverride a;
    public final OrderStepModal b;

    public /* synthetic */ SummaryPropertiesStep(int i, OrderButtonOverride orderButtonOverride, OrderStepModal orderStepModal) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = orderButtonOverride;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = orderStepModal;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OrderButtonOverride getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final OrderStepModal getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryPropertiesStep)) {
            return false;
        }
        SummaryPropertiesStep summaryPropertiesStep = (SummaryPropertiesStep) obj;
        return jl40.l(this.a, summaryPropertiesStep.a) && jl40.l(this.b, summaryPropertiesStep.b);
    }

    public final int hashCode() {
        OrderButtonOverride orderButtonOverride = this.a;
        int hashCode = (orderButtonOverride == null ? 0 : orderButtonOverride.hashCode()) * 31;
        OrderStepModal orderStepModal = this.b;
        return hashCode + (orderStepModal != null ? orderStepModal.hashCode() : 0);
    }

    public final String toString() {
        return "SummaryPropertiesStep(orderButtonOverride=" + this.a + ", orderingStepModal=" + this.b + Extension.C_BRAKE;
    }

    public SummaryPropertiesStep() {
        this.a = null;
        this.b = null;
    }
}
