package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class egc {
    public final ufc a;
    public final ufc b;

    public egc(ufc ufcVar, ufc ufcVar2) {
        this.a = ufcVar;
        this.b = ufcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egc)) {
            return false;
        }
        egc egcVar = (egc) obj;
        return this.a.equals(egcVar.a) && this.b.equals(egcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorSettings(normalMode=" + this.a + ", invertMode=" + this.b + Extension.C_BRAKE;
    }
}
