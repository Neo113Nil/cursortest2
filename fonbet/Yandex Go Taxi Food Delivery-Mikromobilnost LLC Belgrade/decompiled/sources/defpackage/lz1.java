package defpackage;

import com.yandex.go.slot.dto.SlotButtonDto;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class lz1 {
    public final FormattedText a;
    public final ArrayList b;
    public final SlotButtonDto c;
    public final SlotButtonDto d;

    public lz1(FormattedText formattedText, ArrayList arrayList, SlotButtonDto slotButtonDto, SlotButtonDto slotButtonDto2) {
        this.a = formattedText;
        this.b = arrayList;
        this.c = slotButtonDto;
        this.d = slotButtonDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz1)) {
            return false;
        }
        lz1 lz1Var = (lz1) obj;
        return jl40.l(this.a, lz1Var.a) && this.b.equals(lz1Var.b) && this.c.equals(lz1Var.c) && this.d.equals(lz1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ly3.b(this.a.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "AltpinModalViewData(title=" + this.a + ", items=" + this.b + ", declineButton=" + this.c + ", confirmButton=" + this.d + Extension.C_BRAKE;
    }
}
