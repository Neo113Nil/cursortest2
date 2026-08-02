package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k0s {
    public final String a;
    public final String b;
    public final pzu c;

    public k0s(String str, String str2, pzu pzuVar) {
        this.a = str;
        this.b = str2;
        this.c = pzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0s)) {
            return false;
        }
        k0s k0sVar = (k0s) obj;
        return jl40.l(this.a, k0sVar.a) && jl40.l(this.b, k0sVar.b) && jl40.l(this.c, k0sVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        pzu pzuVar = this.c;
        return b + (pzuVar == null ? 0 : pzuVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("FooterTrailingItemUiState(iconTag=", this.a, ", iconUrl=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
