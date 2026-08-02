package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ari implements cri {
    public final zqi a;
    public final String b;

    public ari(zqi zqiVar, String str) {
        this.a = zqiVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ari)) {
            return false;
        }
        ari ariVar = (ari) obj;
        return this.a.equals(ariVar.a) && jl40.l(this.b, ariVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Timer(content=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
