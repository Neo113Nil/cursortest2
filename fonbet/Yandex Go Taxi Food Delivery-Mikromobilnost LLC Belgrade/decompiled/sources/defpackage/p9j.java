package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p9j extends gf91 {
    public final vrc p;

    public p9j(vrc vrcVar) {
        this.p = vrcVar;
    }

    public final vrc d() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9j) && this.p.equals(((p9j) obj).p);
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        return "Information(communicationFullScreenViewState=" + this.p + Extension.C_BRAKE;
    }
}
