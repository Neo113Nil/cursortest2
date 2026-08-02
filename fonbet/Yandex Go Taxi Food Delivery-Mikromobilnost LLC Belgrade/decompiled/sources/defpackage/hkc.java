package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class hkc {
    public static final gkc Companion = new gkc();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(16))};
    public final List a;

    public /* synthetic */ hkc(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, fkc.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkc) && jl40.l(this.a, ((hkc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Payload(features=", Extension.C_BRAKE, this.a);
    }

    public hkc(ArrayList arrayList) {
        this.a = arrayList;
    }
}
