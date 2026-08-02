package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bhu0 implements ygu0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final eiy d;
    public final eiy e;
    public final frn f;

    public bhu0(String str, CharSequence charSequence, CharSequence charSequence2, eiy eiyVar, eiy eiyVar2, frn frnVar) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = eiyVar;
        this.e = eiyVar2;
        this.f = frnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhu0)) {
            return false;
        }
        bhu0 bhu0Var = (bhu0) obj;
        return jl40.l(this.a, bhu0Var.a) && jl40.l(this.b, bhu0Var.b) && jl40.l(this.c, bhu0Var.c) && jl40.l(this.d, bhu0Var.d) && jl40.l(this.e, bhu0Var.e) && jl40.l(this.f, bhu0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31)) * 31;
        frn frnVar = this.f;
        return hashCode3 + (frnVar != null ? frnVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "StopSectionSelectedItem(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", prevLineType=");
        t.append(this.d);
        t.append(", lineType=");
        t.append(this.e);
        t.append(", ellipse=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
