package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aj00 extends bj00 {
    public final cuj0 a;

    public aj00(cuj0 cuj0Var) {
        this.a = cuj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj00) && this.a.equals(((aj00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PinDestination(icon=" + this.a + Extension.C_BRAKE;
    }
}
