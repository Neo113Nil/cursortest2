package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o390 {
    public final Object a;

    public o390(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o390) && jl40.l(this.a, ((o390) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.p("OwnerSeenMarkerChangeObject(transactionPayload=", Extension.C_BRAKE, this.a);
    }

    public o390() {
        this(null);
    }
}
