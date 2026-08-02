package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ajm {
    public final long a;
    public final zim b;

    public ajm(long j, zim zimVar) {
        this.a = j;
        this.b = zimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajm)) {
            return false;
        }
        ajm ajmVar = (ajm) obj;
        return this.a == ajmVar.a && this.b.equals(ajmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DriverPointDrawData(drawTimestamp=" + this.a + ", pointData=" + this.b + Extension.C_BRAKE;
    }
}
