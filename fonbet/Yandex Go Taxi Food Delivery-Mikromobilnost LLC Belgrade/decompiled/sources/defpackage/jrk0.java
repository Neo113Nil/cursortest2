package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljrk0;", "Lkrk0;", "Companion", "hrk0", "irk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class jrk0 extends krk0 {
    public static final irk0 Companion = new irk0();
    public final String a;
    public final SlotItemDto b;

    public jrk0(int i, String str, SlotItemDto slotItemDto) {
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
        if (!(obj instanceof jrk0)) {
            return false;
        }
        jrk0 jrk0Var = (jrk0) obj;
        return jl40.l(this.a, jrk0Var.a) && jl40.l(this.b, jrk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SlotItemDto slotItemDto = this.b;
        return hashCode + (slotItemDto == null ? 0 : slotItemDto.hashCode());
    }

    public final String toString() {
        return "SuggestedRide(orderId=" + this.a + ", slot=" + this.b + Extension.C_BRAKE;
    }

    public jrk0() {
        this.a = "";
        this.b = null;
    }
}
