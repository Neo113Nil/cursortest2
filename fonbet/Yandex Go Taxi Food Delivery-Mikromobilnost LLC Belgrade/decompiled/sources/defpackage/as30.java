package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Las30;", "Lvn11;", "Companion", "zr30", "yr30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class as30 implements vn11 {
    public static final zr30 Companion = new zr30();
    public final Boolean b;
    public final Boolean c;

    public /* synthetic */ as30(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as30)) {
            return false;
        }
        as30 as30Var = (as30) obj;
        return jl40.l(this.b, as30Var.b) && jl40.l(this.c, as30Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.c;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "MtPaymentsUniversalCheckoutExperiment(bleFlowEnabled=" + this.b + ", scheduleFlowEnabled=" + this.c + Extension.C_BRAKE;
    }

    public as30(int i) {
        this.b = null;
        this.c = null;
    }

    public as30() {
        this(0);
    }
}
