package defpackage;

import android.net.Uri;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hpv {
    public final boolean a;
    public final List b;
    public final Uri c;

    public hpv(boolean z, List list, Uri uri) {
        this.a = z;
        this.b = list;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpv)) {
            return false;
        }
        hpv hpvVar = (hpv) obj;
        return this.a == hpvVar.a && jl40.l(this.b, hpvVar.b) && jl40.l(this.c, hpvVar.c);
    }

    public final int hashCode() {
        int c = unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        Uri uri = this.c;
        return c + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "IncidentsAvailabilityConfig(enabled=" + this.a + ", availableIncidents=" + this.b + ", ugcDeeplink=" + this.c + Extension.C_BRAKE;
    }
}
