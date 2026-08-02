package defpackage;

import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DividerType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes14.dex */
public final class kpf0 {
    public final CommunicationItem a;
    public final PromoPlaqueItem$DividerType b;
    public final PromoPlaqueItem$DisplayOnType c;

    public kpf0(CommunicationItem communicationItem, PromoPlaqueItem$DividerType promoPlaqueItem$DividerType, PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType) {
        this.a = communicationItem;
        this.b = promoPlaqueItem$DividerType;
        this.c = promoPlaqueItem$DisplayOnType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpf0)) {
            return false;
        }
        kpf0 kpf0Var = (kpf0) obj;
        return jl40.l(this.a, kpf0Var.a) && this.b == kpf0Var.b && this.c == kpf0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PromoPlaqueItem(communicationItem=" + this.a + ", dividerType=" + this.b + ", displayOnType=" + this.c + Extension.C_BRAKE;
    }
}
