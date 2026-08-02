package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cfa implements hfa {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final wj90 d;

    public cfa(String str, CharSequence charSequence, CharSequence charSequence2, wj90 wj90Var) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = wj90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfa)) {
            return false;
        }
        cfa cfaVar = (cfa) obj;
        return jl40.l(this.a, cfaVar.a) && jl40.l(this.b, cfaVar.b) && jl40.l(this.c, cfaVar.c) && jl40.l(this.d, cfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Expired(passId=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", actionButton=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
