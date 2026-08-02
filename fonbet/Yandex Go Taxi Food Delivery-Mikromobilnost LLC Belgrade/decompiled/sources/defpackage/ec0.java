package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ec0 {
    public final Set a;
    public final Set b;

    public ec0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return jl40.l(this.a, ec0Var.a) && jl40.l(this.b, ec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddChatsFolderArgs(includedFilterIds=" + this.a + ", includedChatIds=" + this.b + Extension.C_BRAKE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ec0(int i) {
        this(r1, r1);
        EmptySet emptySet = EmptySet.a;
    }

    public ec0() {
        this(0);
    }
}
