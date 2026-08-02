package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class aze0 {
    public static final aze0 c = new aze0(EmptySet.a, "");
    public final Set a;
    public final String b;

    public aze0(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aze0)) {
            return false;
        }
        aze0 aze0Var = (aze0) obj;
        return jl40.l(this.a, aze0Var.a) && jl40.l(this.b, aze0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PriceComplainState(selectedOptionsIds=" + this.a + ", comment=" + this.b + Extension.C_BRAKE;
    }
}
