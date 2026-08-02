package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l1p0 {
    public final CharSequence a;
    public final wp2 b;

    public l1p0(CharSequence charSequence, wp2 wp2Var) {
        this.a = charSequence;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1p0)) {
            return false;
        }
        l1p0 l1p0Var = (l1p0) obj;
        return jl40.l(this.a, l1p0Var.a) && jl40.l(this.b, l1p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrialPeriod(title=" + ((Object) this.a) + ", bgColor=" + this.b + Extension.C_BRAKE;
    }
}
