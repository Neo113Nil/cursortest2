package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class inm0 {
    public final String a;
    public final String b;

    public inm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inm0)) {
            return false;
        }
        inm0 inm0Var = (inm0) obj;
        return jl40.l(this.a, inm0Var.a) && jl40.l(this.b, inm0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("ScheduleRideDeeplink(continuation=", this.a, ", tariffClass=", this.b, Extension.C_BRAKE);
    }

    public inm0() {
        this(null, null);
    }
}
