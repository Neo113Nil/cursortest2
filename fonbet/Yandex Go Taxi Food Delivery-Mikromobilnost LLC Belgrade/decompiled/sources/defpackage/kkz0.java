package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kkz0 implements mkz0 {
    public final kdc a;
    public final kdc b;
    public final int c;

    public kkz0(kdc kdcVar, kdc kdcVar2, int i) {
        this.a = kdcVar;
        this.b = kdcVar2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkz0)) {
            return false;
        }
        kkz0 kkz0Var = (kkz0) obj;
        return jl40.l(this.a, kkz0Var.a) && jl40.l(this.b, kkz0Var.b) && this.c == kkz0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + smw0.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Custom(textColor=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", typeface=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
