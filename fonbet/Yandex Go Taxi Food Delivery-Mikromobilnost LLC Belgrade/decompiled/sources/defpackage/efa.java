package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class efa {
    public final CharSequence a;
    public final wp2 b;

    public efa(CharSequence charSequence, wp2 wp2Var) {
        this.a = charSequence;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efa)) {
            return false;
        }
        efa efaVar = (efa) obj;
        return jl40.l(this.a, efaVar.a) && jl40.l(this.b, efaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Badge(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
