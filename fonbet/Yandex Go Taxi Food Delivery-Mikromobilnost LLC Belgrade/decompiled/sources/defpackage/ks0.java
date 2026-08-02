package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ks0 {
    public final List a;
    public final jg00 b;

    public ks0(List list, jg00 jg00Var) {
        this.a = list;
        this.b = jg00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return jl40.l(this.a, ks0Var.a) && jl40.l(this.b, ks0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jg00 jg00Var = this.b;
        return hashCode + (jg00Var == null ? 0 : jg00Var.hashCode());
    }

    public final String toString() {
        return "AddressDetailsConfigItem(matches=" + this.a + ", mapConfig=" + this.b + Extension.C_BRAKE;
    }

    public ks0() {
        this(EmptyList.a, null);
    }
}
