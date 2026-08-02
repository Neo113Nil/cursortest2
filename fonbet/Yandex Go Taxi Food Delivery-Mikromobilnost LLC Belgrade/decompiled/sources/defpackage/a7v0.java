package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a7v0 implements d7v0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;
    public final l6v0 f;

    public a7v0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, List list, l6v0 l6v0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = list;
        this.f = l6v0Var;
    }

    @Override // defpackage.d7v0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7v0)) {
            return false;
        }
        a7v0 a7v0Var = (a7v0) obj;
        return jl40.l(this.a, a7v0Var.a) && jl40.l(this.b, a7v0Var.b) && jl40.l(this.c, a7v0Var.c) && jl40.l(this.d, a7v0Var.d) && jl40.l(this.e, a7v0Var.e) && jl40.l(this.f, a7v0Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.c;
        return this.f.hashCode() + unr0.c(smw0.b((hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Content(containerHeaderTitle=", ", title=", ", subtitle=");
        vfc.A(r, this.c, ", distance=", this.d, ", suggestMenuActions=");
        r.append(this.e);
        r.append(", mapState=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
