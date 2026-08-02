package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bzu implements pzu {
    public final List a;

    public bzu(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzu) && jl40.l(this.a, ((bzu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MasstransitTickets(tickets=", Extension.C_BRAKE, this.a);
    }

    public bzu() {
        this(EmptyList.a);
    }
}
