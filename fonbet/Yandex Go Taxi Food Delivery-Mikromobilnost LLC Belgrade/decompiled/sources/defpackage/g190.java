package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class g190 {
    public final String a;
    public final zzs b;

    public g190(zzs zzsVar, String str) {
        this.a = str;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g190)) {
            return false;
        }
        g190 g190Var = (g190) obj;
        return jl40.l(this.a, g190Var.a) && jl40.l(this.b, g190Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "DestinationPin(imageTag=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }
}
