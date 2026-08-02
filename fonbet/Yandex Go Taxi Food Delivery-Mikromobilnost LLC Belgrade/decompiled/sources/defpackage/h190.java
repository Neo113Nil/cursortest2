package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h190 {
    public final String a;
    public final zzs b;
    public final h1p c;

    public h190(String str, zzs zzsVar, h1p h1pVar) {
        this.a = str;
        this.b = zzsVar;
        this.c = h1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h190)) {
            return false;
        }
        h190 h190Var = (h190) obj;
        return jl40.l(this.a, h190Var.a) && jl40.l(this.b, h190Var.b) && jl40.l(this.c, h190Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + nnm.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "RestaurantPin(imageTag=" + this.a + ", location=" + this.b + ", service=" + this.c + Extension.C_BRAKE;
    }
}
