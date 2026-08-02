package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class isc implements ksc {
    public final kdc a;
    public final CharSequence b;
    public final String c;

    public isc(kdc kdcVar, CharSequence charSequence, String str) {
        this.a = kdcVar;
        this.b = charSequence;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isc)) {
            return false;
        }
        isc iscVar = (isc) obj;
        return jl40.l(this.a, iscVar.a) && jl40.l(this.b, iscVar.b) && jl40.l(this.c, iscVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeeplinkArrowButton(navColor=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", deeplink=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
