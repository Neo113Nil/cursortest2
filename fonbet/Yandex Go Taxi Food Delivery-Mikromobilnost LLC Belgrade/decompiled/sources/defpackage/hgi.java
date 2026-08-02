package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hgi {
    public final String a;
    public final rf70 b;

    public hgi(String str, rf70 rf70Var) {
        this.a = str;
        this.b = rf70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgi)) {
            return false;
        }
        hgi hgiVar = (hgi) obj;
        return jl40.l(this.a, hgiVar.a) && this.b.equals(hgiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryOrderRequirement(name=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
