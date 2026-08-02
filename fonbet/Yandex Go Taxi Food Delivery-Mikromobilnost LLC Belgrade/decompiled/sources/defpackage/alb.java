package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class alb implements blb {
    public final String a;

    public alb(String str) {
        this.a = str;
    }

    @Override // defpackage.blb
    public final String a() {
        return "open-order";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alb) && jl40.l(this.a, ((alb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 1587290283;
    }

    public final String toString() {
        return oyr.p("OpenOrder(stateKey=open-order, orderId=", this.a, Extension.C_BRAKE);
    }
}
