package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class gjr0 extends kr {
    public static final cjr0 Companion = new cjr0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(27))};
    public final List a;

    public /* synthetic */ gjr0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, bjr0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjr0) && jl40.l(this.a, ((gjr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ShareAction(items=", Extension.C_BRAKE, this.a);
    }
}
