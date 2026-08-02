package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hgs {
    public final Integer a;
    public final Integer b;

    public hgs(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgs)) {
            return false;
        }
        hgs hgsVar = (hgs) obj;
        return jl40.l(this.a, hgsVar.a) && jl40.l(this.b, hgsVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorResponse(code=" + this.a + ", subcode=" + this.b + Extension.C_BRAKE;
    }
}
