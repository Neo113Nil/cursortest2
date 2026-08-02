package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class exb implements hxb {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;

    public exb(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exb)) {
            return false;
        }
        exb exbVar = (exb) obj;
        return jl40.l(this.a, exbVar.a) && jl40.l(this.b, exbVar.b) && jl40.l(this.c, exbVar.c);
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
        return this.c.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return ly3.s(vfc.r(this.a, this.b, "Content(title=", ", subtitle=", ", items="), this.c, Extension.C_BRAKE);
    }
}
