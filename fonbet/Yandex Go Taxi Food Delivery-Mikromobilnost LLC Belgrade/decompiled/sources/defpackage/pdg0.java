package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pdg0 implements qdg0 {
    public final String a;

    public pdg0(String str) {
        this.a = str;
    }

    @Override // defpackage.qdg0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdg0) && jl40.l(this.a, ((pdg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("NotHandled(qrCategory=", this.a, Extension.C_BRAKE);
    }
}
