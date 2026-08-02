package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hss0 implements tss0 {
    public final kdc a;
    public final SlotItemUiState$Trail$AccordionChevron$ChevronState b;

    public hss0(kdc kdcVar, SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState) {
        this.a = kdcVar;
        this.b = slotItemUiState$Trail$AccordionChevron$ChevronState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hss0)) {
            return false;
        }
        hss0 hss0Var = (hss0) obj;
        return this.a.equals(hss0Var.a) && this.b == hss0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AccordionChevron(color=" + this.a + ", chevronState=" + this.b + Extension.C_BRAKE;
    }
}
