package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class fc21 extends hc21 {
    public final ps50 a;

    public fc21(ps50 ps50Var) {
        this.a = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc21) && this.a.equals(((fc21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(networkError=" + this.a + Extension.C_BRAKE;
    }
}
