package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class kz21 {
    public final String a;
    public final s400 b;

    public kz21(String str, s400 s400Var) {
        this.a = str;
        this.b = s400Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kz21) {
            kz21 kz21Var = (kz21) obj;
            return jl40.l(this.a, kz21Var.a) && this.b == kz21Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeRequired(challengeUrl=" + this.a + ", callback=" + this.b + Extension.C_BRAKE;
    }
}
