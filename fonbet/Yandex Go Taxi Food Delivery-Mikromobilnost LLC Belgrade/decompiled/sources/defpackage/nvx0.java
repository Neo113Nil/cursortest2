package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nvx0 {
    public final boolean a;
    public final Integer b;
    public final Pair c;

    public /* synthetic */ nvx0(boolean z, Integer num, Pair pair, int i) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : pair);
    }

    public static nvx0 a(nvx0 nvx0Var, boolean z, Integer num, Pair pair, int i) {
        if ((i & 1) != 0) {
            z = nvx0Var.a;
        }
        if ((i & 2) != 0) {
            num = nvx0Var.b;
        }
        if ((i & 4) != 0) {
            pair = nvx0Var.c;
        }
        nvx0Var.getClass();
        return new nvx0(z, num, pair);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvx0)) {
            return false;
        }
        nvx0 nvx0Var = (nvx0) obj;
        return this.a == nvx0Var.a && jl40.l(this.b, nvx0Var.b) && jl40.l(this.c, nvx0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Pair pair = this.c;
        return hashCode2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        return "TaxiFeedbackState(isExpired=" + this.a + ", selectedRating=" + this.b + ", selectedTipWithIndex=" + this.c + Extension.C_BRAKE;
    }

    public nvx0(boolean z, Integer num, Pair pair) {
        this.a = z;
        this.b = num;
        this.c = pair;
    }
}
