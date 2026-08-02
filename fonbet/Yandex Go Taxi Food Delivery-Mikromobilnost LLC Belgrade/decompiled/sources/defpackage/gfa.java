package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gfa implements hfa {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final ffa d;
    public final wj90 e;
    public final efa f;

    public gfa(String str, CharSequence charSequence, CharSequence charSequence2, ffa ffaVar, wj90 wj90Var, efa efaVar) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = ffaVar;
        this.e = wj90Var;
        this.f = efaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfa)) {
            return false;
        }
        gfa gfaVar = (gfa) obj;
        return jl40.l(this.a, gfaVar.a) && jl40.l(this.b, gfaVar.b) && jl40.l(this.c, gfaVar.c) && jl40.l(this.d, gfaVar.d) && jl40.l(this.e, gfaVar.e) && jl40.l(this.f, gfaVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        wj90 wj90Var = this.e;
        int hashCode2 = (hashCode + (wj90Var == null ? 0 : wj90Var.hashCode())) * 31;
        efa efaVar = this.f;
        return hashCode2 + (efaVar != null ? efaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Regular(passId=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", progress=");
        t.append(this.d);
        t.append(", trail=");
        t.append(this.e);
        t.append(", badge=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
