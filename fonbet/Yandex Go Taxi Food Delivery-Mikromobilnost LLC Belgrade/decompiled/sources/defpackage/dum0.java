package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dum0 {
    public final CharSequence a;
    public final wp2 b;

    public dum0(CharSequence charSequence, wp2 wp2Var) {
        this.a = charSequence;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dum0)) {
            return false;
        }
        dum0 dum0Var = (dum0) obj;
        return jl40.l(this.a, dum0Var.a) && jl40.l(this.b, dum0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wp2 wp2Var = this.b;
        return hashCode + (wp2Var == null ? 0 : wp2Var.hashCode());
    }

    public final String toString() {
        return "Button(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
