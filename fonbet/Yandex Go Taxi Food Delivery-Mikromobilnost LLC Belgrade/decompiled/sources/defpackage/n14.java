package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n14 implements p14 {
    public final qis a;

    public n14(qis qisVar) {
        this.a = qisVar;
    }

    public final qis a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n14) && this.a.equals(((n14) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFullscreen(entity=" + this.a + Extension.C_BRAKE;
    }
}
