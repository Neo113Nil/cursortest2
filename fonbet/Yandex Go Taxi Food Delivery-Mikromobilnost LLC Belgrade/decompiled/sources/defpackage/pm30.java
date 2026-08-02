package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.MtHubTicket$Type;

/* loaded from: classes14.dex */
public final class pm30 {
    public final MtHubTicket$Type a;
    public final List b;

    public pm30(MtHubTicket$Type mtHubTicket$Type, List list) {
        this.a = mtHubTicket$Type;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm30)) {
            return false;
        }
        pm30 pm30Var = (pm30) obj;
        return this.a == pm30Var.a && jl40.l(this.b, pm30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtHubTicket(type=" + this.a + ", ticketIds=" + this.b + Extension.C_BRAKE;
    }
}
