package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iak0 implements kak0 {
    public final String a;
    public final int b;

    public iak0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iak0)) {
            return false;
        }
        iak0 iak0Var = (iak0) obj;
        return jl40.l(this.a, iak0Var.a) && this.b == iak0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Change(analyticsName=", this.a, ", selectedRating=", Extension.C_BRAKE);
    }
}
