package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dr9 {
    public final tsa a;

    public dr9(tsa tsaVar) {
        this.a = tsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr9) && this.a.equals(((dr9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenStationDetails(stationNumber=" + this.a + Extension.C_BRAKE;
    }
}
