package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pd5 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;

    public pd5(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = charSequence5;
        this.f = charSequence6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd5)) {
            return false;
        }
        pd5 pd5Var = (pd5) obj;
        return jl40.l(this.a, pd5Var.a) && jl40.l(this.b, pd5Var.b) && jl40.l(this.c, pd5Var.c) && jl40.l(this.d, pd5Var.d) && jl40.l(this.e, pd5Var.e) && jl40.l(this.f, pd5Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int b = smw0.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        CharSequence charSequence2 = this.d;
        int hashCode2 = (b + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.e;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f;
        return hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "BaseWindowSettingsState(title=", ", description=", ", doneButtonTitle=");
        vfc.A(r, this.c, ", cancelButtonTitle=", this.d, ", doneButtonSubtitle=");
        r.append((Object) this.e);
        r.append(", cancelButtonSubtitle=");
        r.append((Object) this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
