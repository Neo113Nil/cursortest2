package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nge0 implements oge0 {
    public final ahe0 a;

    public nge0(ahe0 ahe0Var) {
        this.a = ahe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nge0) && this.a.equals(((nge0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnboardingThenAuth(model=" + this.a + Extension.C_BRAKE;
    }
}
