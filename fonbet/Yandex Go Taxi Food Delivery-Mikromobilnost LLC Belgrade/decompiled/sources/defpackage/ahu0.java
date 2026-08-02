package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ahu0 implements ygu0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final eiy d;
    public final eiy e;
    public final frn f;
    public final boolean g;

    public ahu0(String str, CharSequence charSequence, CharSequence charSequence2, eiy eiyVar, eiy eiyVar2, frn frnVar, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = eiyVar;
        this.e = eiyVar2;
        this.f = frnVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahu0)) {
            return false;
        }
        ahu0 ahu0Var = (ahu0) obj;
        return jl40.l(this.a, ahu0Var.a) && jl40.l(this.b, ahu0Var.b) && jl40.l(this.c, ahu0Var.c) && jl40.l(this.d, ahu0Var.d) && jl40.l(this.e, ahu0Var.e) && jl40.l(this.f, ahu0Var.f) && this.g == ahu0Var.g;
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
        return Boolean.hashCode(this.g) + ((hashCode3 + (frnVar != null ? frnVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "StopSectionItem(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", prevLineType=");
        t.append(this.d);
        t.append(", lineType=");
        t.append(this.e);
        t.append(", ellipse=");
        t.append(this.f);
        t.append(", isSelectable=");
        return x4e.i(t, this.g, Extension.C_BRAKE);
    }
}
