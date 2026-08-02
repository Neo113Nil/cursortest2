package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e501 {
    public final kdc a;
    public final kdc b;
    public final kdc c;
    public final kdc d;

    public e501(kdc kdcVar, kdc kdcVar2, kdc kdcVar3, kdc kdcVar4) {
        this.a = kdcVar;
        this.b = kdcVar2;
        this.c = kdcVar3;
        this.d = kdcVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e501)) {
            return false;
        }
        e501 e501Var = (e501) obj;
        return this.a.equals(e501Var.a) && this.b.equals(e501Var.b) && this.c.equals(e501Var.c) && this.d.equals(e501Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TrackingCardStyledColorsUiState(mapMainScreen=" + this.a + ", superappMainScreen=" + this.b + ", focus=" + this.c + ", long=" + this.d + Extension.C_BRAKE;
    }
}
