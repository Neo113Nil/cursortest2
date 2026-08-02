package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cca implements e6v {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;

    public cca(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cca)) {
            return false;
        }
        cca ccaVar = (cca) obj;
        return jl40.l(this.a, ccaVar.a) && jl40.l(this.b, ccaVar.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Item(title=", ", value=", Extension.C_BRAKE);
    }
}
