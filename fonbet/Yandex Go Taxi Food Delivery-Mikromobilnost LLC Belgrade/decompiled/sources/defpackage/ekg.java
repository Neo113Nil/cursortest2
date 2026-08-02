package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ekg {
    public final Point a;
    public final String b;

    public ekg(String str, Point point) {
        this.a = point;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekg)) {
            return false;
        }
        ekg ekgVar = (ekg) obj;
        return jl40.l(this.a, ekgVar.a) && jl40.l(this.b, ekgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IncidentPoint(point=" + this.a + ", address=" + this.b + Extension.C_BRAKE;
    }
}
