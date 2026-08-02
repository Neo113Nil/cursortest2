package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class aff implements cff {
    public final zzs a;

    public aff(zzs zzsVar) {
        this.a = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aff) && this.a.equals(((aff) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PointOnMapOnly(point=" + this.a + Extension.C_BRAKE;
    }
}
