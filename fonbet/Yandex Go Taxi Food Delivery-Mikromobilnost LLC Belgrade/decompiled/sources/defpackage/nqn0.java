package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nqn0 implements qqn0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nqn0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqn0)) {
            return false;
        }
        nqn0 nqn0Var = (nqn0) obj;
        return jl40.l(this.a, nqn0Var.a) && jl40.l(this.b, nqn0Var.b) && jl40.l(this.c, nqn0Var.c) && jl40.l(this.d, nqn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("OnboardingCommunication(leadIconTag=", this.a, ", title=", this.b, ", subtitle="), this.c, ", communicationId=", this.d, Extension.C_BRAKE);
    }
}
