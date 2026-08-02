package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ehz0 {
    public final String a;
    public final bdc b;
    public final bdc c;
    public final int d;
    public final sls e;

    public ehz0(String str, bdc bdcVar, bdc bdcVar2, int i, sls slsVar) {
        this.a = str;
        this.b = bdcVar;
        this.c = bdcVar2;
        this.d = i;
        this.e = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehz0)) {
            return false;
        }
        ehz0 ehz0Var = (ehz0) obj;
        return jl40.l(this.a, ehz0Var.a) && this.b.equals(ehz0Var.b) && this.c.equals(ehz0Var.c) && this.d == ehz0Var.d && this.e.equals(ehz0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c.a, oyr.b(this.b.a, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoneButtonUiState(text=");
        sb.append(this.a);
        sb.append(", bgColor=");
        sb.append(this.b);
        sb.append(", titleColor=");
        sb.append(this.c);
        sb.append(", typeface=");
        sb.append(this.d);
        sb.append(", onClick=");
        return ly3.r(sb, this.e, Extension.C_BRAKE);
    }
}
