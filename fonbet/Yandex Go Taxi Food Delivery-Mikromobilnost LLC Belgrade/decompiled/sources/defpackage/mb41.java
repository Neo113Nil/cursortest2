package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class mb41 {
    public static final lb41 Companion = new lb41();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new b931(28))};
    public final String a;
    public final Map b;

    public /* synthetic */ mb41(int i, String str, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, kb41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb41)) {
            return false;
        }
        mb41 mb41Var = (mb41) obj;
        return jl40.l(this.a, mb41Var.a) && jl40.l(this.b, mb41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("Endpoint(url=", this.a, ", headers=", Extension.C_BRAKE, this.b);
    }
}
