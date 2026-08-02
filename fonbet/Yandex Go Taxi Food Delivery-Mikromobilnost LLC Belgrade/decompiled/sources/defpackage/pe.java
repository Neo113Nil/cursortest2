package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pe {
    public final String a;
    public final ve b;

    public pe(String str, ve veVar) {
        this.a = str;
        this.b = veVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        return jl40.l(this.a, peVar.a) && jl40.l(this.b, peVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderAction(orderId=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
