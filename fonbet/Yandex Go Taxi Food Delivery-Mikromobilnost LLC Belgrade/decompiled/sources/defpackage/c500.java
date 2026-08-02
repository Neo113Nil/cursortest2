package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c500 {
    public final Set a;
    public final Set b;

    public c500(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c500)) {
            return false;
        }
        c500 c500Var = (c500) obj;
        return jl40.l(this.a, c500Var.a) && jl40.l(this.b, c500Var.b);
    }

    public final int hashCode() {
        Set set = this.a;
        return this.b.hashCode() + ((set == null ? 0 : set.hashCode()) * 31);
    }

    public final String toString() {
        return "ExcludedFoldersState(original=" + this.a + ", current=" + this.b + Extension.C_BRAKE;
    }

    public c500() {
        this(0);
    }

    public /* synthetic */ c500(int i) {
        this(null, EmptySet.a);
    }
}
