package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.form.slot.SlotLead$LeadIcon$IconStyle;

/* loaded from: classes5.dex */
public final class fts0 implements hts0 {
    public final lvi0 a;
    public final SlotLead$LeadIcon$IconStyle b;

    public fts0(lvi0 lvi0Var, SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle) {
        this.a = lvi0Var;
        this.b = slotLead$LeadIcon$IconStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fts0)) {
            return false;
        }
        fts0 fts0Var = (fts0) obj;
        return this.a.equals(fts0Var.a) && this.b == fts0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle = this.b;
        return hashCode + (slotLead$LeadIcon$IconStyle == null ? 0 : slotLead$LeadIcon$IconStyle.hashCode());
    }

    public final String toString() {
        return "LeadIcon(icon=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
