package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class feo {
    public static final eeo Companion = new eeo();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new cao(8))};
    public final List a;

    public /* synthetic */ feo(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, deo.a.getDescriptor());
            throw null;
        }
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feo) && jl40.l(this.a, ((feo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Payload(supportedFeatures=", Extension.C_BRAKE, this.a);
    }
}
