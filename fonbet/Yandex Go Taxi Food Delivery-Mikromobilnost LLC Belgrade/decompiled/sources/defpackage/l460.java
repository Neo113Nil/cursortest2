package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l460 implements o460 {
    public final n360 a;

    public l460(n360 n360Var) {
        this.a = n360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l460) && this.a.equals(((l460) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Lottie(value=" + this.a + Extension.C_BRAKE;
    }
}
