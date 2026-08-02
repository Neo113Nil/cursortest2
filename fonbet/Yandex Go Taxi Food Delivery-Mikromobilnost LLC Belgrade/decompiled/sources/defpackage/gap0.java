package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gap0 implements jap0 {
    public final CharSequence a;
    public final CharSequence b;

    public gap0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gap0)) {
            return false;
        }
        gap0 gap0Var = (gap0) obj;
        return jl40.l(this.a, gap0Var.a) && jl40.l(this.b, gap0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Header(title=", ", description=", Extension.C_BRAKE);
    }
}
