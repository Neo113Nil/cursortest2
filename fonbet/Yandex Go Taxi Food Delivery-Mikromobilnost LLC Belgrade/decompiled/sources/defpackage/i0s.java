package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.MtHubTicket$Type;

/* loaded from: classes14.dex */
public final class i0s {
    public final MtHubTicket$Type a;
    public final List b;

    public i0s(MtHubTicket$Type mtHubTicket$Type, List list) {
        this.a = mtHubTicket$Type;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0s)) {
            return false;
        }
        i0s i0sVar = (i0s) obj;
        return this.a == i0sVar.a && jl40.l(this.b, i0sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FooterTicket(type=" + this.a + ", ticketIds=" + this.b + Extension.C_BRAKE;
    }
}
