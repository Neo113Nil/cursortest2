package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ad0 {
    public final Set a;
    public final Set b;

    public ad0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static ad0 a(ad0 ad0Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, int i) {
        LinkedHashSet linkedHashSet3 = linkedHashSet;
        if ((i & 1) != 0) {
            linkedHashSet3 = ad0Var.a;
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet2;
        if ((i & 2) != 0) {
            linkedHashSet4 = ad0Var.b;
        }
        return new ad0(linkedHashSet3, linkedHashSet4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad0)) {
            return false;
        }
        ad0 ad0Var = (ad0) obj;
        return jl40.l(this.a, ad0Var.a) && jl40.l(this.b, ad0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddChatsFolderChanges(includedChatIds=" + this.a + ", includedFilterIds=" + this.b + Extension.C_BRAKE;
    }
}
