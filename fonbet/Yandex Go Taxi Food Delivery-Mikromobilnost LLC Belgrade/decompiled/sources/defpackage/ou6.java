package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ou6 {
    public final String a;
    public final Integer b;

    public ou6(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou6)) {
            return false;
        }
        ou6 ou6Var = (ou6) obj;
        return jl40.l(this.a, ou6Var.a) && jl40.l(this.b, ou6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Image(url=" + this.a + ", fallbackRes=" + this.b + Extension.C_BRAKE;
    }
}
