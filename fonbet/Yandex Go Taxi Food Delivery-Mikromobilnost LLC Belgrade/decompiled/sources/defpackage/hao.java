package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hao implements ys11 {
    public final Exception a;

    public hao(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hao) && jl40.l(this.a, ((hao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ErrorVerificationEvent(error=" + this.a + Extension.C_BRAKE;
    }
}
