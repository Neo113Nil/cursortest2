package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pn1 {
    public final String a;
    public final String b;
    public final s8e0 c;

    public pn1(String str, String str2, s8e0 s8e0Var) {
        this.a = str;
        this.b = str2;
        this.c = s8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        pn1 pn1Var = (pn1) obj;
        return jl40.l(this.a, pn1Var.a) && jl40.l(this.b, pn1Var.b) && jl40.l(this.c, pn1Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        s8e0 s8e0Var = this.c;
        return b + (s8e0Var == null ? 0 : s8e0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("AiChatWidget(iconTag=", this.a, ", deeplink=", this.b, ", popupHint=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
