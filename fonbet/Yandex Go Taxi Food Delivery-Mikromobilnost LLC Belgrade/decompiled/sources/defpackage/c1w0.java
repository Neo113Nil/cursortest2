package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c1w0 {
    public final Set a;
    public final boolean b;
    public final boolean c;

    public c1w0(Set set, boolean z, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static c1w0 a(c1w0 c1w0Var, LinkedHashSet linkedHashSet, int i) {
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 1) != 0) {
            linkedHashSet2 = c1w0Var.a;
        }
        boolean z = (i & 2) != 0 ? c1w0Var.b : true;
        boolean z2 = (i & 4) != 0 ? c1w0Var.c : true;
        c1w0Var.getClass();
        c1w0Var.getClass();
        return new c1w0(linkedHashSet2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1w0)) {
            return false;
        }
        c1w0 c1w0Var = (c1w0) obj;
        return jl40.l(this.a, c1w0Var.a) && this.b == c1w0Var.b && this.c == c1w0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppMainOnboardingStatus(showedOnboardings=");
        sb.append(this.a);
        sb.append(", screenChanged=");
        sb.append(this.b);
        sb.append(", userTouched=");
        return x4e.i(sb, this.c, ", shortcutsShowed=false)");
    }
}
