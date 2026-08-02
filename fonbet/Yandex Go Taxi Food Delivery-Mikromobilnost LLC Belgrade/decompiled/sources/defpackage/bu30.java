package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bu30 {
    public static final bu30 c = new bu30(EmptyList.a, false);
    public final List a;
    public final boolean b;

    public bu30(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu30)) {
            return false;
        }
        bu30 bu30Var = (bu30) obj;
        return this.a.equals(bu30Var.a) && this.b == bu30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "PurchaseMatches(items=", ", usedDefaultFallback=", Extension.C_BRAKE, this.b);
    }
}
