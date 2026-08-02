package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nww0 {
    public final eow0 a;
    public final wp2 b;
    public final fow0 c;
    public final lww0 d;
    public final String e;
    public final String f;

    public nww0(eow0 eow0Var, wp2 wp2Var, fow0 fow0Var, lww0 lww0Var, String str, String str2) {
        this.a = eow0Var;
        this.b = wp2Var;
        this.c = fow0Var;
        this.d = lww0Var;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nww0)) {
            return false;
        }
        nww0 nww0Var = (nww0) obj;
        return this.a.equals(nww0Var.a) && jl40.l(this.b, nww0Var.b) && jl40.l(this.c, nww0Var.c) && jl40.l(this.d, nww0Var.d) && this.e.equals(nww0Var.e) && jl40.l(this.f, nww0Var.f);
    }

    public final int hashCode() {
        int b = n.b(this.b, this.a.hashCode() * 31, 31);
        fow0 fow0Var = this.c;
        int hashCode = (b + (fow0Var == null ? 0 : fow0Var.hashCode())) * 31;
        lww0 lww0Var = this.d;
        return this.f.hashCode() + unr0.b((hashCode + (lww0Var != null ? lww0Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurgeWidgetUiState(surgeBarUiState=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", surgeBlizzardUiState=");
        sb.append(this.c);
        sb.append(", surgeWidgetUiAction=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        return g8e.r(sb, this.e, ", clickActionLabel=", this.f, Extension.C_BRAKE);
    }
}
