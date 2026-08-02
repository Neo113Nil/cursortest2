package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gxb implements hxb {
    public final CharSequence a;
    public final CharSequence b;
    public final fxb c;

    public gxb(CharSequence charSequence, CharSequence charSequence2, fxb fxbVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = fxbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxb)) {
            return false;
        }
        gxb gxbVar = (gxb) obj;
        return jl40.l(this.a, gxbVar.a) && jl40.l(this.b, gxbVar.b) && jl40.l(this.c, gxbVar.c);
    }

    @Override // defpackage.hxb
    public final CharSequence getSubtitle() {
        return this.b;
    }

    @Override // defpackage.hxb
    public final CharSequence getTitle() {
        return this.a;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        fxb fxbVar = this.c;
        return hashCode2 + (fxbVar != null ? fxbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Loading(title=", ", subtitle=", ", reloadButtonState=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
