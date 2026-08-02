package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class as5 {
    public final gq5 a;
    public final vq5 b;
    public final boolean c;
    public final kp5 d;
    public final ewz0 e;
    public final jh00 f;
    public final int g;

    public as5(gq5 gq5Var, vq5 vq5Var, boolean z, kp5 kp5Var, ewz0 ewz0Var, jh00 jh00Var, int i) {
        this.a = gq5Var;
        this.b = vq5Var;
        this.c = z;
        this.d = kp5Var;
        this.e = ewz0Var;
        this.f = jh00Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as5)) {
            return false;
        }
        as5 as5Var = (as5) obj;
        return jl40.l(this.a, as5Var.a) && jl40.l(this.b, as5Var.b) && this.c == as5Var.c && jl40.l(this.d, as5Var.d) && jl40.l(this.e, as5Var.e) && jl40.l(this.f, as5Var.f) && this.g == as5Var.g;
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        kp5 kp5Var = this.d;
        int hashCode = (this.e.hashCode() + ((e + (kp5Var == null ? 0 : kp5Var.hashCode())) * 31)) * 31;
        jh00 jh00Var = this.f;
        return Integer.hashCode(this.g) + ((hashCode + (jh00Var != null ? jh00Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidsUiState(driveCardUiState=");
        sb.append(this.a);
        sb.append(", bidsListUiState=");
        sb.append(this.b);
        sb.append(", isExtendedUi=");
        sb.append(this.c);
        sb.append(", boostButtonUiState=");
        sb.append(this.d);
        sb.append(", topContentHeight=");
        sb.append(this.e);
        sb.append(", mapDecorationUiState=");
        sb.append(this.f);
        sb.append(", ridaHeaderHeightPx=");
        return oyr.m(this.g, Extension.C_BRAKE, sb);
    }
}
