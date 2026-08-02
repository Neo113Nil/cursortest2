package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bng implements qas0 {
    public final qis a;

    public bng(qis qisVar) {
        this.a = qisVar;
    }

    public final qis a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bng) && this.a.equals(((bng) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFullscreen(entity=" + this.a + Extension.C_BRAKE;
    }
}
