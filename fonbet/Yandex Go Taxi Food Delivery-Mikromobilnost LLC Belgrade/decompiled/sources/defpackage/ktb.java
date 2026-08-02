package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ktb implements ltb {
    public final nr a;

    public ktb(nr nrVar) {
        this.a = nrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktb) && jl40.l(this.a, ((ktb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithAction(action=" + this.a + Extension.C_BRAKE;
    }
}
