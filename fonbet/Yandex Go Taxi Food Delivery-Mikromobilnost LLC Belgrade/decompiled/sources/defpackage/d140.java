package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d140 implements f140 {
    public final String a;
    public final zzs b;

    public d140(zzs zzsVar, String str) {
        this.a = str;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d140)) {
            return false;
        }
        d140 d140Var = (d140) obj;
        return jl40.l(this.a, d140Var.a) && jl40.l(this.b, d140Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "RouteFrom(zoneName=" + this.a + ", stopPoint=" + this.b + Extension.C_BRAKE;
    }
}
