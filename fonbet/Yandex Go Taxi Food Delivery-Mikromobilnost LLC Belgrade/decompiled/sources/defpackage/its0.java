package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.SlotLeadModel$LeadIcon$IconStyle;

/* loaded from: classes5.dex */
public final class its0 implements lts0 {
    public final sbv a;
    public final SlotLeadModel$LeadIcon$IconStyle b;

    public its0(sbv sbvVar, SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle) {
        this.a = sbvVar;
        this.b = slotLeadModel$LeadIcon$IconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof its0)) {
            return false;
        }
        its0 its0Var = (its0) obj;
        return this.a.equals(its0Var.a) && this.b == its0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle = this.b;
        return hashCode + (slotLeadModel$LeadIcon$IconStyle == null ? 0 : slotLeadModel$LeadIcon$IconStyle.hashCode());
    }

    public final String toString() {
        return "LeadIcon(icon=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
