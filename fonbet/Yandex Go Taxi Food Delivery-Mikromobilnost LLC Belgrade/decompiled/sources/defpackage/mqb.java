package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mqb {
    public final String a;
    public final lqb b;
    public final zpb c;
    public final boolean d;
    public final String e;

    public mqb(String str, lqb lqbVar, zpb zpbVar, boolean z, String str2) {
        this.a = str;
        this.b = lqbVar;
        this.c = zpbVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqb)) {
            return false;
        }
        mqb mqbVar = (mqb) obj;
        return jl40.l(this.a, mqbVar.a) && this.b.equals(mqbVar.b) && this.c.equals(mqbVar.c) && this.d == mqbVar.d && jl40.l(this.e, mqbVar.e);
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipUiState(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", backgroundColors=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", selectedImage=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
