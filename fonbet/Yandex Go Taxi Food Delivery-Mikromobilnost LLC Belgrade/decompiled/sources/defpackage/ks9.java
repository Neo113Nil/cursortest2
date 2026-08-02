package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ks9 {
    public static final ks9 e = new ks9(0);
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ks9(List list, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static ks9 a(ks9 ks9Var, boolean z, int i) {
        List list = ks9Var.a;
        boolean z2 = ks9Var.b;
        boolean z3 = (i & 8) != 0 ? ks9Var.d : true;
        ks9Var.getClass();
        return new ks9(list, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks9)) {
            return false;
        }
        ks9 ks9Var = (ks9) obj;
        return jl40.l(this.a, ks9Var.a) && this.b == ks9Var.b && this.c == ks9Var.c && this.d == ks9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDiscountStationsPagingData(stations=");
        sb.append(this.a);
        sb.append(", hasMore=");
        sb.append(this.b);
        sb.append(", isLoadingMore=");
        return smw0.k(", showLoadingError=", Extension.C_BRAKE, sb, this.c, this.d);
    }

    public ks9() {
        this(0);
    }

    public /* synthetic */ ks9(int i) {
        this(EmptyList.a, false, false, false);
    }
}
