package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iwc {
    public final long a;

    public /* synthetic */ iwc(long j) {
        this.a = j;
    }

    public static final /* synthetic */ iwc a() {
        return new iwc(0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iwc) {
            return this.a == ((iwc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "Azimuth(packedValue=", Extension.C_BRAKE);
    }
}
