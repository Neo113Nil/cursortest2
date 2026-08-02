package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pkn0 implements qkn0 {
    public final String a;

    public /* synthetic */ pkn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pkn0) {
            return jl40.l(this.a, ((pkn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PhotoVerificationWithPassportRequired(storyId=", this.a, Extension.C_BRAKE);
    }
}
