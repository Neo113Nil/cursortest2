package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dz0 implements kz0 {
    public final zzs a;

    public dz0(zzs zzsVar) {
        this.a = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz0) && jl40.l(this.a, ((dz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PanoramaPickupPointSelected(geoPoint=" + this.a + Extension.C_BRAKE;
    }
}
