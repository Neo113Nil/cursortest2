package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcrk0;", "Lkrk0;", "Companion", "ark0", "brk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class crk0 extends krk0 {
    public static final brk0 Companion = new brk0();
    public final SlotItemDto a;

    public crk0(int i, SlotItemDto slotItemDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crk0) && jl40.l(this.a, ((crk0) obj).a);
    }

    public final int hashCode() {
        SlotItemDto slotItemDto = this.a;
        if (slotItemDto == null) {
            return 0;
        }
        return slotItemDto.hashCode();
    }

    public final String toString() {
        return "Info(slot=" + this.a + Extension.C_BRAKE;
    }

    public crk0() {
        this.a = null;
    }
}
