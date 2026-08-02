package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class co20 {
    public static final bo20 Companion = new bo20();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new um20(2))};
    public final List a;

    public /* synthetic */ co20(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ao20.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co20) && jl40.l(this.a, ((co20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MobGeocodeParams(coords=", Extension.C_BRAKE, this.a);
    }

    public co20(List list) {
        this.a = list;
    }
}
