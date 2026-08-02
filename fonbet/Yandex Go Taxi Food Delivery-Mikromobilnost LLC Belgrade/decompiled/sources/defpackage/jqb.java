package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jqb extends lqb {
    public final CharSequence a;
    public final CharSequence b;

    public jqb(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    @Override // defpackage.lqb
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqb)) {
            return false;
        }
        jqb jqbVar = (jqb) obj;
        return jl40.l(this.a, jqbVar.a) && jl40.l(this.b, jqbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Selectable(text=", ", selectedText=", Extension.C_BRAKE);
    }
}
