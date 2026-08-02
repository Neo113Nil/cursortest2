package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hsl0 {
    public final String a;
    public final String b;

    public hsl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsl0)) {
            return false;
        }
        hsl0 hsl0Var = (hsl0) obj;
        return jl40.l(this.a, hsl0Var.a) && jl40.l(this.b, hsl0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("SafetyCenterInstructionsDeeplink(orderId=", this.a, ", instructionId=", this.b, Extension.C_BRAKE);
    }

    public hsl0() {
        this(null, null);
    }
}
