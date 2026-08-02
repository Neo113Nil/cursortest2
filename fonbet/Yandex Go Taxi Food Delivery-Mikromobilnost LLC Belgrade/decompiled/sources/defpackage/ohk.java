package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ohk implements phk {
    public final eal a;

    public ohk(eal ealVar) {
        this.a = ealVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohk) && jl40.l(this.a, ((ohk) obj).a);
    }

    public final int hashCode() {
        eal ealVar = this.a;
        if (ealVar == null) {
            return 0;
        }
        return ealVar.hashCode();
    }

    public final String toString() {
        return "Loading(divSkeletonsViewState=" + this.a + Extension.C_BRAKE;
    }

    public ohk() {
        this(null);
    }
}
