package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gwv extends iwv {
    public final Throwable a;
    public final String b;
    public final String c;
    public final String d;

    public gwv(String str, String str2, String str3, Throwable th) {
        this.a = th;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwv)) {
            return false;
        }
        gwv gwvVar = (gwv) obj;
        return this.a.equals(gwvVar.a) && jl40.l(this.b, gwvVar.b) && jl40.l(this.c, gwvVar.c) && jl40.l(this.d, gwvVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationNextError(error=");
        sb.append(this.a);
        sb.append(", originDeeplink=");
        sb.append(this.b);
        sb.append(", registrationDeeplink=");
        return g8e.r(sb, this.c, ", actionAfterRegistration=", this.d, Extension.C_BRAKE);
    }
}
