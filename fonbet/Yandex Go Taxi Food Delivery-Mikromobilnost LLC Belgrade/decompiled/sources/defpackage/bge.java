package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bge implements age {
    public final String a;
    public final CharSequence b;

    public bge(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bge)) {
            return false;
        }
        bge bgeVar = (bge) obj;
        return this.a.equals(bgeVar.a) && jl40.l(this.b, bgeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "FooterLeadContent(mainPrice=" + ((Object) this.a) + ", strikethroughPrice=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
