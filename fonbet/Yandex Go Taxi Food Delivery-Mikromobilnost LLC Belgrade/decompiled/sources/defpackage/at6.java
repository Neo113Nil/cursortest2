package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class at6 {
    public final r901 a;
    public final os6 b;
    public final e68 c;

    public at6(r901 r901Var, os6 os6Var, e68 e68Var) {
        this.a = r901Var;
        this.b = os6Var;
        this.c = e68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at6)) {
            return false;
        }
        at6 at6Var = (at6) obj;
        return jl40.l(this.a, at6Var.a) && jl40.l(this.b, at6Var.b) && jl40.l(this.c, at6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BuildingCardUiState(trafficState=" + this.a + ", contentState=" + this.b + ", carParksState=" + this.c + Extension.C_BRAKE;
    }
}
