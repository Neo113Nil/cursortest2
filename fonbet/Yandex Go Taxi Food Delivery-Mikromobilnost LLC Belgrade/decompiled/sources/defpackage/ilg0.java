package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ilg0 {
    public final boolean a;
    public final Set b;
    public final Set c;

    public ilg0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.a = z;
        this.b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(boolean z, Class cls) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ilg0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ilg0 ilg0Var = (ilg0) obj;
        return this.a == ilg0Var.a && Objects.equals(this.b, ilg0Var.b) && Objects.equals(this.c, ilg0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuirkSettings{enabledWhenDeviceHasQuirk=");
        sb.append(this.a);
        sb.append(", forceEnabledQuirks=");
        sb.append(this.b);
        sb.append(", forceDisabledQuirks=");
        return qv10.s(sb, this.c, '}');
    }
}
