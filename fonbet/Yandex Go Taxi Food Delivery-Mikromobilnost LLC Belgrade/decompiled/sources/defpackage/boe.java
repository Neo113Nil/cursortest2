package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class boe extends trb1 {
    public final doe a;

    public boe(doe doeVar) {
        this.a = doeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boe) && jl40.l(this.a, ((boe) obj).a);
    }

    public final int hashCode() {
        doe doeVar = this.a;
        if (doeVar == null) {
            return 0;
        }
        return doeVar.hashCode();
    }

    public final String toString() {
        return "GeoCoordinateSourceModel(coordinates=" + this.a + Extension.C_BRAKE;
    }
}
