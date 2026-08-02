package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fm2 {
    public final hki a;

    public fm2(hki hkiVar) {
        this.a = hkiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm2) && this.a.equals(((fm2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ApartmentAlertInfo(pointType=" + this.a + Extension.C_BRAKE;
    }
}
