package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class nbr implements ig5 {
    public static final mbr Companion = new mbr();
    public static final i3y[] d;
    public final rbr a;
    public final vm50 b;
    public final vm50 c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new v5r(6)), a.b(lazyThreadSafetyMode, new v5r(7))};
    }

    public /* synthetic */ nbr(int i, rbr rbrVar, vm50 vm50Var, vm50 vm50Var2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, lbr.a.getDescriptor());
            throw null;
        }
        this.a = rbrVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vm50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vm50Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbr)) {
            return false;
        }
        nbr nbrVar = (nbr) obj;
        return jl40.l(this.a, nbrVar.a) && jl40.l(this.b, nbrVar.b) && jl40.l(this.c, nbrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vm50 vm50Var = this.b;
        int hashCode2 = (hashCode + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        vm50 vm50Var2 = this.c;
        return hashCode2 + (vm50Var2 != null ? vm50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "FintechRemoteAction(query=" + this.a + ", fallback=" + this.b + ", onSuccess=" + this.c + Extension.C_BRAKE;
    }
}
