package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jx41 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;

    public jx41(String str, String str2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx41)) {
            return false;
        }
        jx41 jx41Var = (jx41) obj;
        return jl40.l(this.a, jx41Var.a) && jl40.l(this.b, jx41Var.b) && jl40.l(this.c, jx41Var.c) && jl40.l(this.d, jx41Var.d) && jl40.l(this.e, jx41Var.e) && jl40.l(this.f, jx41Var.f);
    }

    public final int hashCode() {
        int b = smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        CharSequence charSequence = this.d;
        int b2 = smw0.b((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e);
        CharSequence charSequence2 = this.f;
        return b2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("WheelDatePickerItem(title=", this.a, ", value=", this.b, ", startDescriptionTitle=");
        vfc.A(v, this.c, ", startDescriptionSubtitle=", this.d, ", endDescriptionTitle=");
        v.append((Object) this.e);
        v.append(", endDescriptionSubtitle=");
        v.append((Object) this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
