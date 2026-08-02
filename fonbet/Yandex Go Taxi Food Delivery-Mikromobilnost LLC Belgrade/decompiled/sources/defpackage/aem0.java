package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aem0 implements fem0 {
    public final String a;
    public final String b;
    public final Throwable c;

    public aem0(int i, String str, Throwable th, String str2) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        th = (i & 4) != 0 ? null : th;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aem0)) {
            return false;
        }
        aem0 aem0Var = (aem0) obj;
        return jl40.l(this.a, aem0Var.a) && jl40.l(this.b, aem0Var.b) && jl40.l(this.c, aem0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AccountInfoError(title=", this.a, ", subtitle=", this.b, ", error=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public aem0() {
        this(7, null, null, null);
    }
}
