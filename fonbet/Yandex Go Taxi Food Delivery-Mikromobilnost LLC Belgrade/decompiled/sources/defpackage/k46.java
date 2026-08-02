package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class k46 {
    public final String a;
    public final CharSequence b;
    public final g47 c;
    public final g47 d;

    public k46(String str, CharSequence charSequence, g47 g47Var, g47 g47Var2) {
        this.a = str;
        this.b = charSequence;
        this.c = g47Var;
        this.d = g47Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k46)) {
            return false;
        }
        k46 k46Var = (k46) obj;
        return jl40.l(this.a, k46Var.a) && jl40.l(this.b, k46Var.b) && this.c.equals(k46Var.c) && this.d.equals(k46Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "BlockedUserUiState(title=", this.a, ", text=", ", appealButton=");
        t.append(this.c);
        t.append(", changePhoneButton=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
