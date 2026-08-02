package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a940 implements i940 {
    public final String a;

    public a940(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a940) && jl40.l(this.a, ((a940) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ExpirationAnimationConsumed(ticketId=", this.a, Extension.C_BRAKE);
    }
}
