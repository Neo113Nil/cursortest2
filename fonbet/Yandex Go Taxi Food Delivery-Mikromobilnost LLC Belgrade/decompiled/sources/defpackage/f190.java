package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f190 {
    public final String a;
    public final ven b;
    public final zzs c;

    public f190(String str, ven venVar, zzs zzsVar) {
        this.a = str;
        this.b = venVar;
        this.c = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f190)) {
            return false;
        }
        f190 f190Var = (f190) obj;
        return jl40.l(this.a, f190Var.a) && jl40.l(this.b, f190Var.b) && this.c.equals(f190Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ven venVar = this.b;
        return this.c.hashCode() + ((hashCode + (venVar != null ? venVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Courier(imageTag=" + this.a + ", placemark=" + this.b + ", location=" + this.c + Extension.C_BRAKE;
    }
}
