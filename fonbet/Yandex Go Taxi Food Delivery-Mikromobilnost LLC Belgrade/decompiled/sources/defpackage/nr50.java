package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class nr50 extends pr50 {
    public final ps50 a;

    public nr50(ps50 ps50Var) {
        this.a = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr50) && this.a.equals(((nr50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(networkError=" + this.a + Extension.C_BRAKE;
    }
}
