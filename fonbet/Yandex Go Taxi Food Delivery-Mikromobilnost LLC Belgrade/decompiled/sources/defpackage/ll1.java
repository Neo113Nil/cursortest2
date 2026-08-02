package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ll1 {
    public final String a;
    public final String b;

    public ll1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return jl40.l(this.a, ll1Var.a) && jl40.l(this.b, ll1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("AiAssistantDeeplink(message=", this.a, ", activeMode=", this.b, Extension.C_BRAKE);
    }

    public ll1() {
        this(null, null);
    }
}
