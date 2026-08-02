package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class fo20 {
    public static final eo20 Companion = new eo20();
    public final String a;

    public /* synthetic */ fo20(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, do20.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo20) && jl40.l(this.a, ((fo20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("MobGeocodeResponse(countryCode=", this.a, Extension.C_BRAKE);
    }
}
