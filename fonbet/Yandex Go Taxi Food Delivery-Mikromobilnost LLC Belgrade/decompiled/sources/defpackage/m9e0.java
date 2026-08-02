package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m9e0 {
    public final String a;
    public final String b;
    public final oae0 c;

    public m9e0(String str, String str2, oae0 oae0Var) {
        this.a = str;
        this.b = str2;
        this.c = oae0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9e0)) {
            return false;
        }
        m9e0 m9e0Var = (m9e0) obj;
        return jl40.l(this.a, m9e0Var.a) && jl40.l(this.b, m9e0Var.b) && this.c.equals(m9e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("PopupModel(id=", this.a, ", relatedPresentationId=", this.b, ", type=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
