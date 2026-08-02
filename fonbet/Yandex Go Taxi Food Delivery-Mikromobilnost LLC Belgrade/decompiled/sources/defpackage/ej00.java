package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ej00 extends bj00 {
    public final cuj0 a;

    public ej00(cuj0 cuj0Var) {
        this.a = cuj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej00) && this.a.equals(((ej00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PinStart(icon=" + this.a + Extension.C_BRAKE;
    }
}
