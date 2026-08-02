package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cj50 {
    public static final cj50 c = new cj50(0);
    public final List a;
    public final boolean b;

    public cj50(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj50)) {
            return false;
        }
        cj50 cj50Var = (cj50) obj;
        return jl40.l(this.a, cj50Var.a) && this.b == cj50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "NddRouteSwitchButtonsState(nddRouteSwitchButtons=", ", needRefreshButtons=", Extension.C_BRAKE, this.b);
    }

    public cj50() {
        this(0);
    }

    public /* synthetic */ cj50(int i) {
        this(EmptyList.a, false);
    }
}
