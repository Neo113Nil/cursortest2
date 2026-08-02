package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dlb0 {
    public final List a;
    public final boolean b;

    public /* synthetic */ dlb0(List list, int i) {
        this((i & 1) != 0 ? EmptyList.a : list, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlb0)) {
            return false;
        }
        dlb0 dlb0Var = (dlb0) obj;
        return jl40.l(this.a, dlb0Var.a) && this.b == dlb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "PhotocommentsModel(items=", ", haveUniqueIds=", Extension.C_BRAKE, this.b);
    }

    public dlb0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public dlb0() {
        this((List) null, 3);
    }
}
