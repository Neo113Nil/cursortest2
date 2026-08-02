package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class axi {
    public final Object a;

    public axi(dsw dswVar) {
        this.a = dswVar;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axi) && jl40.l(this.a, ((axi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.p("Initialized(value=", Extension.C_BRAKE, this.a);
    }
}
