package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnmx0;", "Ln96;", "Companion", "mmx0", "lmx0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class nmx0 extends n96 {
    public static final mmx0 Companion = new mmx0();
    public static final nmx0 d = new nmx0(0);
    public final boolean b;
    public final sqk0 c;

    public /* synthetic */ nmx0(int i, boolean z, sqk0 sqk0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = sqk0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmx0)) {
            return false;
        }
        nmx0 nmx0Var = (nmx0) obj;
        return this.b == nmx0Var.b && jl40.l(this.c, nmx0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        sqk0 sqk0Var = this.c;
        return hashCode + (sqk0Var == null ? 0 : sqk0Var.hashCode());
    }

    public final String toString() {
        return "TariffRideTimeAppearanceExperiment(enabled=" + this.b + ", _rideTimeAppearanceOverride=" + this.c + Extension.C_BRAKE;
    }

    public nmx0(int i) {
        this.b = false;
        this.c = null;
    }

    public nmx0() {
        this(0);
    }
}
