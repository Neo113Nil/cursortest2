package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c5j {
    public final CharSequence a;
    public final i9k0 b;

    public c5j(CharSequence charSequence, i9k0 i9k0Var) {
        this.a = charSequence;
        this.b = i9k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5j)) {
            return false;
        }
        c5j c5jVar = (c5j) obj;
        return jl40.l(this.a, c5jVar.a) && this.b.equals(c5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DetailsCardCompleteButtonState(title=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
