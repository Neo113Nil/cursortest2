package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgrk0;", "Lkrk0;", "Companion", "erk0", "frk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class grk0 extends krk0 {
    public static final frk0 Companion = new frk0();
    public final String a;
    public final SlotItemDto b;

    public grk0(int i, String str, SlotItemDto slotItemDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grk0)) {
            return false;
        }
        grk0 grk0Var = (grk0) obj;
        return jl40.l(this.a, grk0Var.a) && jl40.l(this.b, grk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotItemDto slotItemDto = this.b;
        return hashCode + (slotItemDto == null ? 0 : slotItemDto.hashCode());
    }

    public final String toString() {
        return "SavedRide(rideId=" + this.a + ", slot=" + this.b + Extension.C_BRAKE;
    }

    public grk0() {
        this.a = "";
        this.b = null;
    }
}
