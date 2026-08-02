package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ac21 extends dc21 {
    public final ps50 a;

    public ac21(ps50 ps50Var) {
        this.a = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac21) && this.a.equals(((ac21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + Extension.C_BRAKE;
    }
}
