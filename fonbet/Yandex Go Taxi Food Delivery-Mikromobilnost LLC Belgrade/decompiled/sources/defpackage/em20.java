package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lem20;", "", "Companion", "cm20", "dm20", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class em20 {
    public static final dm20 Companion = new dm20();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new g110(27)), null, null};
    public final boolean a;
    public final Set b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ em20(int i, boolean z, Set set, boolean z2, boolean z3) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = EmptySet.a;
        } else {
            this.b = set;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em20)) {
            return false;
        }
        em20 em20Var = (em20) obj;
        return this.a == em20Var.a && jl40.l(this.b, em20Var.b) && this.c == em20Var.c && this.d == em20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(g8e.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobAvailabilityReportState(isComplete=");
        sb.append(this.a);
        sb.append(", apiNamesToProcess=");
        sb.append(this.b);
        sb.append(", selectProxies=");
        return smw0.k(", optimizePings=", Extension.C_BRAKE, sb, this.c, this.d);
    }

    public em20(boolean z, Set set, boolean z2, boolean z3) {
        this.a = z;
        this.b = set;
        this.c = z2;
        this.d = z3;
    }

    public em20() {
        this(true, EmptySet.a, false, false);
    }
}
