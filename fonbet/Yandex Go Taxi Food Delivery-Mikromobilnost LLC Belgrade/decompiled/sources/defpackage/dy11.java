package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class dy11 {
    public static final dy11 c = new dy11(0, EmptySet.a);
    public final int a;
    public final Set b;

    public dy11(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy11)) {
            return false;
        }
        dy11 dy11Var = (dy11) obj;
        return this.a == dy11Var.a && jl40.l(this.b, dy11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TrackingState(simpleTrigger=" + this.a + ", forceServicesTrigger=" + this.b + Extension.C_BRAKE;
    }
}
