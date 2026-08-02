package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.ve2;

@gsq0
/* loaded from: classes7.dex */
public final class is81 {
    public static final yo81 Companion = new yo81();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, ve2.w)};
    public final List a;

    public is81(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ki81.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is81) && jl40.l(this.a, ((is81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("PrefetchedMediationData(mediationPrefetchAdapters=", Extension.C_BRAKE, this.a);
    }

    public is81(List list) {
        this.a = list;
    }
}
