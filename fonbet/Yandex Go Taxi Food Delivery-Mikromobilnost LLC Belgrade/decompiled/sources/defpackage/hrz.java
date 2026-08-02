package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hrz implements jrz {
    public final grz a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final frz e;

    public hrz(grz grzVar, CharSequence charSequence, CharSequence charSequence2, List list, frz frzVar) {
        this.a = grzVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = frzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrz)) {
            return false;
        }
        hrz hrzVar = (hrz) obj;
        return jl40.l(this.a, hrzVar.a) && jl40.l(this.b, hrzVar.b) && jl40.l(this.c, hrzVar.c) && jl40.l(this.d, hrzVar.d) && jl40.l(this.e, hrzVar.e);
    }

    public final int hashCode() {
        grz grzVar = this.a;
        int b = smw0.b((grzVar == null ? 0 : grzVar.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int c = unr0.c((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        frz frzVar = this.e;
        return c + (frzVar != null ? frzVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(image=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", bullets=" + this.d + ", actionButton=" + this.e + Extension.C_BRAKE;
    }
}
