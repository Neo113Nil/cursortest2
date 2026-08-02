package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mmt0 extends n351 {
    public final List c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public mmt0(List list, Integer num, boolean z, boolean z2) {
        super("spannable-grid", false, 14);
        this.c = list;
        this.d = num;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmt0)) {
            return false;
        }
        mmt0 mmt0Var = (mmt0) obj;
        return jl40.l(this.c, mmt0Var.c) && jl40.l(this.d, mmt0Var.d) && this.e == mmt0Var.e && this.f == mmt0Var.f;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.f) + unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpannableGridState(tiles=");
        sb.append(this.c);
        sb.append(", columns=");
        sb.append(this.d);
        sb.append(", showWhenSectionCollapsed=");
        return smw0.k(", isCollapsed=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
