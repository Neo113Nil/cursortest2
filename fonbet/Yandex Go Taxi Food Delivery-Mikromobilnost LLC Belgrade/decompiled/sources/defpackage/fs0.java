package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fs0 {
    public final String a;
    public final iyq b;

    public fs0(String str, iyq iyqVar) {
        this.a = str;
        this.b = iyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return jl40.l(this.a, fs0Var.a) && this.b.equals(fs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressDetailsBubble(text=" + this.a + ", field=" + this.b + Extension.C_BRAKE;
    }
}
