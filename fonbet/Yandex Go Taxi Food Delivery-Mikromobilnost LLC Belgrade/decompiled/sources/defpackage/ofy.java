package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ofy {
    public final nfy a;
    public final String b;

    public ofy(nfy nfyVar, String str) {
        this.a = nfyVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofy)) {
            return false;
        }
        ofy ofyVar = (ofy) obj;
        return this.a.equals(ofyVar.a) && jl40.l(this.b, ofyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LimitHintEntity(condition=" + this.a + ", hint=" + this.b + Extension.C_BRAKE;
    }
}
