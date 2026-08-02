package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hja implements jja {
    public final String a;

    public hja(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hja) && jl40.l(this.a, ((hja) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("GoToTheNextStep(createdOrderId=", this.a, Extension.C_BRAKE);
    }
}
