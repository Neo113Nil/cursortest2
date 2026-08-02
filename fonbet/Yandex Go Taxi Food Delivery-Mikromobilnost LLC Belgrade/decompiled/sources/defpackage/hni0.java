package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hni0 {
    public final String a;
    public final String b;

    public hni0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hni0)) {
            return false;
        }
        hni0 hni0Var = (hni0) obj;
        return jl40.l(this.a, hni0Var.a) && jl40.l(this.b, hni0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("ReferenceToButtonEntity(buttonRefId=", this.a, ", itemRefId=", this.b, Extension.C_BRAKE);
    }
}
