package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eu41 extends mm91 {
    public final Throwable b;
    public final Integer c;

    public eu41(Throwable th, Integer num) {
        this.b = th;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu41)) {
            return false;
        }
        eu41 eu41Var = (eu41) obj;
        return jl40.l(this.b, eu41Var.b) && jl40.l(this.c, eu41Var.c);
    }

    public final int hashCode() {
        Throwable th = this.b;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        Integer num = this.c;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Error(throwable=" + this.b + ", errorCode=" + this.c + Extension.C_BRAKE;
    }
}
