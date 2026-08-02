package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class okn0 implements qkn0 {
    public final String a;

    public /* synthetic */ okn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof okn0) {
            return jl40.l(this.a, ((okn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PhotoVerificationRequired(storyId=", this.a, Extension.C_BRAKE);
    }
}
