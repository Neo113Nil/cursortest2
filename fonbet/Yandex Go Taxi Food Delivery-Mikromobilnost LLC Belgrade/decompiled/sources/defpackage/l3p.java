package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l3p implements k3p {
    public final f0t a;

    public l3p(f0t f0tVar) {
        this.a = f0tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3p) && this.a.equals(((l3p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PushGeoPointAction(geoPosition=" + this.a + Extension.C_BRAKE;
    }
}
