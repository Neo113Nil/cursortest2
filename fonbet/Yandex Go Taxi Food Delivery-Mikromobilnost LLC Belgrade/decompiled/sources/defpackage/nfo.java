package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nfo {
    public final String a;

    public /* synthetic */ nfo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfo) {
            return jl40.l(this.a, ((nfo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("EventId(value=", this.a, Extension.C_BRAKE);
    }
}
