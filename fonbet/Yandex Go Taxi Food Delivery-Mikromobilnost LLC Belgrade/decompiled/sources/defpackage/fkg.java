package defpackage;

import com.yandex.go.navigator.incidents.IncidentType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fkg {
    public final IncidentType a;
    public final ekg b;

    public fkg(IncidentType incidentType, ekg ekgVar) {
        this.a = incidentType;
        this.b = ekgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkg)) {
            return false;
        }
        fkg fkgVar = (fkg) obj;
        return this.a == fkgVar.a && this.b.equals(fkgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IncidentState(selectedIncident=" + this.a + ", selectedPoint=" + this.b + Extension.C_BRAKE;
    }
}
