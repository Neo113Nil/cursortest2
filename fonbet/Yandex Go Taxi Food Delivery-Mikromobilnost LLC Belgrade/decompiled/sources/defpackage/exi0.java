package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class exi0 extends kr {
    public static final dxi0 Companion = new dxi0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(5))};
    public final List a;

    public /* synthetic */ exi0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, cxi0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && exi0.class == obj.getClass() && jl40.l(this.a, ((exi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("RemoveSectionsAction(sectionIds=", Extension.C_BRAKE, this.a);
    }
}
