package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lxi0 implements sxi0 {
    public final String a;

    public lxi0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxi0) && jl40.l(this.a, ((lxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DeselectObject(objectId=", this.a, Extension.C_BRAKE);
    }
}
