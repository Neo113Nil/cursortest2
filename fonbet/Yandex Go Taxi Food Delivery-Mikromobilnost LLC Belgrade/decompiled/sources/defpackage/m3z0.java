package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m3z0 implements q3z0 {
    public final String a;
    public final List b;

    public m3z0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3z0)) {
            return false;
        }
        m3z0 m3z0Var = (m3z0) obj;
        return jl40.l(this.a, m3z0Var.a) && jl40.l(this.b, m3z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("DeeplinkButtonClicked(deeplink=", this.a, ", extraActions=", Extension.C_BRAKE, this.b);
    }
}
