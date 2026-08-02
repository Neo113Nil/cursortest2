package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c0l0 {
    public final zzs a;
    public final zzs b;

    public c0l0(zzs zzsVar, zzs zzsVar2) {
        this.a = zzsVar;
        this.b = zzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0l0)) {
            return false;
        }
        c0l0 c0l0Var = (c0l0) obj;
        return jl40.l(this.a, c0l0Var.a) && jl40.l(this.b, c0l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Route(srcPoint=" + this.a + ", destPoint=" + this.b + Extension.C_BRAKE;
    }
}
